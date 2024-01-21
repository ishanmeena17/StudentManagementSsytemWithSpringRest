package smswithspringrest.response;

import lombok.Data;
import smswithspringrest.pojo.Admin;

@Data
public class AdminResponse {
	private String message;
	private Admin admin;
	private int status;

}
