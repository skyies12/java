public class D_LogicalOp {
	public static void main(String[] args) {
		int num1 = 11;
		int num2 = 22;
		boolean result;
		
		result = (1 < num1) && (num2 < 100);
		System.out.println("1초과 100미만인가? " + result);
		
		result = ((num2 % 2) == 0) || ((num2 % 3) == 0);
		System.out.println("2 또는 3의 배수인가? " + result);
		
		result = !(num1 != 0);
		System.out.println("(결과적으로)참이 아니다. " + result);
	}
}
