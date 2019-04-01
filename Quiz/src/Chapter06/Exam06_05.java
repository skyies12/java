package Chapter06;
import java.util.Scanner;

public class Exam06_05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		
		do {
			int num = sc.nextInt();
			sum = sum + num;
			
			if (num == 0) {
				System.out.println("계산 값 : " + sum);
			}
		} while(sum >= 0);
		
		sc.close();
	}

}
