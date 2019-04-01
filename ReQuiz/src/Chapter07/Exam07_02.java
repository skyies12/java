package Chapter07;

import java.util.Scanner;

public class Exam07_02 {

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
		
		System.out.println("입력한 정수의 최대 값 : " + Max(num1, num2, num3));
		
		sc.close();
	}
	
	public static int Max (int num1, int num2, int num3) {
		int max = 0;
		
		if (num1 > num2 && num1 > num3) {
			max = num1;
		} else if (num1 < num2 && num2 > num3) {
			max = num2;
		} else { 
			max = num3;
		}
		
		return max;
	}
}
