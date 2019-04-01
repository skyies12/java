package Chapter07;
import java.util.Scanner;

public class Exam07_01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫 번째 정수 : ");
		int num1 = sc.nextInt();
		
		System.out.println("두 번째 정수 : ");
		int num2 = sc.nextInt();
		
		System.out.println("세 번째 정수 : ");
		int num3 = sc.nextInt();
		
		Result(num1, num2, num3);

		sc.close();
	}
	public static int Result(int num1, int num2, int num3) {
		int nResult = (num1 + num2 + num3)/3;
		System.out.println("평균 값 : " + nResult);
		return nResult;
	}
}
