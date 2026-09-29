package COLLECTION;
import java.util.*;
public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		HashSet<String> hs = new HashSet<String>(); //based on hash code
		
		LinkedHashSet<String> hs = new LinkedHashSet<String>();//No dublication and inserted order

		hs.add("Abhay");
		hs.add("Annanya");
		hs.add("Alok");
		hs.add("Jaya");
		hs.add("Baby");
		hs.add("Abhay");
		hs.add("Ruby");
		hs.add("Annanya");
		
		
		for(Object obj : hs) {
			System.out.println(obj);
		}
	}

}
