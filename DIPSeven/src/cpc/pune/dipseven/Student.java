package cpc.pune.dipseven;

import java.util.List;

public class Student {
  private int sno;
  private String sname;
  private int age;
  private List<Receipt> receipts;
  
public Student(int sno, String sname, int age, List<Receipt> receipts) {
	this.sno = sno;
	this.sname = sname;
	this.age = age;
	this.receipts = receipts;
}

void displayStud(){
	System.out.println(sno + " " + sname + " " + age);
	System.out.println("********Receipt Info********");
	
	for(Receipt r: receipts){
		r.displayReceipt();
	}
	
}
  
  
}
