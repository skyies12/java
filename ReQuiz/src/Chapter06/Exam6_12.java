package Chapter06;

import java.util.Scanner;

public class Exam6_12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("두개의 정수를 입력하시오.");
		
		System.out.print("정수 입력 : ");
		int num1 = sc.nextInt();
		
		System.out.print("정수 입력 : ");
		int num2 = sc.nextInt();
		
		int sum = 0;
		
		if (num1 > num2) {
			for(int i = num1; i >= num2; i--) {
				sum = sum + i;
				if (i > num2) {
					System.out.print(i + " + ");
				} else {
					System.out.print(i + " = ");
				}
			}
		} else {
			for (int i = num1; i <= num2; i++) {
				sum = sum + i;
				if(i < num2) {
					System.out.print(i + " + ");
				} else {
					System.out.print(i + " = ");
				}
			}
		}
		System.out.println(sum);
	}
}