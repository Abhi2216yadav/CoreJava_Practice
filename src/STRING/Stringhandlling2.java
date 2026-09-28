package STRING;

public class Stringhandlling2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String("Arup"); //creating in heap and String Constant pool(SCP)
		String s2 = new String("Arup");//creating in heap and SCP again
		String s3 = "Arup";//only in scp that all ready exist
		String s4 = "Arup";
		
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s3 == s4);

	}

}
