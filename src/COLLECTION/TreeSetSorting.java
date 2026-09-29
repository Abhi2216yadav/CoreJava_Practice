package COLLECTION;
import java.util.*;
public class TreeSetSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> ts = new TreeSet<String>(new TestComparator());
		
		ts.add("Bhaskar");
		ts.add("Abhay");
		ts.add("Annanya");
		ts.add("Kavya");
		ts.add("Jaya");
		ts.add("Baby");
		ts.add("Somya");
		 
		for(Object obj : ts) {
			System.out.println(obj);
		}
	}

}
