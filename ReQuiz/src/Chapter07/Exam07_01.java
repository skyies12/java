package Chapter07;

import java.util.Scanner;

public class Exam07_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("3개의 정수를 입력하시오.");
		System.out.println();
		
		System.out.print("정수 입력 : ");
		int num1 = sc.nextInt();
		
		System.out.print("정수 입력 : ");
		int num2 = sc.nextInt();
		
		System.out.print("정수 입력 : ");
		int num3 = sc.nextInt();
		
		System.out.println("입력한 값의 평균 : " + Arg(num1, num2, num3));
		System.out.println();
		
		sc.close();
	}
	
	public static int Arg(int num1, int num2, int num3) {
		int arg = (num1 + num2 + num3)/3;
		
		return arg;
	}
}
