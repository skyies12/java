
public class Main {

	public static void main(String[] args) throws InterruptedException {
		try {
			ConnectionPool cp = ConnectionPool.getInstance(
					"jdbc:oracle:thin:@localhost:1521:xe",
					"scott",
					"tiger", 5, 10);
		} catch (Exception sqle) {
			sqle.printStackTrace();
		}
		
		
		for (int i = 0; i < 10; i++) {
			TestThread test = new TestThread(i);
			test.start();
			Thread.sleep(50);
		}
	}
}