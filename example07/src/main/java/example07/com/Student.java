package example07.com;

import java.util.Map;

public class Student 
{
	
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Map<String, Double> getSubjectmarks() {
		return subjectmarks;
	}
	public void setSubjectmarks(Map<String, Double> subjectmarks) {
		this.subjectmarks = subjectmarks;
	}
	private String name;
	private int age;
	Map<String,Double> subjectmarks;
	

}
