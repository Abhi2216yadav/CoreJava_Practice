package JAVA8;
import java.util.*;

public class StreamPOJO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Products> arr = new ArrayList<Products>();
		
		Products p1 = new Products("1","TV",20,23000.00,"Hp");
		Products p2 = new Products("2","Mobile",10,12000.00, "Sumsung");
		Products p3 = new Products("3","Laptop",14,4300.00, "Asus");
		Products p4 = new Products("4","Tab",24,45000.00, "Apple");
		Products p5 = new Products("5","Mac",20, 14000.00,"Hp");
		
		arr.add(p1);
		arr.add(p2);
		arr.add(p3);
		arr.add(p4);
		arr.add(p5);
		
		arr.stream().forEach(System.out::println);

		System.out.println("Those company name is Hp");
		
		arr.stream().filter(ps->ps.getCompany().equals("Hp")).forEach(System.out::println);
		
		System.out.println("10% discount offer to all product ==");
		
		arr.stream().map(pr->pr.getPrice() -(10/100*pr.getPrice())).forEach(System.out::println);
		
		System.out.println("Those whose company name is Hp 15% discount");
		
//		arr.stream().filter(str->str.getCompany().equals("Asus")).map(pr->pr.getPrice() -(10/100*pr.getPrice())).forEach(System.out::println);
		arr.stream().filter(ps->ps.getCompany().equals("Hp")).map(pr->pr.getPrice() -(15/100*pr.getPrice())).forEach(System.out::println);
		
		System.out.println("print descending order of the name ");
		
		arr.stream().sorted((i1,i2)->i2.getPname().compareTo(i1.getPname())).forEach(System.out::println);
		 
		double max = arr.stream().max((pt1, pt2)->pt1.getPrice().compareTo(pt2.getPrice())).get().getPrice();

		System.out.println("maximum price : "+max);
		
		double min = arr.stream().min((pt1, pt2)->pt1.getPrice().compareTo(pt2.getPrice())).get().getPrice();

		System.out.println("maximum price : "+min);
		
		
		
	}

}
