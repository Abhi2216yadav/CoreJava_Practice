package Thread;

//here is three thread two class and one main
class FirstThread extends Thread{
	public void run() {
		for(int i =1; i <= 100; i++) {
			
			try {
			System.out.println("THREAD1 : "+i);
			Thread.sleep(100);
			
			}catch(InterruptedException ie) {
				ie.printStackTrace();
			}
		}
	}
}

class SecondThread extends Thread{
	public void run() {
		for(int i =101; i <= 200; i++) {
//			System.out.println("THREAD2 : "+i);
			
			try {
				System.out.println("THREAD2 : "+i);
				Thread.sleep(150);
				
				}catch(InterruptedException ie) {
					ie.printStackTrace();
				}
		}
	}
}
public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FirstThread ft = new FirstThread();//ready stage
		SecondThread sd = new SecondThread();
		
		ft.start();
		sd.start();
		
		for(int i =201; i <= 300; i++) {
			
			try {
			System.out.println("Main : "+i);
			Thread.sleep(100);
			
			}catch(InterruptedException ie) {
				ie.printStackTrace();
			}
		}

 
	}

}
