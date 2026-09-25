package OOPS.java;

class TestStatic{
	public static int x = 0;
	public static int y = 25;
	
	public static void Display() {
		System.out.println("X : "+x);
		System.out.println("Y : "+y);
	}
	
	static { //it execute first
		//static block access only static member it execute once
		
		x = y * 4;
	}
}

public class StaticBlockDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestStatic.Display();
	}

}
