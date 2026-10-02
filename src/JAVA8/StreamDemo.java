package JAVA8;
import java.util.*;
import java.util.stream.Stream;
public class StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(10);
		arr.add(15);
		arr.add(5);
		arr.add(25);
		arr.add(20);
		arr.add(5);
		arr.add(30);
//		
//		for(Integer i : arr) {//for each loop
//			System.out.println(i);
//		}
		
		System.out.println("Display all data ");
		
		arr.stream().forEach(System.out::println);//consumer approach
//		arr.stream().forEach(i->System.out.println(i));
		
		System.out.println("Print the even data");
		arr.stream().filter(i-> i%2 == 0).forEach(System.out::println);
		
		System.out.println("Increse each value with 10");
		
		arr.stream().map(i->i+10).forEach(System.out::println);//using map increase by 10
		
		System.out.println("Natural sorting data ...........");
		arr.stream().sorted().forEach(System.out::println);
		
		System.out.println("Natural sorting in descending order data ...........");
		arr.stream().sorted((i1,i2)->i2.compareTo(i1)).forEach(System.out::println);//using lamda and compareTo 
		
		System.out.println("Distinct valuse");
		arr.stream().distinct().forEach(System.out::println);
		
		int max = arr.stream().max((i1,i2)->i1.compareTo(i2)).get(); //maximum
		System.out.println("Maximum value : "+max);
		//System.out.println(arr.stream().max((i1,i2)->i1.compareTo(i2)));//maximum
		
		int min = arr.stream().min((i1,i2)->i1.compareTo(i2)).get();//minimum 
		System.out.println("Minimum value : "+min);
//		System.out.println(arr.stream().max((i1,i2)->i2.compareTo(i1)));//minimum
		
		Stream<Integer> s = Stream.of(10, 100, 1000, 10000, 100000);
		s.forEach(System.out::println);
	}

}
