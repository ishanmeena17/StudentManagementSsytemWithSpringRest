package smswithspringrest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import smswithspringrest.pojo.Admin;
import smswithspringrest.response.AdminResponse;
import smswithspringrest.response.StudentResponse;
import smswithspringrest.service.AdminService;

@Controller @ResponseBody
public class AdminController {
	@Autowired
	private AdminService adminService;

	@PostMapping(path="/admin" ,consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<AdminResponse> addAdmin(Admin admin){
		Admin admin2 = adminService.addAdmin(admin);
		
		AdminResponse adminResponse=new AdminResponse();
		adminResponse.setMessage("admin added");
		adminResponse.setAdmin(admin2);
		//adminResponse.setadmins(null);
		adminResponse.setStatus(HttpStatus.CREATED.value());
		return new ResponseEntity<AdminResponse>(adminResponse, HttpStatus.CREATED);
		
		
	}
}
