package Chapter06;
import java.util.Scanner;

public class Exam06_02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수 : ");
		int num1 = sc.nextInt();
		
		System.out.print("영어 점수 : ");
		int num2 = sc.nextInt();
		
		System.out.print("수학 점수 : ");
		int num3 = sc.nextInt();
		
		int diff = (num1 + num2 + num3)/3;
		String grade = " ";
		
		if (diff >= 90) {
			grade = "A";
		} else if (diff >= 80) {
			grade = "B";
		} else if (diff >= 70) {
			grade = "C";
		} else if (diff >= 60) {
			grade = "D";
		} else {
			grade = "F";
		}
		System.out.printf("당신의 학점은 %s 입니다.",grade);
		
		
		sc.close();
	}

}
