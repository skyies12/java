package Chapter06;
import java.util.Scanner;

public class Exam06_03 {

	public static void main(String[] args) {
		//5! -> 5 x 4 x 3 x 2 x 1 = 120
		Scanner sc = new Scanner(System.in);
		System.out.println("팩토리얼 결과를 출력하는 프로그램");
		System.out.print("하나의 정수를 입력하시오.");
		int num = sc.nextInt();
		int avg = 1;
		
		while(num > 0) {
			if (num == 1) {
				System.out.print(num + " = ");
			} else {
				System.out.print(num + " x ");
			}
			avg = avg * num;
			num--;
		}
		System.out.println(avg);
		sc.close();
	}

}
