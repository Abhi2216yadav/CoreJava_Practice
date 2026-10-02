package JAVA8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PredefinedInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Predicate<Integer> p = i-> i %2 == 0;
		
		System.out.println(p.test(10));// here int 10, char, double  are wrapper class object
		System.out.println(p.test(5));
		System.out.println(p.test(18));
		
		Function<String, Integer> fn = s->s.length();
		System.out.println(fn.apply("Abhay"));
		
		Function<String, String> fr = s->s.toUpperCase();
		System.out.println(fr.apply("Abhay"));
		
		Consumer<String> cn = s->System.out.println(s); //for taking input
		Consumer<String> cn1 = s->System.out.println(s.concat("CSE"));  
		cn.accept("Abhay");
		cn1.accept("Abhay"); 
		
		Supplier<LocalDate> sp = () ->LocalDate.now(); //not taking input but gate output
		System.out.println(sp.get());
		

		Supplier<LocalDateTime> sp1 = () ->LocalDateTime.now(); //not taking input but gate output
		System.out.println(sp1.get());
	}
}
