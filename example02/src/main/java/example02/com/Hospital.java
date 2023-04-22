package example02.com;

import java.util.Map;

public class Hospital
{
private int id;
private String name;
private String website;
private int phono;
private Map <String,String> bnameloc;


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
public String getWebsite() {
	return website;
}
public void setWebsite(String website) {
	this.website = website;
}
public int getPhono() {
	return phono;
}
public void setPhono(int phono) {
	this.phono = phono;
}
public Map<String, String> getBnameloc() {
	return bnameloc;
}
public void setBnameloc(Map<String, String> bnameloc) {
	this.bnameloc = bnameloc;
}
}
