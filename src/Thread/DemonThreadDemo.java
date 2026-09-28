package Thread;

class TestThread extends Thread{
	public void run() {
		
		try {
			for(int i =1; i <= 100; i++) {
//				
				System.out.println(this.currentThread().getName()+i);
				Thread.sleep(100);
			}
			
		}catch(InterruptedException ie) {
			ie.printStackTrace();
		}
	}
}
public class DemonThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestThread tt = new TestThread();
		 
		
		tt.setDaemon(true);// it's low priority thread generaly main thread is wait for other thread to be 
		tt.start();
		
		try {
			for(int i =101; i <= 150; i++) {
//				
				System.out.println("main"+i);
				Thread.sleep(100);
			}
			
		}catch(InterruptedException ie) {
			ie.printStackTrace();
		}
		 
	}

}
