package cpc.pune.dipnine;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Course {
	private String cid;
	private String cname;
	private Map<Student, ReceiptList> studentWiseReceipts;
	
	public Course(String cid, String cname, Map<Student, ReceiptList> studentWiseReceipts) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.studentWiseReceipts = studentWiseReceipts;
	}
	
	void displayCourse(){
		System.out.println("Course ID: " + cid);
		System.out.println("Course Name: " + cname);
		
		Set<Entry<Student, ReceiptList>> set=studentWiseReceipts.entrySet();
		Iterator<Entry<Student, ReceiptList>> it=set.iterator();
		Entry<Student, ReceiptList> me=null;
		Student s=null;
		ReceiptList rList=null;
		
		while(it.hasNext())
		{
			me=(Entry<Student, ReceiptList>)it.next();
			s=(Student)me.getKey();
			rList=(ReceiptList)me.getValue();
			
			s.displayStud();
			rList.displayReceiptList();
		}
		
		
	}
	
 
}
