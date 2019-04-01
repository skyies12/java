//package Chapter06;
//
//import java.util.Scanner;
//
//public class Exam6_10 {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("다섯개의 정수를 입력하시오.");
//		
//		int i = 0;
//		int num;
//		int nSum = 0;
//		
//		while(i < 5) {
//			System.out.println("숫자 입력 : ");
//			num = sc.nextInt();
//			if(num < 1) {
//				System.out.println("재입력해주세요.");
//				continue;
//			}
//			nSum = nSum + num;
//			i++;
//		}
//		System.out.println("합 : "+ nSum);
//		sc.close();
//	}
//}
package Chapter06;

import java.util.Scanner;

public class Exam6_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("다섯개의 정수를 입력하시오.");
		
		int sum = 0;
		
		for (int i = 0; i < 5; i++) {
			System.out.print("정수 입력 : ");
			int use = sc.nextInt();
			if(use < 1) {
				System.out.println("재입력 해주세요.");
				i--;
				continue;
			} 
			sum = sum + use;
		}
		System.out.println("입력받은 값의 합 : " + sum);
		
		sc.close();
	}
}