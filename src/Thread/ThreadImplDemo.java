package Thread;

//Always implements runnable is better than extending thread class
//if a child class want to get thread facility it is not possible for extending class because java 
//does not support multiple inheritance 
//but in case implements runnable it is possible

class FstThread implements Runnable{ //it's runnable class , interface not a actual thread

	@Override
	public void run() {
		// TODO Auto-generated method stub
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

class sdThread implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i =101; i <= 200; i++) {
			
			try {
			System.out.println("THREAD2 : "+i);
			Thread.sleep(100);
			
			}catch(InterruptedException ie) {
				ie.printStackTrace();
			}
		}

	}
	
}
public class ThreadImplDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		FstThread ft = new FstThread();
//		ft.run();
		
		Thread th1 = new Thread(new FstThread());
		Thread th2 = new Thread(new sdThread());
		
		th1.start();
		th2.start();
		
	}

}
