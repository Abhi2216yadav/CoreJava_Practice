package OOPS.java;

// if we declare variable is final it will be constant
// if we declare method is final it ca'nt be override
//if we declare class is final it can't be inheritance

final class Parents{
	public final void display() { //can not override 
		System.out.println("I am in Parent class");
	}
}

//class Childs extends Parents{ // it can't be inheritance
//	public void Displays() { // it ca'nt be override
//		System.out.println("I am in Child class");
//	}
////}

public class FinalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parents p = new Parents();
		p.display();
	}

}
