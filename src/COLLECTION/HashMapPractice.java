package COLLECTION;
import java.util.*;
public class HashMapPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		//using ArrayList
//		Student s1 = new Student(1, "AYAN", "CSE");
//		Student s2 = new Student(2, "ROBIN", "CSE");
//		Student s3 = new Student(3, "ALOKE", "ECE");
//		
//		ArrayList<Student> arr1 = new ArrayList<Student>();
//		
//		arr1.add(s1);
//		arr1.add(s2);
//		arr1.add(s3);
//		
//		for(Student ps:arr1) {
//			System.out.println(ps);
//		}
		 
		Student s1 = new Student("AYAN", "CSE");
		Student s2 = new Student("ROBIN", "CSE");
		Student s3 = new Student("ALOKE", "ECE");
		
		HashMap<Integer, Student> hp = new HashMap<Integer, Student>();
		hp.put(1, s1);
		hp.put(2, s2);
		hp.put(3, s3);
		
		for(Map.Entry<Integer, Student> entry:hp.entrySet()) {
			
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		
	}

}
