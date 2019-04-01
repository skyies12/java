package Chapter13;

import java.util.Scanner;

public class Exam13_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] arr = new int[4][4];
		String[] str = {"이순신", "강감찬", "을지문덕", "권율"};
		
		int count = 0;
		
		// 과목 점수 입력
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int num4 = 0;
		
		// 과목 총합
		int gSum = 0;
		int eSum = 0;
		int sSum = 0;
		int kSum = 0;
		int sum = 0;
				
		
		// 학생의 점수 입력
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (count < str.length) {
					System.out.printf("%s의 점수를 입력하시오.\n", str[count]);
					System.out.print("국어 점수 : ");
					num1 = sc.nextInt();
					
					System.out.print("영어 점수 : ");
					num2 = sc.nextInt();
					
					System.out.print("수학 점수 : ");
					num3 = sc.nextInt();
					
					System.out.print("국사 점수 : ");
					num4 = sc.nextInt();
				}
				System.out.println();
				if (i == 0 && j < 4) {
					arr[i][j] = num1;
				}
				if (i == 1 && j < 4) {
					arr[i][j] = num2;
				}
				if (i == 2 && j < 4) {
					arr[i][j] = num3;
				}
				if (i == 3 && j < 4) {
					arr[i][j] = num4;
				}
				
				gSum = gSum + num1;
				eSum = eSum + num2;
				sSum = sSum + num3;
				kSum = kSum + num4;
				sum = num1 + num2 + num3 + num4;
				count++;
			}
		}
		
		System.out.println("구분  이순신  강감찬 을지문덕 권율 총점");
			
			// 국어
		System.out.print("국어");
		for (int i = 0; i < 1; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print("\t" + arr[i][j]);
			}
			System.out.println("   " + gSum);
		}
			
			// 영어
		System.out.print("영어");
		for (int i = 1; i < 2; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print("\t" + arr[i][j]);
			}
			System.out.println("   " + eSum);
		}
		
			// 수학
		System.out.print("수학");
		for (int i = 2; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print("\t" + arr[i][j]);
			}
			System.out.println("   " + sSum);
		}
						
			// 국사
		System.out.print("국사");
		for (int i = 3; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print("\t" + arr[i][j]);
				}
			System.out.println("   " + kSum);
		}
						
			// 총합
		for(int i = 0; i < 4; i++) {
			System.out.print("\t" + sum);
		}
		sc.close();
	}
}