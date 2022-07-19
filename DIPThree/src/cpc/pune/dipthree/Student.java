package cpc.pune.dipthree;

public class Student {
  private int sno;
  private String sname;
 
public Student(int sno) {
	this.sno = sno;
}

public Student(String sname) {
	this.sname = sname;
}

public Student(int sno, String sname) {
	this.sno = sno;
	this.sname = sname;
}

void displayStud(){
	System.out.println(sno + " " + sname);
}
  
}
