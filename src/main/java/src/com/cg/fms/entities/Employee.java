package src.com.cg.fms.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Entity
@Table(name="Employee_Master")
public class Employee implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName="
				+ employeeName + ", password=" + password + ", role=" + role
				+ "]";
	}
	@Id
	@Column(name="EmployeeId")
	@NotNull(message = "Id Field cannot be empty")
	private Integer employeeId;
	@Column(name="EmployeeName")
	private String employeeName;
	@Column(name="Password")
	@NotNull(message = "Password Field cannot be empty")
	private String password;
	@Column(name="Role")
	private String role;
	public Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	

}
