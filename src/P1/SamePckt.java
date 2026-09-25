package P1;

class Test{
	public int x = 25; //denote by " + " sign
	private int y = 30; // denote by " - " sign
	protected int z = 60; // denote by " # " sign
	int d = 45;
	
	public void show_x() {
		System.out.println("X : "+ x);
	}
	
	private void show_y() {  // are accessable in same class only
		System.out.println("Y : "+ y);
	}
	
	protected void show_z() {
		System.out.println("Z : "+ z);
	}
	
	void show_d() { //default are access same 
		System.out.println("D : "+ d);
	}
}

public class SamePckt extends Test{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SamePckt t = new SamePckt();
		t.show_x();
//		t.show_y(); only access by same class not subclass
		t.show_z();
		t.show_d();
	}

}
