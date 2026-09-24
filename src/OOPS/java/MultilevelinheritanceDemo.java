package OOPS.java;


class Student{
	int roll = 1;
	String name = "Abhay";
	public void Show() {
		System.out.println("Name : "+name);
		System.out.println("Roll : "+roll);
	}
}

class Exam extends Student{
	String sub1 = "phy";
	String sub2 = "chem";
	String sub3 = "math";
	
	public void Display() {
		System.out.println("Sub one : " + sub1);
		System.out.println("Sub two : " + sub2);
		System.out.println("Sub three : " + sub3);
	}
	
	public int Score(int p, int c, int m) {
		
		System.out.println("Sub one :- " + sub1+ "  = "+p);
		System.out.println("Sub two :- " + sub2+ "  = "+c);
		System.out.println("Sub three :- " + sub3+ "  = "+m);
		
		return  p + c + m;	
		
	}
}

class Sem extends Exam{
	String sem = "IV";
	String yr = "2nd";
	
	public void details() {
		System.out.println("Sem : "+sem);
		System.out.println("Year : "+yr);
	}
}
public class MultilevelinheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sem s = new Sem();
		s.Show();
		s.Display();
		int score = s.Score(89, 88, 78);
		
		System.out.println("Score is : "+score);
		
		s.details();
	}

}
