package example8.com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Main {

	public static void main(String[] args)
	
	{
		ApplicationContext context=new  ClassPathXmlApplicationContext("NewFile.xml");
		Person person=(Person)context.getBean("nuthan");
		System.out.println(person.getPhono());
		System.out.println(person.getCar().getBrandcolor());
		
		

	}

}
