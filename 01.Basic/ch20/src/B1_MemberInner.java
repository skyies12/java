// 멤버 클래스의 인스턴스는 외부 클래스의 
// 인스턴스에 종속적이다.


//class Outer2 {
//	private int num = 0; // 멤버 변수
//	// static으로 바꾸면 num이 공유가 되기 때문에 o1,o2의 값이 저장 된다.
//	
//	class Member {		// 멤버 클래스 생성
//		void add(int n) {
//			num = num + n;
//		}
//		int get() {
//			return num;
//		}
//	}
//}

class Outer2 {
	private int num = 0;
	
	class Member {
		void add(int n) {
			num = num + n;
		}
		int get() {
			return num;
		}
	}
}

public class B1_MemberInner {
	public static void main(String[] args) {
//		Outer2 o1 = new Outer2();
//		Outer2 o2 = new Outer2();
//		
//		// o1 기반으로 두 인스턴스 생성
//		Outer2.Member o1m1 = o1.new Member();
//		Outer2.Member o1m2 = o1.new Member();
//		
//		// o2 기반으로 두 인스턴스 생성
//		Outer2.Member o2m1 = o2.new Member();
//		Outer2.Member o2m2 = o2.new Member();
//		
//		// o1 기반으로 생성된 두 인스턴스의 메소드 호출
//		o1m1.add(5);
//		System.out.println(o1m2.get());
//	
//		// o2 기반으로 생성된 두 인스턴스의 메소드 호출
//		o2m1.add(7);
//		System.out.println(o2m2.get());
		
		Outer2 o1 = new Outer2();
		Outer2 o2 = new Outer2();
		
		Outer2.Member o1m1 = o1.new Member();
		Outer2.Member o1m2 = o1.new Member();
		
		Outer2.Member o2m1 = o2.new Member(); 
		Outer2.Member o2m2 = o2.new Member(); 
		
		o1m1.add(5);
		System.out.println(o1m2.get());
		
		o2m1.add(7);
		System.out.println(o2m2.get());
	}
}