package Chapter06;

import java.util.Scanner;

public class Exam6_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어, 영어, 수학의 점수를 입력하시오.");
		
		System.out.print("국어 점수 : ");
		int num1 = sc.nextInt();
		
		System.out.print("영어 점수 : ");
		int num2 = sc.nextInt();
		
		System.out.print("수학 점수 : ");
		int num3 = sc.nextInt();
		
		int avg = (num1 + num2 + num3)/3;
		
		if(avg >= 90) {
			System.out.println("당신의 학점은 A입니다.");
		} else if(avg >= 80) {
			System.out.println("당신의 학점은 B입니다.");
		} else if(avg >= 70) {
			System.out.println("당신의 학점은 C입니다.");
		} else if(avg >= 60) {
			System.out.println("당신의 학점은 D입니다.");
		} else {
			System.out.println("당신의 학점은 F입니다.");
		}
		
		sc.close();
	}

}
