package cpc.pune.dipsix;

import java.util.List;

public class Student {
  private int sno;
  private String sname;
  private int age;
  private List<String> hobbies;
  
  public Student(int sno, String sname, int age, List<String> hobbies) {
	this.sno = sno;
	this.sname = sname;
	this.age = age;
	this.hobbies = hobbies;
  }
  
  void displayStud(){
	  System.out.println(sno + " " + sname + " " + age);
	  System.out.println("***** Hobbies *********");
	  
	  for(String str: hobbies){
		  System.out.println(str);
	  }
	  
  }
  
}
