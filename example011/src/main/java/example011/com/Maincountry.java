package example011.com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Maincountry
{

	public static void main(String[] args)
	{
		ApplicationContext context=new  ClassPathXmlApplicationContext("NewFile.xml");
		
		Country country= (Country) context.getBean("nuthan");
		System.out.println(country.getId());
		System.out.println(country.getName());
		System.out.println(country.getStates());
	}

}
