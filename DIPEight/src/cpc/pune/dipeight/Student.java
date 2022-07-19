package cpc.pune.dipeight;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Student {
  private int sno;
  private String sname;
  private int age;
  private Map<String, String> subjectWiseMarks;
  
public Student(int sno, String sname, int age, Map<String, String> subjectWiseMarks) {
	this.sno = sno;
	this.sname = sname;
	this.age = age;
	this.subjectWiseMarks = subjectWiseMarks;
}
  
  void displayStud(){
	  System.out.println(sno + " " + sname + " " + age);
	  System.out.println("*****SubjectWise Marks********");
	  
	  Set<Entry<String, String>> set=subjectWiseMarks.entrySet();
	  Iterator<Entry<String, String>> iterator=set.iterator();
	  
	  Entry<String, String> me=null;
	  String key="", value=""; 
	  
	  while(iterator.hasNext()){
		  me=(Entry<String, String>)iterator.next();
		  key=me.getKey();
		  value=me.getValue();
		  System.out.println(key + " " + value);
	  }
	  
  }
  
  
}
