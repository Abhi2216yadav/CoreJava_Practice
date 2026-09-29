package COLLECTION;
import java.util.*;
public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<String> st = new Stack<String>();
		
		st.add("Abhay");
		st.add("Annaya");
		st.add("Alok");
		st.add("Jaya");
		st.add("Baby");
		st.add("Abhay");
		st.push("Tanya");
//		st.pop();
		
		System.out.println("Check the top most item : "+st.peek());
		
		for(Object ob : st) {
			System.out.println(ob);
		}
	}

}
