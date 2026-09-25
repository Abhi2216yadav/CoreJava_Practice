package OOPS.java;

class UseStatic{
	public static int x = 25; //without using 
	
	public static void show() {
		System.out.println("X : "+x);
	}
}

public class StaticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Value of X : "+ UseStatic.x); //but this is insecure
		UseStatic.show();
	}

}
