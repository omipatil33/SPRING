package cpc.pune.dipfive;

public class Student {
	private int sno;
	private String sname;
	private int age;
	private Address address;
	
	public Student(int sno, String sname, int age, Address address) {
		this.sno = sno;
		this.sname = sname;
		this.age = age;
		this.address = address;
	}
	
	void displayStud(){
		System.out.println(sno + " " + sname + " " + age);
		address.displayAddress();
	}
	
	
}
