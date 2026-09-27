package STRING;

public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String("SPRING");
		s1.concat("HIBERNATE");
		System.out.println(s1);
		
		StringBuffer sb1 = new StringBuffer("SPRING"); //only object created in only heap area
		sb1.append("HIRBERNATE");
		System.out.println(sb1);
		
	}

}
