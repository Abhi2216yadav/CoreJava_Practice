package COLLECTION;
import java.util.*;
public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> ls = new LinkedList<String>();
		
		ls.add("Abhay");
		ls.add("Annaya");
		ls.add("Alok");
		ls.add("Jaya");
		ls.add("Baby");
		ls.add("Abhay");
		ls.add(2,"Khushi" );
		ls.remove(2);
		
		ls.addFirst("Abhi");
		ls.addLast("Yadav");
		
		for(Object ob : ls) {
			System.out.println(ob);
		}
	}

}
