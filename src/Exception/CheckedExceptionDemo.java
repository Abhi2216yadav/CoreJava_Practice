package Exception;
import java.sql.*;


class TestConnection{
	private Connection cn = null;
	public Connection getConn(){
//		int x = 25;
		
		try {
			
			Class.forName("com.cj.mysql");
			cn = DriverManager.getConnection("jdbc:test");
			
		}catch(ClassNotFoundException ce) {
			
			ce.printStackTrace();
			
		}catch(SQLException se) {
			se.printStackTrace();
		}
		
		return cn;
		 
	}
}

public class CheckedExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
