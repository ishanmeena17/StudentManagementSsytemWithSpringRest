package smswithspringrest.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Admin {
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(nullable = false,unique=true)
	private String email;
	@Column(nullable = false)
	private String password;

}
