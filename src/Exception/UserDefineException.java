package Exception;

class Stock{
	
	public int qoh = 50;
	public void issue(int req) {
		
		
		try {
			
			if(req > qoh) {
				OutOfStockException oe = new OutOfStockException();
				throw oe;//becouse user define exception
			}
			
			System.out.println("Current stock : "+ (this.qoh - req));
			
		}catch(OutOfStockException oe) {
			
			oe.printStackTrace();
		}
		 
	}
}
public class UserDefineException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stock sc = new Stock();
		
		sc.issue(25);
		
//		sc.issue(60);
//		Out of Stack Exception .Please check the current stock
//		Exception.OutOfStockException
//			at Exception.Stock.issue(UserDefineException.java:12)
//			at Exception.UserDefineException.main(UserDefineException.java:31)
	}

}
