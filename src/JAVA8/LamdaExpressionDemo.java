package JAVA8;

public class LamdaExpressionDemo { //funtional programming

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inter1 i1 = ()-> System.out.println("Hello");
		i1.show();
		
		Inter2 i2 = (a, b)->System.out.println("Addition = "+(a + b));
		 i2.add(2, 5);
		 
//		 Inter3 i3 = (a, b)->System.out.println("Multiply = " +(a * b)); //void case
//		 i3.mulp(2, 5);
		 
		Inter3 i3 = (a, b)->a * b; //return type case
		int res = i3.mulp(2, 5);
		System.out.println("Multiply = " + res);
	}	

}
