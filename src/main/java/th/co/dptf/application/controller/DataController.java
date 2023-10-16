package th.co.dptf.application.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import th.co.dptf.application.entity.Data;
import th.co.dptf.application.service.DataService;


@RestController
@RequestMapping("/api")
public class DataController {

	@Autowired
	private DataService dataService;
	
	@GetMapping
    public List<Data> getStudents(){
        return  dataService.getData();
    }
	
	@PostMapping("/add_job")
	public Object AddData(@RequestBody Data data) {
		return dataService.AddData(data);
	}
	
	@PostMapping("/update_job")
	public Object UpdateData(@RequestBody HashMap<String,String> info) {
//		System.out.println(" ---");
//		String userorg = info.get("username_org");
//		String dat = info.get("createdAt");
		String js = info.get("jobspec");
		String dpg = info.get("dpcgroup");
		String dpcno = info.get("dpcno");
		int as = Integer.parseInt(dpcno);

		return dataService.UpdateData(js,dpg,as);
		
	}
	
	@PostMapping("/delete_job")
	public Object DeleteData(@RequestBody HashMap<String,Integer> info) {
		int dpcno = info.get("dpcno");
		return dataService.DeleteData(dpcno);
	}
	
	@PostMapping("/list")
	public Object GetDataList(@RequestBody HashMap<String,Integer> info) {
//		System.out.println(" ---");
		int page = info.get("page");
		System.out.println(page);
		return dataService.Datalist(page);
	}
	
//	@PostMapping("/chang_password")
//	public Object ResetPassword(@RequestBody HashMap<String,String> info) {
//		String pwd = info.get("password");
//		String id = info.get("id");
//		int as = Integer.parseInt(id);
//				
////		System.out.println();
//		return dataService.ResetPassword(pwd, as);
//	}
//	
//	@PostMapping("/list")
//	public Object GetUserList(@RequestBody HashMap<String,Integer> info) {
////		System.out.println(" ---");
//		int page = info.get("page");
//		System.out.println(page);
//		return userService.Userlist(page);
//	}
//	

//	

}
