package STRING;

public class StringhandllingMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "";
		System.out.println(s.isEmpty());
		
		String s1 = "abcdabcdabcdabcd";
		System.out.println(s1.replace('c','e'));
		
		String s2 = "BANGOLORE";
		System.out.println(s2.substring(5,9)); //9 means  9 -1 = 8 for acces a sub string
		
		String s3 = "ALOKE";
		System.out.println(s3.charAt(2));//acces only one char
		
		String s4 = " KOLKATA ";
		System.out.println(s4);
		System.out.println(s4.length());
		System.out.println(s4.trim());
		System.out.println(s4.trim().length());
		
		String s5 = "AJOY RAY";
		System.out.println(s5.indexOf('A'));
		System.out.println(s5.lastIndexOf('A'));
		
		String s6 = "welcome";
		System.out.println(s6.toUpperCase());
		System.out.println(s6.toLowerCase());
		
		String msg = "HELLO , HOW ARE YOU, I AM FINE"; // , CALLED DELIMETER;
		
		System.out.println(msg.substring(0,5));
		System.out.println(msg.substring(8,19));
		System.out.println(msg.substring(21,msg.length()));
		
		String s7 = msg.substring(0,5);
		String s8 = msg.substring(7,19);
		String s9 = msg.substring(20,msg.length());
		String ans = s7.concat(s8);
		
		System.out.println(ans.concat(s9));
		
		String[] st = msg.split(","); //cut from each ',' part
		
		for(String str : st) {
			System.out.println(str);
		}
//		System.out.println(st);

	}

}
