abstract class Calce {
	int a = 5;
	int b = 6;
	
	abstract void Plus();
}

class MyCalc extends Calce {
	void Plus() {System.out.println((a + b));}
	void Minus() {System.out.println((a - b));}
}

class polymorphism01 {
	public static void main(String[] args) {
		MyCalc mycalc1 = new MyCalc();
		mycalc1.Plus();
		mycalc1.Minus();

//		하위클래스 객체를 상위 클래스 객체에 대입
		Calce mycalc2 = new MyCalc();
		mycalc2.Plus();
//		다음 메서드는 설계도가 없다. 사용할 수 없다.
//		mycalc1.Minus();
	}
}