package example8.com;

import java.util.List;

public class Person 
{

	
	private int id;
	private String name;
	private List<Long> phono;
	
	private Car car;
	
	
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
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public List<Long> getPhono() {
		return phono;
	}
	public void setPhono(List<Long> phono) {
		this.phono = phono;
	}
	
	
}
