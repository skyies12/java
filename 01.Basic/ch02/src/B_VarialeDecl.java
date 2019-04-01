public class B_VarialeDecl {
	public static void main(String[] args) {
	//	double num1, num2;		두개 변수 동시 선언
	//	double result;
		
		double num1, num2, result;	//여러 변수 동시 선언
		
		num1 = 1.0000001;
		num2 = 2.0000001;
		result = num1 + num2;
		System.out.println(result);
		System.out.printf("%.7f%n", result);
	}
}
