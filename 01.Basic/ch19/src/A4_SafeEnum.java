enum Animal2 {
	DOG, CAT
}

enum Person2 {
	MAN, WOMAN;
}

public class A4_SafeEnum {
	public static void main(String[] args) {
		// 정상적인 메소드 호출
		who(Person2.WOMAN);
		
		// 비정상적인 메소드 호출
		
		who(Animal2.DOG);

	}
	public static void who(Person2 man) {
		switch (man) {
		case MAN:
			System.out.println("남성 손님입니다.");
			break;
		case WOMAN:
			System.out.println("여성 손님입니다.");
			break;
		}
	}
	
	public static void who(Animal2 dog) {
		switch (dog) {
		case DOG:
			System.out.println("강아지 입니다.");
			break;
		case CAT:
			System.out.println("고양이 입니다.");
			break;
		}
	}

}
