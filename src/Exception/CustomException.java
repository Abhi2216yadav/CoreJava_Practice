package Exception;

class Account{
	public String accno = "100";
	
	public void checkAccount(String acc) {
		
		try {
			System.out.println("Account number "+ acc+ " is exits ");
			
			
			if(accno != acc) {
				AccountNotFoundException ae = new AccountNotFoundException();
				throw ae;
			}
			
			System.out.println("Account number "+ acc+ " is exits ");
			
		}catch(AccountNotFoundException ae) {
			
			ae.printStackTrace();
		}
		System.out.println("Account number  is exits ");
		
	}
}
public class CustomException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account ac = new Account();
		
//		ac.checkAccount("100");
		
		ac.checkAccount("200"); 
		
//		Account Number not exits
//		Exception.AccountNotFoundException
//		at Exception.Account.checkAccount(CustomException.java:11)
//		at Exception.CustomException.main(CustomException.java:29)

	}

}
