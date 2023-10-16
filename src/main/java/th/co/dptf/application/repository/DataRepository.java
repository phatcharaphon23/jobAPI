package th.co.dptf.application.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import th.co.dptf.application.entity.Data;


@Repository
public interface DataRepository extends JpaRepository<Data, Long>{

	@Query(value= "SELECT * FROM dpc", nativeQuery=true)
	List<Data> dataList();
	
//	เงื่อนไข
	@Query(value= "SELECT * FROM dpc WHERE jobspec =?1", nativeQuery=true)
	Data dataExits(String jobspec);

	@Query(value= "SELECT count(jobspec) FROM dpc WHERE jobspec =?1", nativeQuery=true)
	int dataexits(String jobspec);
	
//	เพิ่มข้อมูล 
	@Modifying(clearAutomatically=true)
	@Query(value= "INSERT INTO dpc (dpcno, jobspec, dpcgroup) VALUES (?1, ?2, ?3)", nativeQuery=true)
	int addData(int dpcno, String jobspec, String dpcgroup);
	
//	changPassword
	@Modifying(clearAutomatically=true)
	@Query(value= "UPDATE dpc SET dpc_group = ?1 WHERE dpcno = ?2", nativeQuery=true)
	int resetPassword(String dpcgroup,int dpcno);

//	Page
	@Query(value= "SELECT * FROM (SELECT ROW_NUMBER() OVER (ORDER BY jobspec) AS seq, * FROM dpc) AS SUB WHERE SUB.seq >=?1 AND SUB.seq <=?2",nativeQuery=true)
	List<Data> dataLists(int start, int end);
	
	@Query(value= "SELECT COUNT(jobspec) FROM dpc",nativeQuery = true)
	int countRows();
	
	@Modifying(clearAutomatically=true)
	@Query(value= "DELETE FROM dpc WHERE dpcno=?1", nativeQuery=true)
	int deletedata(int dpcno);
	
	//update
	@Modifying(clearAutomatically=true)
	@Query(value= "UPDATE dpc SET jobspec = ?1,dpcgroup = ?2 WHERE dpcno = ?3", nativeQuery=true)
	int updateData(String jobspec,String dpcgroup, int dpcno);
	
	
}
