package dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Userdto {
	@Id
	private String username;
	private String email;
	private String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Userdto [username=" + username + ", email=" + email + ", password=" + password + "]";
	}
	
	

}
