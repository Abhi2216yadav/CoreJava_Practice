package STRING;

public class StringHandelling1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String("Arup"); //creating in heap and SCP 
//		String s2 = new String("Arup");//creating in heap and SCP again
		String s2 = "Arup";
	
		
	
		System.out.println(s1 == s2); //memory are not same one in heap area and second one in String contant pool
		System.out.println(s1.equals(s2));//checking content 
	}

}
