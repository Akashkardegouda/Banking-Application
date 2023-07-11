package dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
@Component
public class Operator {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int operator_id;
	private String operator_pwd;
	private String operator_cpwd;
	public int getOperator_id() {
		return operator_id;
	}
	public void setOperator_id(int operator_id) {
		this.operator_id = operator_id;
	}
	public String getOperator_pwd() {
		return operator_pwd;
	}
	public void setOperator_pwd(String operator_pwd) {
		this.operator_pwd = operator_pwd;
	}
	public String getOperator_cpwd() {
		return operator_cpwd;
	}
	public void setOperator_cpwd(String operator_cpwd) {
		this.operator_cpwd = operator_cpwd;
	}
	
	
	

}
