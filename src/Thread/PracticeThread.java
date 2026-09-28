package Thread;

class TtThread extends Thread{
	public void run() {
		
		try {
			for(int i =500; i <= 600; i++) {
//				
				System.out.println("thread 1 : "+i);
				Thread.sleep(0);
			}
			
		}catch(InterruptedException ie) {
			ie.printStackTrace();
		}
	}
}

class Tt2Thread extends Thread{
	public void run() {
		
		try {
			for(int i =601; i <= 650; i++) {
//				
				System.out.println("thread 2 : "+i);
				Thread.sleep(0);
			}
			
		}catch(InterruptedException ie) {
			ie.printStackTrace();
		}
	}
}


public class PracticeThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TtThread tt = new TtThread();
		Tt2Thread tt2 = new Tt2Thread();
		
		//here run method not act like a thread that is why it's run one by one not alternate
		
		tt.run(); //first one task complete the next one start 
		tt2.run();
		
//		tt.start(); //print alternative ways it's act like a thread
//		tt2.start();
		
		 
	}

}
