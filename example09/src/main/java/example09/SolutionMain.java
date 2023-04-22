package example09;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class SolutionMain {

	public static void main(String[] args) 
	{
		ApplicationContext context=new  ClassPathXmlApplicationContext("construct.xml");	
//		Adress adress=(Adress)context.getBean("adress");
		
		Employee employee=(Employee)context.getBean("emp");
		
//		System.out.println(adress.getCountry());
//			System.out.println(adress.);

	
	System.err.println(employee.getName());
	System.out.println(employee.getAdd().getState());
	
	}

}
