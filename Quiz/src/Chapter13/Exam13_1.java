package Chapter13;

import java.util.Scanner;

public class Exam13_1 {
	public static void main(String[] args) {
		
		int[] ar = new int[5];	//길이가 5인 int형 배열
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("다섯개의 정수를 입력하시오.\n");
		
		for (int i = 0; i < ar.length; i++) {
			System.out.print("정수 입력 : ");
			ar[i] = sc.nextInt();
		}
		System.out.println("입력받은 값의 합 : " + Sum(ar));
		System.out.println("입력받은 값의 최대값 : " + Max(ar));
		System.out.println("입력받은 값의 최소값 : " + Min(ar));
		sc.close();
	}
	
	static int Max(int[] ar) {
		
		int max = 0;
		
		for (int i = 0; i < ar.length; i++) {
			if (max < ar[i]) {
				max = ar[i];
			}
		}
		return max;	
	}
	
	static int Min(int[] ar) {
		
		int min = 100000000;
		
		for (int i = 0; i < ar.length; i++) {
			if (min > ar[i]) {
				min = ar[i];
			}
		}
		return min;	
	}
	
	static int Sum(int[] ar) {
		int sum = 0;
		
		for (int i = 0; i < ar.length; i++) {
			sum = sum + ar[i];
		}
		return sum;	
	}
}
