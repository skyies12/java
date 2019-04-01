class Calc {
	// 멤버 변수 <-- 필드
	// 멤버 변수 <-- 메서드
}

class Fruit {
	
}
class Banana extends Fruit{
	
}
class Orange extends Fruit{
	
}
class Apple extends Fruit{
	
}
class MyTest1 {
	public static void printAAA(Object o) {
		// 과일 주스 만들기
		
			// 사과 주스 만들기
		if (o instanceof Apple) {
			Apple myObj = (Apple)o;
			// 오렌지 주스 만들기	
		} else if(o instanceof Orange) {
			Orange myObj = (Orange)o;
			// 바나나 주스 만들기	
		} else if(o instanceof Banana){
			Banana myObj = (Banana)o;
		}
	}
}

class MyTest {
	public static void main(String[] args) {
		// 변수타입 변수명 = 값;
		int num = 1;
		int num1;		// 초기화가 안됨
		int num2 = 2;	// 2로 초기화
		// 기본 자료형
		// char, boolean, byte, int, long
		// float, double
		
		// 참조 자료형 <-- 클래스 타입의 변수
		// 클래스타입 변수명 = new 클래스();
		
		Calc obj = new Calc();
//		Calc obj2 = new Banana();
//		int numx = true;
		Calc obj3 = obj;
		Banana objx1 = new Banana();
		Fruit objx2 = new Fruit();
		
		MyTest1.printAAA(new Banana());
		MyTest1.printAAA(new Orange());
		MyTest1.printAAA(new Apple());
		MyTest1.printAAA(new Calc());
	}
}
