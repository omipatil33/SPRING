package cpc.pune.dipone;

public class Student {
	private int sno;
	private String sname;
	private int age;
	
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	void displayStudent(){
		System.out.println(sno + " " + sname + " " + age);
	}
  
}
