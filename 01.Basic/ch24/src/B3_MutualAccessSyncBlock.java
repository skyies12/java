class Counter3 {
	private int count = 0;
	
	public void increment() {
		synchronized (this) { // 동기화 블록 생성
			count++;
		}
	}
	public void decrement() {
		synchronized (this) { // 동기화 블록 생성
			count--;
		}
	}
	public int getCount() {
		return count;
	}
}
public class B3_MutualAccessSyncBlock {
	public static Counter3 cnt = new Counter3();
	
	public static void main(String[] args) throws InterruptedException {
		Runnable task1 = () -> {
			for(int i = 0;i < 1000; i++) {
				cnt.increment();
			}
		};
		
		Runnable task2 = () -> {
			for(int i = 0; i < 1000; i++) {
				cnt.decrement();
			}
		};
		
		Thread t1 = new Thread(task1);
		Thread t2 = new Thread(task2);
		
		t1.start();	// t1이 참조하는 쓰레드의 종료를 기다림
		t2.start();	// t2이 참조하는 쓰레드의 종료를 기다림
		
		// 쓰레드가 종료되면 출력을 진행함. 위 join의 영향
		t1.join();
		t2.join();
		
		System.out.println(cnt.getCount());
	}
}