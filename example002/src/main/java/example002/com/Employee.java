package example002.com;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component (value ="nuthan")
public class Employee 
{
	@Value(value = "101")
	private int id;
	
	
	@Value(value = "nuthan")
	private String name;

	

	public int getId()
	{
		return id;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}


	public String getName() 
	{
		return name;
	}
	
	

}
