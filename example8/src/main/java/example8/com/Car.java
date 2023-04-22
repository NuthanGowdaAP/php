package example8.com;

import java.util.Map;

public class Car 
{
private int id;
private double cost;
private Map<String,String> brandcolor;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public double getCost() {
	return cost;
}
public void setCost(double cost) {
	this.cost = cost;
}
public Map<String, String> getBrandcolor() {
	return brandcolor;
}
public void setBrandcolor(Map<String, String> brandcolor) {
	this.brandcolor = brandcolor;
}



}
