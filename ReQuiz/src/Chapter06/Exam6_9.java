package Chapter06;

import java.util.Scanner;

public class Exam6_9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("하나의 정수를 입력하시오.");
		int use = sc.nextInt();
		
		for(int i = 2; i < 10; i++) {
			for(int j = 9; j > 0; j--) {
				if(i == use) {
					System.out.printf("%d x %d = %d\n",i,j,(i*j));
				}
			}
		}
		sc.close();
	}
}