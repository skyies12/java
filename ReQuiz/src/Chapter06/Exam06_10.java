package Chapter06;
import java.util.Scanner;

public class Exam06_10 {
	public static void main(String[] args) {
		System.out.println("다섯 개의 정수를 입력 합을 구하는 프로그램");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println();
		System.out.println("5개의 정수를 입력하시오.");
		
		int sum = 0;
		int i = 0;
		
		while(i < 5) {
			System.out.print("정수 입력 : ");
			int use = sc.nextInt();
			
			if(use < 1) {
				System.out.println("재입력 해주세요.");
				continue;
			}
			i++;
			sum = sum + use;
		}
		System.out.println("입력 받은 정수의 합 : " + sum);
		
		sc.close();
	}

}
