
public class App {
	public static void main(String[] args) {
		Counter counter = new Counter();
		for(long i = 0; i < 10; ++i) {
			new ConcurrentCounter(i, counter).start();
		}
	}
}
