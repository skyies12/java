package Chapter02;
import java.util.Scanner;

public class Exam_08 {
	public static void main(String[] args) {
		System.out.println("정수를 입력해주세요.");
		
		Scanner sc = new Scanner(System.in);
		
		int result = 0;
		
		do {
			int num = sc.nextInt();
			result = result + num;
			
			if (num == 0) {
				System.out.println(result);
			}	
		} while (result >= 0);
		
		sc.close();
	}
}
