package se.sacha.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class AdminUser {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String password;
	
	
	@SuppressWarnings("unused")
	private AdminUser(){
		
	}


	public AdminUser(Long id, String password) {
		this.id = id;
		this.password = password;
	}


	public AdminUser(String password) {
		this.password = password;
	}


	public Long getId() {
		return id;
	}


	public String getPassword() {
		return password;
	}


	@Override
	public String toString() {
		return "AdminUser [id=" + id + ", password=" + password + "]";
	}
	
	
	
}
