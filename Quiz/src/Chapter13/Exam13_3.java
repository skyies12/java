package Chapter13;

import java.util.Scanner;

public class Exam13_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		int[] ar = new int[10];
		
		System.out.println("총 10개의 숫자를 입력하시오");
		System.out.print("정수 입력 : ");
		for (int i = 0;i < ar.length;i++) {
			int use = sc.nextInt();
			ar[i] = use;
		}
		System.out.print("홀수 : ");
		Hol(ar);
		System.out.print("\n짝수 : ");
		Zzak(ar);
		
		sc.close();
	}
	
	static void Zzak(int[] ar) {
		for (int i = 0;i < ar.length; i++) {
			if(ar[i] % 2 ==0) {
				System.out.print(ar[i] + " ");
			} 
		}
	}
	
	static void Hol(int[] ar) {
		for (int i = 0;i < ar.length; i++) {
			if(ar[i] % 2 ==1) {
				System.out.print(ar[i] + " ");
			}
		}
	}
}