public class D_Conversion {

	public static void main(String[] args) {
		
		// �ڵ� ����ȯ
		double pi = 3.1415;
		int wholeNumber = (int)pi;
		System.out.println(wholeNumber);
		
		long num1 = 3000000007L;
		int num2 = (int)num1;
		System.out.println(num2);
		
		// ����� ����ȯ
		short sum1 = 1;
		short sum2 = 2;
		short sum3 = (short)(sum1 + sum2);
		System.out.println(sum3);
	}
}
