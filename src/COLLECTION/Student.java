package COLLECTION;
import java.util.*;
public class Student {
	
//	private int roll;
	private String name;
	private String dept;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student( String name, String dept) {
		super();
//		this.roll = roll;
		this.name = name;
		this.dept = dept;
	}
	
	//Getter and Setter
	
//	public int getRoll() {
//		return roll;
//	}
//	public void setRoll(int roll) {
//		this.roll = roll;
//	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
//		return "Student [roll=" + roll + ", name=" + name + ", dept=" + dept + "]";
		return "Student [name=" + name + ", dept=" + dept + "]";
	}
	
	
}
