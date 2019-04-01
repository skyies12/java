package Chapter13;

import java.util.Scanner;

public class Exam13_03 {
	public static void main(String[] args) {
		int[] arr = new int[10];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("총 10개의 숫자를 입력하시오.");
		
		for(int i = 0; i < arr.length; i++) {	
			System.out.print("정수 입력 : ");
			arr[i] = sc.nextInt();
		}
		
		System.out.print("홀수 : ");
		for(int i = 0; i < arr.length; i++) {				
			if(arr[i] % 2 == 1) {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println();
		
		System.out.print("짝수 : ");
		for(int i = 0; i < arr.length; i++) {				
			if(arr[i] % 2 == 0) {
				System.out.print(arr[i] + " ");
			}
		}
		
		sc.close();
	}
}