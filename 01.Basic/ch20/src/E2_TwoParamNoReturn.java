interface Calculate3 {
	void cal(int a, int b, int c);		// 매개변수 둘, 반환형 void
}

public class E2_TwoParamNoReturn {
	public static void main(String[] args) {
		Calculate3 d;
		
		d = (a, b, c) -> System.out.println("aaa");
		d.cal(4, 3, 2);
		
		d = (a, b, c) -> System.out.println(a - b + c);
		d.cal(4, 3, 2);
		
		d = (a, b, c) -> System.out.println(a * b + c);
		d.cal(4, 3, 2);
	}
}