package com.motivity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table(name="Employee")
@Entity
public class Employee {
	@Id
	@Column(name="employee_id")
	private int employee_id;
	@Column(name="employee_name")
	private String employee_name;
	@Column(name="employe_mobile")
	private long employee_mobile;
	@Column(name="employee_address")
	private String employee_address;
	@ManyToOne
	private Employer employer;
	public int getEmployee_id() {
		return employee_id;
	}
	//private Employee employee;
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	public String getEmployee_name() {
		return employee_name;
	}
	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}
	public long getEmployee_mobile() {
		return employee_mobile;
	}
	public void setEmployee_mobile(long employee_mobile) {
		this.employee_mobile = employee_mobile;
	}
	public String getEmployee_address() {
		return employee_address;
	}
	public void setEmployee_address(String employee_address) {
		this.employee_address = employee_address;
	}
	public Employer getEmployer() {
		return employer;
	}
	public void setEmployer(Employer employer) {
		this.employer = employer;
	}
	
	
	
	

}
