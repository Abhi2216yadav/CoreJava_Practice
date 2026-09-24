package OOPS.java;

//import java.lang.Object; //super class in java is called object
//import java.lang.*;

class Calculator{
	public int add(int x, int y) {
		return x + y;
	}
	
	public float add(int x, float y) {
		return x + y;
	}
	
	public double add(double x, double y) {
		return x + y;
	}
}
public class MethodOverloadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal = new Calculator();
//		cal.add(10, 5);
//		cal.add(10, 5.10);
//		cal.add(10.34, 5.23);
		
		
		
		System.out.println("Addintion 1 : "+cal.add(10, 5));
		System.out.println("Addintion 2 : "+cal.add(10, 5.12F));
		System.out.println("Addintion 3 : "+cal.add(10.23, 5.34));

	}

}
