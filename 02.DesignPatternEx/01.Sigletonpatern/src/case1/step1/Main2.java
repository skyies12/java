package case1.step1;

public class Main2 {
	static int nNum = 0;
	
	public static void main(String[] args) {
		Runnable task = () -> {
			try {
				Database database = Database.getInstance(nNum +" Database");
				System.out.println("This is the " + database.getConnection() + " !!");
			} catch (Exception e) {
				
			}
		};
		
		for (int i = 0; i < 100; i++) {
			nNum++;
			Thread t = new Thread(task);
			t.start();
		}
	}
}