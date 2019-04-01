import java.util.Arrays;
import java.util.List;

// 스트림을 구성하는 데이터 중 일부를 조건에 따라 걸러내는 연산
public class C1_FilterStream {
	public static void main(String[] args) {
		int[] ar = {1,2,3,4,5};
		
		Arrays.stream(ar).filter(n -> n % 2 == 1).forEach(n -> System.out.print(n + "\t"));
		System.out.println();
		
		List<String> list = Arrays.asList("Robot", "Toy", "Box");
		
		list.stream().filter(s -> s.length() == 3).forEach(s -> System.out.print(s + "\t"));
		System.out.println();
	}
}