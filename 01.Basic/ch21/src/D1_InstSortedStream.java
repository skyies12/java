import java.util.stream.Stream;

public class D1_InstSortedStream {
	public static void main(String[] args) {
//		Stream.of("Box", "Apple", "Robot")
		// String 인스턴스는 Comparable<String> 인터페이스를 구현! 이를 기반으로 한 정렬
//			.sorted()	
//			.forEach(s -> System.out.print(s + "\t"));
//		System.out.println();

		Stream.of("Box", "Apple", "Robot")
		// compareTo 메소드에 대한 람다식! 이를 기반으로 정렬
			.sorted((s1, s2) -> s2.compareTo(s1))	
			.forEach(s -> System.out.print(s + "\t"));
		System.out.println();
	}

}
