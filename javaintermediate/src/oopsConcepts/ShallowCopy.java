package oopsConcepts;

class student implements Cloneable{
	int eid;
	String ename;
	Address address;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
	    // TODO Auto-generated method stub
	    return super.clone();
	}
	
	
	public student(int eid, String ename, Address address) {
		this.eid=eid;
		this.ename=ename;
		this.address=address;
	}
	
}


class Address{
	String City;
	
	public Address(String City) {
		this.City=City;
	}
	
}


public class ShallowCopy {
	public static void main(String[] args) throws CloneNotSupportedException  {
		
		Address address = new Address("HYD");
		student s1= new student(101,"kk",address);
		
		System.out.println(s1.eid);
		System.out.println(s1.ename);
		System.out.println(s1.address.City);
		System.out.println("---------------");
		
		student s2 =(student)s1.clone();
		
		System.out.println(s2.eid);
		System.out.println(s2.ename);
		System.out.println(s2.address.City);
		
		System.out.println("*******************");
		
		s2.address.City="banglore";
	
		System.out.println(s1.address.City);
		
		System.out.println("-------------------");
		System.out.println(s2.address.City);
		
		
		
	}

}
