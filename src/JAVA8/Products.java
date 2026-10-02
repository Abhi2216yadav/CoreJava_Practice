package JAVA8;

public class Products {

	 private String pid;
	 private String pname;
	 private Integer pqty;
	 private Double price;
	 private String company;
	 
	 public Products() {
		super();
		// TODO Auto-generated constructor stub
	 }

	 public Products(String pid, String pname, Integer pqty, double price, String company) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pqty = pqty;
		this.price = price;
		this.company = company;
	 }

	 public String getPid() {
		 return pid;
	 }

	 public void setPid(String pid) {
		 this.pid = pid;
	 }

	 public String getPname() {
		 return pname;
	 }

	 public void setPname(String pname) {
		 this.pname = pname;
	 }

	 public Integer getPqty() {
		 return pqty;
	 }

	 public void setPqty(Integer pqty) {
		 this.pqty = pqty;
	 }

	 public double getPrice() {
		 return price;
	 }

	 public void setPrice(double price) {
		 this.price = price;
	 }

	 public String getCompany() {
		 return company;
	 }

	 public void setCompany(String company) {
		 this.company = company;
	 }

	 @Override
	 public String toString() {
		return "Products [pid=" + pid + ", pname=" + pname + ", pqty=" + pqty + ", price=" + price + ", company="
				+ company + "]";
	 }
	 
}
