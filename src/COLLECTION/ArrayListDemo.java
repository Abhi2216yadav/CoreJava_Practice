package COLLECTION;

import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		ArrayList arr = new ArrayList();  // not support synchronization
		
		Vector arr = new Vector();
		
//		Integer n = new Integer(10);// auto boxing
		arr.add(10); //integer obeject type is the data type
		arr.add(25);
		arr.add(15);
		arr.add(60);
		arr.add(40);
		arr.add(50);
		arr.add(15.5);
		arr.add("Suman");
//		arr.add(2, 15);
//		arr.remove(2);
//		System.out.println(arr);
//		
//		Collections.sort(arr);
//		System.out.println(arr);
//		System.out.println("Traversing the data");
//		System.out.println("For each loop");
//		
//		for(Object obj : arr) {
//			System.out.println(obj);
//		}
//		
		System.out.println("Traverse the elements using iterator");
		Iterator itr = arr.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("Backword direction printing");
		
		ListIterator Itr = arr.listIterator();
		
		while(Itr.hasNext()) {
			Itr.next();
		}
		
		while(Itr.hasPrevious()) {
			System.out.println(Itr.previous());
		}
	}

}
