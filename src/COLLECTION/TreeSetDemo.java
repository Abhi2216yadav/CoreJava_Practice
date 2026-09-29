package COLLECTION;
import java.util.*;
public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		TreeSet<Integer> ts = new TreeSet<Integer>();
//		ts.add(10); 
//		ts.add(15);//15 compareTo(10) == +ve
//		ts.add(5); // 5 compareTo(10) == -ve
//		ts.add(20);// 20 compareTo(10) == +ve
//					// 20 compareTo(15) == +ve
//		
//		ts.add(30);
//		ts.add(20); //dublicate value not allow
//		ts.add(40);
//		
//		for(Object obj : ts) {
//			System.out.println(obj);
//		}
		
		TreeSet<String> st = new TreeSet<String>();
		st.add("Yadav ji");
		st.add("Kavya");
		st.add("Abhay");
		st.add("Soumya");
		st.add("Ajay");
		st.add("Abhay");
		st.add("Ram");
		st.add("kavya"); //ASCI value se differe ho raha hai from captital letter
		st.add("kavya");
		st.add("aradhya");
		
		for(Object obj : st) {
			System.out.println(obj);
		}
		
	}	

}
