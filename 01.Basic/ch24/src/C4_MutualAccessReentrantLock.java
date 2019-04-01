import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

class Counter4 {
	int count = 0;
	ReentrantLock criticObj = new ReentrantLock();
	
	public void increment() {
		criticObj.lock();	// 문을 잠근다
		
		try {
			count++;	// 한 쓰레드에 의해서만 실행되는 영역
		} finally {
			criticObj.unlock();	// 문을 연다.
		}
	}
	
	public void decrement() {
		criticObj.lock();
		
		try {
			count--;
		} finally {
			criticObj.unlock();
		}
	}
	
	public int getCount() {
		return count;
	}
}
public class C4_MutualAccessReentrantLock {
	public static Counter4 cnt = new Counter4();
	
	public static void main(String[] args) throws InterruptedException {
		Runnable task1 = () -> {
			for(int i = 0; i < 1000; i++) {
				cnt.increment();
			}
		};
		
		Runnable task2 = () -> {
			for(int i = 0; i < 1000; i++) {
				cnt.decrement();
			}
		};
		
		ExecutorService exr = Executors.newFixedThreadPool(2);
		exr.submit(task1);
		exr.submit(task2);
		
		exr.shutdown();
		exr.awaitTermination(100, TimeUnit.SECONDS);
//		.awaitTermination은 shutdown()메서드 호출이후 해당 시간만큼안에 
//		쓰레드풀의 작업이 전부 수행하지 못하면 실행중이던 쓰레드에 인터럽트를 
//		발생시키고 false 반환한다

		System.out.println(cnt.getCount());
	}
}