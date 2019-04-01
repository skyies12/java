package Chapter06;
import java.util.Scanner;

public class Exam06_06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("몇 개의 정수를 입력하시겠습니다?");
		double num1 = sc.nextDouble();
		double num3 = num1;
		
		double result = 0;
		
		do {
			System.out.println("숫자 입력 : ");
			double num2 = sc.nextDouble();
			
			result = result + num2/num3;
			num1--;
		} while(num1 >= 1);
		
		System.out.println("평균 값 : " + result);
		sc.close();
	}

}