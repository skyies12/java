package Chapter06;
import java.util.Scanner;

public class Exam06_03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력정수 : ");
		int num1 = sc.nextInt();
		
		System.out.printf("%d! = ", num1);
		// 3! = 3 * 2 * 1
		
		int result = 1;
		
		while (num1 >= 1) {
			if (num1 != 1) {
				System.out.print(num1 + " * ");
			} else {
				System.out.print(num1 + " = ");
			}
			result = result * num1;
			num1--;
		}
		System.out.println(result);
		
		sc.close();
	}

}
