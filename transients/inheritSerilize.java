package transients;

import java.util.Arrays;

public class inheritSerilize extends Student{

	private int iid;
	private String name;
	private Student s[];
	public int getIid() {
		return iid;
	}
	public void setIid(int iid) {
		this.iid = iid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student[] getS() {
		return s;
	}
	public void setS(Student[] s) {
		this.s = s;
	}
	@Override
	public String toString() {
		return "inheritSerilize [iid=" + iid + ", name=" + name + ", s=" + Arrays.toString(s) + "]";
	}
	
	
	
	
	
	
	
	
}