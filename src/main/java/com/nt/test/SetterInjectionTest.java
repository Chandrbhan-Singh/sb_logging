package com.nt.test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import com.nt.beans.WishMessageGenerator;

public class SetterInjectionTest {
	public static void main(String[] args) {
		
	//hold spring cfgs file name and location
		FileSystemResource res=new FileSystemResource("src/main/java/com/nt/cfgs/applicationContext.xml");
		
		//create IOC Container(BeanFactory container)
		BeanFactory factory=new XmlBeanFactory(new ClassPathResource(""));
		//XmlBeanFactory factory=new XmlBeanFactory(new ClassPathResource("res"));
		
		//get target spring bean class object
		Object obj=factory.getBean("wmg");
		
		//typecasting
		WishMessageGenerator generator=(WishMessageGenerator)obj;
		
		//invoked the b.method
		String result=generator.generateMessage("raja");
		System.out.println("Wish Message is::"+result);
				
	}//main
}//class
