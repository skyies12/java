import java.util.Scanner;

public class Exam06_01 {
	public static void main(String[] args) {
		
		System.out.println("두개의 정수를 입력하세요");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 정수 : ");
		int num1 = sc.nextInt();
		
		System.out.println("두번째 정수 : ");
		int num2 = sc.nextInt();
			
		int sum = 0;
		
		if (num1 > num2){
			sum = num1 - num2;
		} else {
			sum = num2 - num1;
		}
		System.out.println("계산 값 = " + sum);
		sc.close();
	}
}