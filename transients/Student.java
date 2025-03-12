package transients;

import java.io.Serializable;

public class Student implements Serializable {

	private int sid;
	private String name;
	//transient is used to avoid serilization 
	//if any object is defined as a transient then will not be serilize
	private  transient String password;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", password=" + password + "]";
	}
	
	
	
}
