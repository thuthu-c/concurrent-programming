
public class ConcurrentCounter extends Thread{
	private long id; 
	private Counter counter;
	
	public ConcurrentCounter(long id, Counter counter) {
		super();
		this.id = id;
		this.counter = counter;
	}
	
	@Override
	public void run() {
		 for (int i = 0; i < 100; i++) {
             try {
            	 System.out.printf("%d;%d%n", id, counter.getNext());
            	 sleep(10);
             }catch (InterruptedException e) {
            	 
             }
         }
	}
}
