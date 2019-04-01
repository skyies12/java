import java.util.Scanner;

//두개의 정수를 입력 받아서 두수의 차를 출력하는 프로그램을 작성하라.
//단 입력된 두 수의 순서에 상관없이 출력결과는 항상 0 이상이어야 한다.
//1과2를 입력했다면 1 .... 20과10을 입력했다면 10 ....


public class Exam_04 {
	public static void main(String[] args) {
		System.out.println("정수를 입력해주세요.");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 정수 : ");
		int num1 = sc.nextInt();
		
		System.out.println("두번째 정수 : ");
		int num2 = sc.nextInt();
		
		if(num1 > num2) {
			System.out.println("두수의 차 : " + (num1 - num2));
		} else {
			System.out.println("두수의 차 : " + (num2 - num1));
		}
		
		sc.close();
	}
}
