package Exception;

class Calculator{
	public int x = 25;
	public int y = 0;
	public void result() {
		
		try {
			int res;
			res = x / y; //exception occur it throws exception object
			System.out.println("Result = "+res);
			
		}
		catch(ArithmeticException ae) {
			
			ae.printStackTrace(); // handle here
//			System.out.println(ae);
//			System.out.println(ae.getMessage());
		}
		catch(Exception ex) { // it's checks all exception and take more time
			
			ex.printStackTrace();
//			System.out.println(ex);
//			System.out.println(ex.getMessage());
		}
		// if you write this first so no need to check arithmatic after that
		
		finally {
			System.out.println("Always executed");
		}
		 
	}
	
	public void show() {
		System.out.println("X : "+x); // exception handle that's why it execute currectly
	}
}
public class UncheckedExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c1 = new Calculator();
		c1.result();
		c1.show();
	}

}
