package th.co.dptf.application.entity;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
//import javax.persistence.Temporal;
//import javax.persistence.TemporalType;
//
//import org.hibernate.annotations.CreationTimestamp;
//import org.hibernate.annotations.UpdateTimestamp;


@Entity
@Table(name = "dpc")
public class Data {
	
	@Id
	@Column(name="dpcno")
	private int dpcno;
	
	@Column(name="jobspec")
	private String jobspec;
	
	@Column(name="dpcgroup")
	private String dpcgroup;
	
	@Column(name="status")
	private String status;
	
	@Column(name="customers")
	private String customers;
	
	@Column(name="productname")
	private String productname;
	
	@Column(name="requestby")
	private String requestby;

	@Column(name="finish")
	private String finish;
	
	@Column(name="complete")
	private String complete;
	
	@Column(name="operator_id")
	private String operator_id;
	
	//
	@Column(name="urfilm")
	private String urfilm;
	
	@Column(name="urnormal")
	private String urnormal;
	
	@Column(name="cancel")
	private String cancel;
	
	@Column(name="design")
	private String design;
	
	@Column(name="composaw")
	private String composaw;
	
	@Column(name="readyaw")
	private String readyaw;
	
	@Column(name="printpc")
	private String printpc;
	
	@Column(name="otherreason")
	private String otherreason;
	
	@Column(name="sequenceerror")
	private String sequenceerror;

	public Data() {}

	/**
	 * @param id
	 * @param username
	 * @param password
	 * @param update_at
	 */
	public Data(int dpcno, String jobspec, String dpcgroup, String status, String customers,String productname,String requestby,String finish, String complete, String operator_id,
			String urfilm, String urnormal, String cancel, String design,String composaw, String readyaw, String printpc, String otherreason ,String sequenceerror
			) {
		this.dpcno = dpcno;
		this.jobspec = jobspec;
		this.dpcgroup = dpcgroup;
		this.status = status;
		this.customers = customers;
		this.productname = productname;
		this.requestby = requestby;
		this.finish = finish;
		this.complete =complete;
		this.operator_id = operator_id;
		this.urfilm = urfilm;
		this.urnormal = urnormal;
		this.cancel = cancel;
		this.design = design;
		this.composaw = composaw;
		this.readyaw = readyaw;
		this.printpc =printpc;
		this.otherreason =otherreason;
		this.sequenceerror = sequenceerror;

//		this.totcor = totcor;
	
	}

	public int getDpcno() {
		return dpcno;
	}

	public void setDpcno(int dpcno) {
		this.dpcno = dpcno;
	}

	public String getJobspec() {
		return jobspec;
	}

	public void setJobspec(String jobspec) {
		this.jobspec = jobspec;
	}

	public String getDpcgroup() {
		return dpcgroup;
	}

	public void setDpcgroup(String dpcgroup) {
		this.dpcgroup = dpcgroup;
	}
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getCustomers() {
		return customers;
	}

	public void setCustomers(String customers) {
		this.customers = customers;
	}
	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getRequestby() {
		return requestby;
	}

	public void setRequestby(String requestby) {
		this.requestby = requestby;
	}
	
	public String getFinish() {
		return finish;
	}

	public void setFinish(String finish) {
		this.finish = finish;
	}
	public String getComplete() {
		return complete;
	}

	public void setComplete(String complete) {
		this.complete = complete;
	}
	public String getOperatorId() {
		return operator_id;
	}

	public void setOperatorId(String operator_id) {
		this.operator_id = operator_id;
	}

	public String getUrfilm() {
		return urfilm;
	}
	
	public void setUrfilm(String urfilm) {
		this.urfilm = urfilm;
	}
	public String getUrnormal() {
		return urnormal;
	}
	public void setUrnormal(String urnormal) {
		this.urnormal = urnormal;
	}
	public String getCancel() {
		return cancel;
	}
	
	public void setCancel(String cancel) {
		this.cancel = cancel;
	}

	public String getDesign() {
		return design;
	}
	public void setDesign(String design) {
		this.design = design;
	}
	
	public String getComposaw() {
		return composaw;
	}
	public void setComposaw(String composaw) {
		this.composaw = composaw;
	}
	
	public String getReadyaw() {
		return readyaw;
	}
	public void setReadyaw(String readyaw) {
		this.readyaw = readyaw;
	}

	public String getprintpc() {
		return printpc;
	}
	public void setv(String printpc) {
		this.printpc = printpc;
	}
	
	public String getOtherreason() {
		return otherreason;
	}
	public void setOtherreason(String otherreason) {
		this.otherreason = otherreason;
	}
	
	public String getSequenceerror() {
		return sequenceerror;
	}
	public void setSequenceerror(String sequenceerror) {
		this.sequenceerror = sequenceerror;
	}
	
	
//	public Date getDpcdate() {
//		return dpc_date;
//	}
//
//	public void setDpcdate(Date dpc_date) {
//		this.dpc_date = dpc_date;
//	}

}
