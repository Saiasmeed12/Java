package oopsConcepts;

public class Employee {
	
	 private int eid;
	private String ename;
	private double salary;
	
	public void setEid(int eid) {
		this.eid=eid;
	}
	
	int getEid() {
		return eid;
	}
	
	
	public  void setEname(String ename) {
		this.ename=ename +" Kholi";
	}
	
	String getEname() {
		return ename;
	}
	
	public void setSalary(double salary) {
		this.salary=salary;
	}
	
	double getSalary() {
		return salary;
	}
	
	
	
}


