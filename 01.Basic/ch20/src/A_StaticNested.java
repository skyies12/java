//static 네스티드 클래스는 static 선언이
//갖는 특성이 반영된 클래스이다.
//따라서 자신을 감싸는 외부 클래스의 
//인스턴스와 상관없이 static 네스티드
//클래스의 인스턴스 생성이 가능하다.

class Outer1 {
	static private int num = 0;
	
	static class Nested1 {	// static 네스티드 클래스
		void Add(int n) {	// Outer 클래스의 static 변수 공유
			num = num + n;
		}
	}
	
	static class Nested2 {
		int get() {
			return num;
		}
	}
}

//class Outer1 {
//	private static int num = 0;
//	
//	static class Nested1 {
//		void Add(int n) {
//			num = num + n;
//		}
//	}
//	
//	static class Nested2 {
//		int get() {
//			return num;
//		}
//	}
//}
public class A_StaticNested {
	public static void main(String[] args) {
		Outer1.Nested1 nested1 = new Outer1.Nested1();	// 인스턴스 생성
			
		nested1.Add(5);
		
		Outer1.Nested2 nested2 = new Outer1.Nested2();
		System.out.println(nested2.get());
		
//		Outer1.Nested1 nested1 = new Outer1.Nested1();
//		nested1.Add(5);
//		
//		Outer1.Nested2 nested2 = new Outer1.Nested2();
//		System.out.println(nested2.get());
	}
}