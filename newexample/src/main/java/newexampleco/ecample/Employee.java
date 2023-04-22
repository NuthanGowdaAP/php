package newexampleco.ecample;

public class Employee
{
	
	private String name;
	private int id;
	private int age;
	
	
	public Employee(String name, int id, int age) 
	{
		super();
		this.name = name;
		this.id = id;
		this.age = age;
	}
	public String getName()
	{
		return name;
	}
	public int getId() 
	{
		return id;
	}
	public int getAge()
	{
		return age;
	}
	

}
