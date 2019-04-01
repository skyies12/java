public class MyExam_3 {
	public static void main(String[] args) {
		
		Add2(2, 5);
		Add1(2, 4);
		
		for (int i = 0; i < 10; i++) {
			System.out.print(i);
		}

	}
	
	public static void Add2(int num3, int num4) {
		int num1 = num3;
		int num2 = num4;
		
		System.out.println(num1 * num2);
	}
	
	public static void Add1(int num1, int num2) {
		System.out.println(num1 + num2);
	}
}