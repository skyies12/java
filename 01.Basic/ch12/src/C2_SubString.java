// 문자열의 일부 추출

public class C2_SubString {
	public static void main(String[] args) {
		String st1 = "123456789";
		
		String st2 = st1.substring(2);
		System.out.println(st2);

		String st3 = st1.substring(2,4);
		System.out.println(st3);
	}
}