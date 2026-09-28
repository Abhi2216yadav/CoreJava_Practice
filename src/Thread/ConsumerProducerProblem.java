package Thread;

class Stock{
	
	public int qoh = 50;
	public synchronized void issue(int req) {
		
		if(req> this.qoh) {
				
			try {
				this.wait();
	
			}catch(InterruptedException ie) {
				
				ie.printStackTrace();
			}
		}
		
		System.out.println("Currect stock : "+(this.qoh - req));
		 
	}
	
	public synchronized void demand(int d) {
		
		this.qoh = this.qoh + d;
		System.out.println("After Producer deposite : "+this.qoh);
		this.notify();
	}
}

class Consumer extends Thread{
	
	Stock s;
	public Consumer(Stock s) {
		this.s = s;
	}
	public void run() {
		s.issue(75);
	}
}

class Producer extends Thread{
	
	Stock s;
	public Producer(Stock s) {
		this.s = s;
	}
	public void run() {
		s.demand(50);
	}
}

public class ConsumerProducerProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stock sc = new Stock();
		
		Consumer c = new Consumer(sc);
		Producer p = new Producer(sc);
		
		c.start();
		p.start();

	}

}
