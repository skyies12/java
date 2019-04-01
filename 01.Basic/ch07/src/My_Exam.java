public class My_Exam {
	public static void main(String[] args) {
		// 파라미터 없는 반환 없는 메서드
		hello();
		
		// 파라미터 있고 반환 없는 메서드
		MyAdd(2,5);
		
		// 파라미터 없고 반환 있는 메서드
		System.out.println(Temper());
		
		// 파라미터 있고 반환 있는 메서드
		System.out.println(Sum(4,2));
		
	}
	
	public static void hello() {
		System.out.println("Hello");
	}
	
	public static void MyAdd(int num1, int num2) {
		int nResult = num1 + num2;
		System.out.println(nResult);
	}
	
	public static int Temper() {
		return 16;
	}
	
	public static int Sum(int num1, int num2) {
		int nSum = num1 + num2;
		return nSum;
	}
}