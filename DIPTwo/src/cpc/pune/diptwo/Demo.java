package cpc.pune.diptwo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
  public static void main(String[] args) {
	
	  ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
	  Student student=(Student)applicationContext.getBean("idStud");
	  student.displayStud();
}
}
