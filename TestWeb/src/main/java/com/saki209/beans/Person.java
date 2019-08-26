package com.saki209.beans;

<<<<<<< HEAD

public class Person {
	private String username;
=======
import org.springframework.context.annotation.Configuration;

@Configuration
public class Person {
	private String username;
	private String password;
	
>>>>>>> 8d70f6abcfe282e00af0ed3cd7b1341ca501b503
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
<<<<<<< HEAD
	private String password;
=======
	
	
	
>>>>>>> 8d70f6abcfe282e00af0ed3cd7b1341ca501b503

}
