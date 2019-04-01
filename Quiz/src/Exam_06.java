import java.util.Scanner;

public class Exam_06 {
	public static void main(String[] args) {
		System.out.println("정수를 입력하세요. : ");
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int result = 1;
		
		while (num > 0){
			System.out.print(num + "*");
			result = result * num--;
		}
		System.out.println("\b = " + result);
		
		sc.close();
	}
}