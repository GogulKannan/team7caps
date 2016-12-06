package edu.iss.caps.trash;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Id;

public class Users
{
	@Id
	@Column(name = "UserId")
	String	userId;
	
	String password;
	String role;
	

	private String userId;
	@Basic(optional = false)
	@Column(name = "name")
	private String name;
	@Column(name = "password")
	private String password;
	@Column(name = "employeeid")
	private String employeeId;
}
