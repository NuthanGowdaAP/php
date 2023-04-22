package example02.com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Mainhospital {

	public static void main(String[] args) 
	{
      ApplicationContext context=new  ClassPathXmlApplicationContext("NewFile.xml");
		
		Hospital hospital= (Hospital) context.getBean("nuthan");
		System.out.println(hospital.getId());
		System.out.println(hospital.getName());
		System.out.println(hospital.getBnameloc());

	}

}
