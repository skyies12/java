import java.util.Scanner;

public class Exam07_02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫 번째 정수 : ");
		int num1 = sc.nextInt();
		
		System.out.println("두 번째 정수 : ");
		int num2 = sc.nextInt();
		
		System.out.println("세 번째 정수 : ");
		int num3 = sc.nextInt();
		
		Input(num1, num2, num3);

		sc.close();

	}
	
	public static int Input (int num1, int num2, int num3) {
		if (num1 > num2 && num1 > num3) {
			System.out.println("가장 큰수 : " + num1);
		} else if (num1 < num2 && num2 > num3) {
			System.out.println("가장 큰수 : " + num2);
		} else if (num1 < num3 && num2 < num3) {
			System.out.println("가장 큰수 : " + num3);
		}
		return 1;
	}
}
