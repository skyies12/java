enum Person4 {
	MAN, WOMAN;
	
	@Override
	public String toString() {
		return "I am a cat person";
	}
}
class B2_EnumConst {
	public static void main(String[] args) {
		System.out.println(Person4.MAN);	// toString 메서드의 반환 값 출력
		System.out.println(Person4.WOMAN);
	}
}
//모든 열거형은 java.lang.Enum<E> 클래스를 상속한다.
//그리고 Enum<E>는 Object 클래스를 상속한다.
//이런 측면에서 볼 때 열거형은 클래스이다.