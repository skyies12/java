package Chapter13;

import java.util.Scanner;

public class Exam13_04 {

	public static void main(String[] args) {
		int[] arr = new int[10];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("총 10개의 숫자를 입력하시오.");
		
		int n1 = 0;
		int n2 = arr.length - 1;
		
		System.out.print("정수 입력 : ");
		for(int i = 0; i < arr.length; i++) {	
			int num = sc.nextInt();
			
			if(num % 2 == 0) {
				arr[n2] = num;
				n2--;
			} else  { 
				arr[n1] = num;
				n1++;
			}
		}
		
		for(int i = 0; i < arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

	}

}
