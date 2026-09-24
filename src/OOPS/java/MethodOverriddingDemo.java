package OOPS.java;

class Parent6{
	public void show() {
		
		System.out.println("I am in the parent class");
	}
}

class Child6 extends Parent6{
	public void show() {
		System.out.println("I am in the child class");
		super.show();//calling the super class
	}
}

public class MethodOverriddingDemo { // run time 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child6 ch = new Child6();
		ch.show();
	}

}
