package Chapter07;

import java.util.Scanner;

public class Exam07_03 {

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
		
		System.out.println("입력한 정수의 최소 값 : " + Min(num1, num2, num3));
		
		sc.close();
	}
	
	public static int Min (int num1, int num2, int num3) {
		int min = 0;
		
		if (num1 < num2 && num1 < num3) {
			min = num1;
		} else if (num1 > num2 && num2 < num3) {
			min = num2;
		} else { 
			min = num3;
		}
		
		return min;
	}
}
