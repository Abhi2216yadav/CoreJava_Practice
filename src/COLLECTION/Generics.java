package COLLECTION;
import java.util.*;
public class Generics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//convert from  heterogeniose to homogeniouse 
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("Abhay");
		arr.add("Yadav");
		arr.add("Soumya");
		arr.add("Ajay");
		arr.add("Abhay");
		arr.add("Khushi");
		
		for(Object O:arr) {
			System.out.println(O);
		}
		
	}

}
