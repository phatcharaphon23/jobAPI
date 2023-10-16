package th.co.dptf.application.service;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import th.co.dptf.application.entity.Data;
import th.co.dptf.application.entity.PaginationCustmize;
import th.co.dptf.application.entity.RsponseCustomize;
import th.co.dptf.application.repository.DataRepository;

@Service
@Transactional
public class DataService {
	

	@Autowired
	private DataRepository dataRepository;

	public List<Data> getData(){
        return dataRepository.findAll();
    }
	
	//Add data 
	public RsponseCustomize AddData(Data data) {
		RsponseCustomize re = new RsponseCustomize();
		re.setSuccess(true);
		re.setMessege("Add user successful");
		try { 
			Data exist = dataRepository.dataExits(data.getJobspec().trim());
			if (exist == null) {
				int save = dataRepository.addData(data.getDpcno(),data.getJobspec(),  data.getDpcgroup());
			} else {
//				re.setUsername("UserExist");
				re.setSuccess(false);
				re.setMessege("UserExist");
			}
//			
		} catch (Exception ex) {
//			System.out.println(ex);
			re.setSuccess(false);
			re.setMessege(ex.getMessage());
		}
		return re;
		
	}
	
	//Update data
	public RsponseCustomize UpdateData(String jobspec,String dpcgroup ,int dpcno) {
		// TODO Auto-generated method stub
		RsponseCustomize re = new RsponseCustomize();
		re.setSuccess(false);
		re.setMessege("Update users faild");
		
		try {
			int updateData = dataRepository.updateData(jobspec,dpcgroup,dpcno);
		if(updateData >0) {
		re.setSuccess(true);
		re.setMessege("Update user succesfull");
			}
		}catch (Exception ex) {
//				System.out.println(ex);
			re.setSuccess(false);
			re.setMessege(ex.getMessage());
		}
		return re;
	}
	
	//Delete Data
	public RsponseCustomize DeleteData(int dpcno) {
		RsponseCustomize re = new RsponseCustomize();
		re.setSuccess(false);
		re.setMessege("Delete user faild!");
		try { 
			int deletedata = dataRepository.deletedata(dpcno);
			if (deletedata > 0) {
				re.setSuccess(true);
				re.setMessege("Delete success");
			}
		
		} catch (Exception ex) {
			System.out.println(ex);
		}
		return re;
		
	}
	
	//List data
	public RsponseCustomize Datalist(int page){
		RsponseCustomize re = new RsponseCustomize();
		PaginationCustmize info = new PaginationCustmize();
		int rows = dataRepository.countRows();
		int pages = (int) Math.ceil((float) rows / 10);
		int fetch = page * 10;
		int start = fetch - 10;
		List<Data> List = dataRepository.dataLists(start, fetch-1);

		info.setPages(pages);
		info.setPage(page);
		info.setInfo(List);

		re.setSuccess(true);
		re.setMessege(info);

		return re;
	}
}
