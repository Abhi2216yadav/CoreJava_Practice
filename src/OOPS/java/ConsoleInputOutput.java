package OOPS.java;

import java.util.Scanner;

public class ConsoleInputOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter your name : ");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		
		System.out.println("Enter your age : ");
		int age = sc.nextInt();
		
		System.out.println("Enter your Salary : ");
		double salary = sc.nextDouble();
		
		System.out.println("Name is : "+name);
		System.out.println("Age is : "+age);
		System.out.println("Salary is : "+salary);
		
		
	}

}
