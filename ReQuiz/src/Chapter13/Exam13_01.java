package Chapter13;

import java.util.Scanner;

public class Exam13_01 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		
		Scanner sc = new Scanner(System.in);
			
		System.out.println("5개의 정수를 입력하시오.");
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print("정수 입력 : ");
			arr[i] = sc.nextInt();
			
		}
		System.out.println("모든 정수의 합 : " + Sum(arr));
		System.out.println("모든 정수의 최대 값 : " + Max(arr));
		System.out.println("모든 정수의 최소 값 : " + Min(arr));
		sc.close();
	}
	
	public static int Sum(int[] arr) {
		int sum = 0;
		
		for(int i = 0; i < arr.length;i++) {
			sum = sum + arr[i];
		}	
		
		return sum;
	}
	
	public static int Max(int[] arr) {
		int max = arr[0];
		
		for(int i = 0; i < arr.length;i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}	
		return max;
	}
	
	public static int Min(int[] arr) {
		int min = arr[0];
		
		for(int i = 0; i < arr.length;i++) {
			if(min > arr[i]) {
				min = arr[i];
			}
		}	
		
		return min;
	}
}