package Exception;

class Calc{
	
	public int x = 25;
	public int y = 0;
	public void result() throws ArithmeticException,Exception {
		 
			int res;
			res = x / y; //exception occur it throws exception object
			System.out.println("Result = "+res);
			
		}
	
}

public class ThrowsDemo {

	public static void main(String[] args) throws ArithmeticException,Exception{
		// TODO Auto-generated method stub
		Calc c = new Calc();
		c.result();

	}

}
