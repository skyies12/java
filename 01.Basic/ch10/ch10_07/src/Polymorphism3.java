abstract class Human {
	abstract void print();
}

class Man extends Human {
	void print() {
		System.out.println("남자 아이입니다.");
	}
}

class Women extends Human {
	void print() {
		System.out.println("여자 아이입니다.");
	}
}

public class Polymorphism3 {
	public static Human humanCreate(int kind) {
		if(kind == 1) {
			Human m = new Man();
			return m;
//			return new Man();
		} else {
//			Human w = new Women();
//			return w;
			return new Women();
		}
	}
	
	public static void main(String[] args) {
//		생성된 애가 남자인지 여자인지 중요하지 않고,
//		난 생성된 인간 객체의 프린트 기능만 쓸 것이다.
//		남자이면 남자애가 가진 기능을 할 것이고,
//		여자이면 여자애가 가진 기능을 할 것이다.
		
		Human h1 = humanCreate(1);
		h1.print();
		
		Human h2 = humanCreate(2);
		h2.print();
	}
}