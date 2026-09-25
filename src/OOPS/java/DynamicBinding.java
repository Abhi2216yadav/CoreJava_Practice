package OOPS.java;

abstract class Shapes{
	public abstract void Areas(double r); // in abstract no body is present 
		
	
}

 class Circles extends Shapes{
	 
	 //METHOD OVERRINDING
	 public void Areas(double r) {
		 System.out.println("Area of Circle : " +Math.PI* r * r);
	 }
 }

 class Squares extends Shapes{
	 
	 //METHOD OVERRINDING
	 public void Areas(double r) {
		 System.out.println("Area of the Square : " +r * r);
	 }
 }
 
public class DynamicBinding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shapes sp1;
		Shapes sp2;
		Circles cr = new Circles();
		Squares sq = new Squares();
		sp1 = cr;
		sp2 = sq;
		sp1 = sp2; // Dynamic binding
		sp1.Areas(6.5);
		
	}

}
