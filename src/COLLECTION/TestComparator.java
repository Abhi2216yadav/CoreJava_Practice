package COLLECTION;
import java.util.*;
public class TestComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
//		return o1.compareTo(o2); //accending order
//		return -o1.compareTo(o2); //descendoing order
//		return o2.compareTo(o1); //descending orders
//		return -o2.compareTo(o1); //accending orders
		
//		return 1;//inserted order
//		return 0; // only root element print
		return -1; //reverse of inserted order
	}

	 

}
