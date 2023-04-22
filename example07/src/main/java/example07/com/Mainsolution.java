package example07.com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Mainsolution {

	public static void main(String[] args) 
	{
ApplicationContext context=new  ClassPathXmlApplicationContext("NewFile.xml");
		
//		Person person= (Person) context.getBean("nuthan1");
//		System.out.println(person.getId());
//		System.out.println(person.getMobile().getAmazon().getItem());
//		System.out.println(person.getMobile().getBrandcolor());

 	College college=(College)context.getBean("nuthan1");
 	
 	System.out.println(college.getName());
 	
 	System.out.println(college.getBranch().getCourse());
 	System.out.println(college.getStudent().getSubjectmarks());
 	

	}

}
