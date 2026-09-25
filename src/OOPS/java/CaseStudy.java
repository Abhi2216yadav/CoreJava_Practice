package OOPS.java;

class Company{
	public String compnm = "CTS";
	public String loc = "KOLKATA";
	
	public void display() {
		System.out.println("Company name : "+compnm);
		System.out.println("Company Location : "+loc);
	}
}

class Job extends Company{
	
	public String tech;
	public double exp;
	public String enddt;
	public String city;
	
	public void offer(String tech, double exp ) {
		this.tech = tech;
		this.exp = exp;
		
		System.out.println("Technology : "+tech);
		System.out.println("Experience : "+exp);
	}
	public void offer(String tech, double exp, String city ) {
		this.tech = tech;
		this.exp = exp;
		this.city = city;
		
		System.out.println("Technology : "+tech);
		System.out.println("Experience : "+exp);
		System.out.println("city : "+city);
	}
	
	public void offer(String tech, double exp, String city, String enddt ) {
		this.tech = tech;
		this.exp = exp;
		this.city = city;
		this.enddt = enddt;
		
		System.out.println("Technology : "+tech);
		System.out.println("Experience : "+exp);
		System.out.println("city : "+city);
		System.out.println("End date : "+enddt);
	}

}

class Candidate extends Job implements Schedule{
	public String candnm ;
	public String phno;
	public String email;
	
	public Candidate(String candnm, String phno, String email, String tech) {
		this.candnm = candnm;
		this.phno = phno;
		this.email = email;
		this.tech = tech;
			
	}
	
	public void show() {
		System.out.println("Candidate name : "+candnm);
		System.out.println("Candidate phone number : "+phno);
		System.out.println("Candidate email : "+email);
		System.out.println("Candidate technology : "+tech);
	}
	
	public void schedule() {
		System.out.println("Date of interview : 24-11-2026");
	}
}
public class CaseStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Candidate cd = new Candidate("Abhay", "9161564246", " abhay123@gmail.com", "Software Engineering");
		cd.show();
		cd.display();
		System.out.println("\noffer 1");
		cd.offer("Software Engineering", 2);
		
		System.out.println("\noffer 2");
		cd.offer("AIML", 1,"kolkata");
		
		System.out.println("\noffer 3");
		cd.offer("Syber ", 3,"kolkata", "29-11-2026");
		
//		System.out.println("Schedule");
		cd.schedule();
//		Interview in = new Interview();
//		in.schedule();
		
			
	}

}
