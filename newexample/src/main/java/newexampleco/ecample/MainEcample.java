package newexampleco.ecample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainEcample 
{

	public static void main(String[] args)
	{
ApplicationContext context=new  ClassPathXmlApplicationContext("NewFile.xml");
		
		Employee employee= (Employee) context.getBean("nuthan");
		System.out.println(employee.getId());
		System.out.println(employee.getName());
		System.out.println(employee.getAge());

	}

}
