package cpc.pune.dipthree;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Demo {
  public static void main(String[] args) {
	
	  Resource resource=new ClassPathResource("applicationContext.xml");
	  BeanFactory beanFactory=new XmlBeanFactory(resource);
	  
	  Student student1=(Student)beanFactory.getBean("idStud1");
	  student1.displayStud();
	  
	  Student student2=(Student)beanFactory.getBean("idStud2");
	  student2.displayStud();
	  
	  Student student3=(Student)beanFactory.getBean("idStud3");
	  student3.displayStud();	  
	  
	  Student student4=(Student)beanFactory.getBean("idStud4");
	  student4.displayStud();	  	  
}
}
