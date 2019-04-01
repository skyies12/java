package Chapter06;
import java.util.Scanner;

public class Exam06_06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("사용자로부터 다음 순서대로 정수를 입력받은 후 평균을 구하여 출력하는 프로그램");
		System.out.println();
		
		System.out.println("몇 개의 정수를 입력하시겠습니까?");
		int useNum = sc.nextInt();
		System.out.println();
		
		double sum = 0;
		double avg = 0;
		
		for(int i = 0; i < useNum; i++) {
			System.out.print("정수 입력 : ");
			double user = sc.nextDouble();
			
			sum = sum + user;
			avg = sum/useNum;
		}
		System.out.println();
		System.out.printf("입력받은 정수의 평균 값 : %.2f", avg);
		
		sc.close();
	}
}