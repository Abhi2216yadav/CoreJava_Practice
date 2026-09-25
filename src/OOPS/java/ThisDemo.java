package OOPS.java;

class Product{
	public String pid;
	public String pname;
	public int pqty;
	public double price;
	public String sdt;
	
	public Product(String pid, String pname, int pqty, double price, String sdt) {
		
		this.pid = pid;
		this.pname = pname;
		this.pqty = pqty;
		this.price = price;
		this.sdt = sdt;
	}
	
	public void saleOrder() {
		
		this.display();// invoking the current object
		
		System.out.println("P ID : "+this.pid);
		System.out.println("P NMAE : "+this.pname);
		System.out.println("QUANTITY : "+this.pqty);
		System.out.println("PRICE : "+this.price);
		System.out.println("Total Price : "+this.price * this.pqty);
		System.out.println("P SDT : "+this.sdt);
	}
	
	public void display() {
		System.out.println("SELES ORDER FROM XYZ LTD");
	}
}

public class ThisDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p = new Product("P1", "TV", 5, 120000.00, "23-09-2026");
		p.saleOrder();
//		p.display();

	}

}
