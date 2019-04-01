package Chapter02;
import java.util.Scanner;

public class Exam_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("두개의 정수를 입력하세요 : ");
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int quot = num1 / num2;
		int ream = num1 % num2;
		
		System.out.printf("%d 나누기 %d의 몫은 %d 입니다.%n", num1, num2, quot);
		System.out.printf("%d 나누기 %d의 나머지은 %d 입니다.", num1, num2, ream);
		
		sc.close();
	}
}
