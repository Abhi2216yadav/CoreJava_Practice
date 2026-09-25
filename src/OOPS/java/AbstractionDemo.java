package OOPS.java;

abstract class Shape{
	public abstract void Area(double r); // in abstract no body is present 
		
	
}

 class Circle extends Shape{
	 
	 //METHOD OVERRINDING
	 public void Area(double r) {
		 System.out.println("Area of Circle : " +Math.PI* r * r);
	 }
 }

 class Square extends Shape{
	 
	 //METHOD OVERRINDING
	 public void Area(double r) {
		 System.out.println("Area of the Square : " +r * r);
	 }
 }
public class AbstractionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Shape s = new Shape(); // this is not possible
		Circle c = new Circle();
		c.Area(10.9);
		
		Square s = new Square();
		s.Area(10.5);
	}

}
