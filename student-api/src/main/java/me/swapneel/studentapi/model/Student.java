package me.swapneel.studentapi.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student")
public class Student {
	
	@Id
	private Integer rollno;
	private String name;
	private String email;
	
	public Student() {
		
	}
	
	public Student(Integer rollno, String name, String email) {
		this.rollno = rollno;
		this.name = name;
		this.email = email;
	}
	
	public void setRollno(Integer rollno) {
		this.rollno = rollno;
	}
	
	public Integer getRollno() {
		return rollno;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return email;
	}
}
