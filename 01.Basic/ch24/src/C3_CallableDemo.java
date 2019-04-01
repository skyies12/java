import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class C3_CallableDemo {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Callable<Integer> task = () -> {
			int sum = 0;
			for(int i = 0; i < 10; i++) {
				sum = sum + i;
			}
			return sum;
		};
		
		Callable<Integer> task1 = () -> {
			int sum = 0;
			for(int i = 0; i < 10; i+=2) {
				sum = sum + i;
			}
			return sum;
		};
		
		ExecutorService exr = Executors.newSingleThreadExecutor();
		Future<Integer> fur = exr.submit(task);
		Future<Integer> fur1 = exr.submit(task1);
		
		Integer r = fur.get();
		Integer t = fur1.get();
		Integer r1 = fur.get();
		System.out.println("result : " + r);
		System.out.println("result : " + t);
		System.out.println("result : " + r1);

		exr.shutdown();
	}

}
