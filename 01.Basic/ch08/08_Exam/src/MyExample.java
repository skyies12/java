class Car {
	int 연료량;
	int 속도;
	
	Car() {
		연료량 = 10;
		속도 = 0;
	}
	
	void 엑셀레이터() {
		속도 = 속도 + 1;
		연료량 = 연료량 - 1;
	}
	
	void 브레이크() {
		속도 = 속도 - 1;
	}
	
	void 상태() {
		System.out.println("연료량 " +  연료량);
		System.out.println("속도 " +  속도);;
	}
}

public class MyExample {

	public static void main(String[] args) {
		
		Car car1 = new Car();
		car1.상태();
		
		car1.엑셀레이터();
		car1.엑셀레이터();
		car1.상태();
		
		car1.브레이크();
		car1.상태();
		
		Car car2 = new Car();
		car2.엑셀레이터();
		car2.엑셀레이터();
		car2.엑셀레이터();
		car2.엑셀레이터();
		car2.상태();
		
		car1.브레이크();
		car1.상태();
	}
}