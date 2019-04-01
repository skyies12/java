package Chapter02;
import java.util.Scanner;

public class Exam_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력해주세요 : ");
		int num1 = sc.nextInt();
		int sum = num1 * num1;
		
		System.out.printf("계산 값 : %d%n" , sum);
		
		sc.close();
	}
}
