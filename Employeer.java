package com.motivity;

//import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
import javax.persistence.Id;
//import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table(name="Employer")
@Entity
public class Employer {
	@Id
	@Column(name="employer_id")
	private int employer_id;
	@Column(name="employer_name")
	private String employer_name;
	@Column(name="employer_department")
	private String employer_department;
	@Column(name="employer_mobile")
	private long employer_mobile;
	@OneToMany(targetEntity=Employee.class,cascade=CascadeType.ALL,mappedBy="employer")
	private List<Employee> employee;//=new ArrayList<Employee>();
	public int getEmployer_id() {
		return employer_id;
	}
	public void setEmployer_id(int employer_id) {
		this.employer_id = employer_id;
	}
	public String getEmployer_name() {
		return employer_name;
	}
	public void setEmployer_name(String employer_name) {
		this.employer_name = employer_name;
	}
	public String getEmployer_department() {
		return employer_department;
	}
	public void setEmployer_department(String employer_department) {
		this.employer_department = employer_department;
	}
	public long getEmployer_mobile() {
		return employer_mobile;
	}
	public void setEmployer_mobile(long employer_mobile) {
		this.employer_mobile = employer_mobile;
	}
	public List<Employee> getEmployee() {
		return employee;
	}
	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}

}
