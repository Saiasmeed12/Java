package oopsConcepts;

public class Test {

	public static void main(String[] args) {

		Employee emp=new Employee();
		
		emp.setEid(18);
		emp.setEname("Virat");
		emp.setSalary(10000.00);
		
		System.out.println(emp.getEid());
		System.out.println(emp.getEname());
		System.out.println(emp.getSalary());

	}

}
