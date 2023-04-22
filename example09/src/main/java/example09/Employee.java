package example09;

public class Employee {

	
	private int id;
	public Employee(int id, String name, long phono, Adress add) {
		super();
		this.id = id;
		this.name = name;
		this.phono = phono;
		this.add = add;
	}
	private String name;
	private long phono;
	private Adress add;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", phono=" + phono + ", add=" + add + "]";
	}
	public String getName() {
		return name;
	}
	public Adress getAdd() {
		return add;
	}
	public void setAdd(Adress add) {
		this.add = add;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhono() {
		return phono;
	}
	public void setPhono(long phono) {
		this.phono = phono;
	}
	
	
}
