package Chapter13;

import java.util.Scanner;

public class Exam13_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] ar = new int[10];
		
		System.out.println("총 10개의 정수를 입력하시오.");
		
		System.out.println("정수 입력 : ");
		
		int n1 = 0;
		int n2 = ar.length - 1;
		
		for(int i = 0; i < ar.length; i++) {	
			
			int nTmp = sc.nextInt();
			
			if(nTmp % 2 == 0) {
				ar[n2] = nTmp;
				n2 = n2 - 1;
			} else {
				ar[n1] = nTmp;
				n1 = n1 + 1;
			}
		}
		
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}
	sc.close();
	}
}