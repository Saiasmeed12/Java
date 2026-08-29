package oopsConcepts;

public class Company {
	
	private  int eid;
	private  String ename;
	private  double esalary;
	
	
	public void setEid(int eid) {
		this.eid=eid;
	}
	
	int getEid() {
		return eid;
	}
	
	
	public void setEname(String ename) {
		this.ename=ename;
	}
	
	String getEname() {
		return ename;
	}
	
	public void setEsalary(double esalary) {
		this.esalary=esalary;
		
	}
	
	double getEsalary() {
		return esalary;
	}



}

/*
 * Java-
 * 
 * 1.Create an encapsulated class Employee with private fields: id, name,
 * salary, password. Requirements: 1. Make all fields private (Data Hiding). 2.
 * Create public setters and getters. 3. Access and modify the data
 */