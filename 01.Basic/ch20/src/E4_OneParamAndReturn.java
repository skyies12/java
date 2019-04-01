interface HowLong {
	int Len(String s);	// 값을 반환하는 메소드
}

public class E4_OneParamAndReturn {
	public static void main(String[] args) {
		HowLong hl = s -> s.length();
//		int num = hl.Len("I am so happy"); 이와 같이 연산 결과가 남는다.
		System.out.println(hl.Len("I am so happy"));
	}
}