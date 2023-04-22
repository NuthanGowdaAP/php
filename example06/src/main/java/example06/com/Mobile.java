package example06.com;

import java.util.Map;

public class Mobile
{
	private int id;
	private String brand;
	private Amazon amazon;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Map<String, String> getBrandcolor() {
		return brandcolor;
	}
	public void setBrandcolor(Map<String, String> brandcolor) {
		this.brandcolor = brandcolor;
	}
	public Amazon getAmazon() {
		return amazon;
	}
	public void setAmazon(Amazon amazon) {
		this.amazon = amazon;
	}
	private Map<String,String> brandcolor;
}
