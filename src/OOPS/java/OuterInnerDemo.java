package OOPS.java;


class Outer{
	
	int x = 15;
	
	class Inner{
		
		int y = 60;
		
		public void add() {
			int z = x + y;
			
			System.out.println("Result : "+z);
		}
	}
	
}
public class OuterInnerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer out = new Outer();
		Outer.Inner in = out.new Inner();
		
		in.add();
		

	}

}
