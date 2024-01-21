package smswithspringrest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import smswithspringrest.pojo.Admin;
import smswithspringrest.repository.AdminRespository;

@Service 
public class AdminService {
	@Autowired
	private AdminRespository adminRespository;

	public Admin addAdmin(Admin admin) {
		return adminRespository.addAdmin(admin);
		
		
	}

}
