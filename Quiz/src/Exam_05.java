import java.util.Scanner;

//학생의 전체 평균점수에 대한 학점을 출력하는 프로그램을 작성하라.
//실행시 국어, 영어, 수학의 점수를 차례로 입력받은 후 평균을 구한 후
//90점이상 A, 80점이상 B, 70점이상 C, 50점이상 D, 그 미만이면 F를 출력한다.


public class Exam_05 {
	public static void main(String[] args) {
		System.out.println("점수를 입력해주세요.");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어 점수 : ");
		int num1 = sc.nextInt();
		
		System.out.println("영어 점수 : ");
		int num2 = sc.nextInt();
		
		System.out.println("수학 점수 : ");
		int num3 = sc.nextInt();
		
		int result = (num1 + num2 + num3) / 3;
		
		if(result >= 90) {
			System.out.println("당신의 학점은 A입니다.");
		} else if(result >= 80) {
			System.out.println("당신의 학점은 B입니다.");
		} else if(result >= 70) {
			System.out.println("당신의 학점은 C입니다.");
		} else if(result >= 50) {
			System.out.println("당신의 학점은 D입니다.");
		} else {
			System.out.println("당신의 학점은 F입니다.");
		}
		
		sc.close();
	}
}
