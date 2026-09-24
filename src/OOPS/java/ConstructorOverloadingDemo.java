package OOPS.java;

class Cake{
	
	public Cake() {
		System.out.println("Happy Birthday");
	}
	
	public Cake(String msg, String shape) {
		System.out.println("The massage is : "+msg);
		System.out.println("The shape of the cake is : "+shape);
	}
	
	public Cake(String msg, String shape, double price) {
		System.out.println("The massage is : "+msg);
		System.out.println("The shape of the cake is : "+shape);
		System.out.println("The cake price is : "+price);
	}
	
	
}
public class ConstructorOverloadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("-----1st----- ");
		Cake c = new Cake();
		
		System.out.println("-----2nd------- ");
		c = new Cake("Happy Birthday bro!","Circle");
		
		System.out.println("------3rd-------- ");
		c = new Cake("Happy Birthday bro!","Circle",12000.00);
		
	}

}
