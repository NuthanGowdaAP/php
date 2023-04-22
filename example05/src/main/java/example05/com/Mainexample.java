package example05.com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Mainexample {

	public static void main(String[] args) 
	{
		 ApplicationContext context=new  ClassPathXmlApplicationContext("NewFile.xml");
			
			Person person= (Person) context.getBean("nuthan");
			System.out.println(person.getId());
			System.out.println(person.getName());
			System.out.println(person.getAge());
			System.out.println(person.getCard().getAddhress());
			
			
			


	}

}
