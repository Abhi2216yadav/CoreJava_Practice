package OOPS.java;

class Percel{
	
	class Destination{
		public void desti(String loc) {
			System.out.println("Location is : "+loc);
		}
	}
	
	class Contents{
		public void weigth(double w) {
			System.out.println("Weigth : "+ w);
		}
	}
}
public class NestedClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Percel pr = new Percel();
		Percel.Destination de = pr.new Destination();
		de.desti("Hooghly");
		
		Percel.Contents co = pr.new Contents();
		co.weigth(12.0);
	}

}

//Interface is an contact b/t the client code and the implemented class