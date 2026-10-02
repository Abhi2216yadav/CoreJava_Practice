package OOPS.java;
class Employee{//this is the subclass of object class
	
	public String eid = "E1";
	public String ename = "Ajay";
	public String dept = "HR";
	@Override
	public String toString() {//comming from the object class 
		return "Employee [eid=" + eid + ", ename=" + ename + ", dept=" + dept + "]";
//		return eid+"==>"+ename+"==>"+dept;
		
		
	}
	
}
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp = new Employee();
		System.out.println(emp);
	}

}
