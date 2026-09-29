package COLLECTION;
import java.util.*;
public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		HashMap<String, Double> hp = new HashMap<String, Double>();
		
//		LinkedHashMap<String, Double> hp = new LinkedHashMap<String, Double>();
		TreeMap<String, Double> hp = new TreeMap<String, Double>();//Ascending order
		
		hp.put("TV", 25000.00);
		hp.put("TAB", 22000.00);
		hp.put("Convection", 18000.00);
		hp.put("Mobile", 15000.00);
		hp.put("Laptop", 45000.00);
		hp.put("TV", 32000.00);
		
//		System.out.println(hp);
		
		for(Map.Entry<String, Double> entry : hp.entrySet()) {
			System.out.println(entry);
		}
	}

}
