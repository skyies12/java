import java.util.Arrays;
import java.util.List;

// 컬렉션 인스턴스를 대상으로 스트림 생성하기
public class B4_ListStream {
	public static void main(String[] args) {
//		List<String> list = Arrays.asList("Toy", "Robot", "Box");
//		
//		list.stream().forEach(l -> System.out.print(l + "\t"));
//		System.out.println();
		
		List<String> list = Arrays.asList("Wook", "Son", "Yu");
		
		list.stream().forEach(l -> System.out.print(l + "\t"));
	}

}
