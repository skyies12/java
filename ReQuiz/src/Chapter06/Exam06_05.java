package Chapter06;
import java.util.Scanner;

public class Exam06_05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("입력한 정수의 합을 구하는 프로그램\n");
		System.out.println("정수를 입력하시오.");
		
		int sum = 0;
		
		while(true) {
			System.out.print("정수 입력 : ");
			int num = sc.nextInt();
			if (num == 0) {
				System.out.println("입력한 값의 합 : " + sum);
				break;
			}	
			sum = sum + num;
		}
		sc.close();
	}
}