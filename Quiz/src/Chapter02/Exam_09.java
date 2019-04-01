package Chapter02;
import java.util.Scanner;

public class Exam_09 {
	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("몇 개의 정수를 입력하시겠습니까?");
		int num = sc.nextInt();
		int result = 0;
		
		do {
			
			int num1 = sc.nextInt();
			result = result + num1/num;
			
			if (num1 <= num) {
				System.out.println(result);
			}	
		} while (result >= 0);
		
		sc.close();
	}
}
