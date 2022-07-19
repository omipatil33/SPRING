package cpc.pune.dipnine;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Demo {
  public static void main(String[] args) {
	
	  Resource resource=new ClassPathResource("applicationContext.xml");
	  BeanFactory beanFactory=new XmlBeanFactory(resource);
	  Course course=(Course)beanFactory.getBean("idCourse");
	  course.displayCourse();
	  
}
}
