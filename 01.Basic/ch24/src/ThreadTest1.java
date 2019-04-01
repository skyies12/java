class Result {
	int num = 0;
	
	void Sum(int n) {
		num = n;
		
		for (int i = n; i >= 0; i--) {
			num = num + i;
		}
	}
	
	public int getSum() {
		return num;
	}
}
public class ThreadTest1 {	
	public static void main(String[] args) {
		Result re = new Result();
		
		Runnable task = () -> {
			for(int i = 0; i < 5; i++) {
				re.Sum(i);
			}
		};
		
		Thread t = new Thread(task);
		t.start();
		
		System.out.println(re.getSum());

	}
}