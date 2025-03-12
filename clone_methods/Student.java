package clone_methods;

public class Student implements Cloneable  {
	
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
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
	private int id;
	private String name;


 public Student clone()throws CloneNotSupportedException
 {
	return (Student) super.clone(); 
 }
}
