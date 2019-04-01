package Chapter06;

import java.util.Scanner;

public class Exam6_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("몇 개의 정수를 입력하시겠습니까?");
		int use = sc.nextInt();
		
		double avg = 0;
		double sum = 0;
		
		for (int i = 1; i <= use; i++) {
			System.out.print("정수 입력 : ");
			double num = sc.nextDouble();
			
			sum = sum + num;
			avg = sum/use;
		}
		System.out.println("입력 받은 숫자들의 평균 값 : " + avg);
		sc.close();
	}

}
