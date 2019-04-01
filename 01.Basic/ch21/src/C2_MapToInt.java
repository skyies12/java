import java.util.Arrays;
import java.util.List;

// 스트림을 구성하는 데이터를 조건에 따라 변환하는 연산
public class C2_MapToInt {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Robot", "Box", "Simple");
		
		list.stream().map(s -> s.length()).forEach(s -> System.out.print(s + "\t"));
	}
}