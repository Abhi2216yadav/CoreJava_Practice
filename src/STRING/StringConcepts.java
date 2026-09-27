package STRING;

public class StringConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = new String("AJAY");
		String s2 = new String("AJAY");
		System.out.println(s1 == s2); //false
		System.out.println(s1.equals(s2));//true
		
		StringBuffer sb1 = new StringBuffer("JEE");
		StringBuffer sb2 = new StringBuffer("JEE");
		System.out.println(sb1 == sb2); //checking address
		System.out.println(sb1.equals(sb2));//checking address it is 
	}

}
