package example06.com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Mainexample
{

	public static void main(String[] args) 
	{
		ApplicationContext context=new  ClassPathXmlApplicationContext("NewFile.xml");
		
		Person person= (Person) context.getBean("nuthan1");
		System.out.println(person.getId());
		System.out.println(person.getMobile().getAmazon().getItem());
		System.out.println(person.getMobile().getBrandcolor());
		System.out.println(person.getMobile().getAmazon().getItem().get(1));
		
		

	}

}
