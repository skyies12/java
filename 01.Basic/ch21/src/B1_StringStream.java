import java.util.Arrays;
import java.util.stream.Stream;

//for-each 요소를 하나씩 꺼내 옴
class B1_StringStream {
	public static void main(String[] args) {
//		String[] names = {"Yoon", "Lee", "Park"};
//		
//		// 스트림 생성
//		Stream<String> stm = Arrays.stream(names);
//		
//		// 최종 연산 진행
//		stm.forEach(s -> System.out.println(s));
		
		String[] names = {"Son", "Yu", "Jeung"};
		
		Stream<String> stm = Arrays.stream(names);
		
		stm.forEach(s -> System.out.println(s));
	}
}