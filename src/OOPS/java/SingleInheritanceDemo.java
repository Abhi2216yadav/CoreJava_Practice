package OOPS.java;

class Parant{
	public int x = 25;
}

class Child extends Parant{
	
	public int y = 60;
	
	public void add() {
		System.out.println("Sum : "+(x+y));
	}
}

public class SingleInheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c = new Child();
		c.add();
	}

}
