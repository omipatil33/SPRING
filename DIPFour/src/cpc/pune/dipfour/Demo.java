package cpc.pune.dipfour;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Demo {
  public static void main(String[] args) {
	
	  Resource resource=new ClassPathResource("applicationContext.xml");
	  BeanFactory beanFactory=new XmlBeanFactory(resource);
	  Student student=(Student)beanFactory.getBean("idStud");
	  student.displayStud();
	  
}
}
