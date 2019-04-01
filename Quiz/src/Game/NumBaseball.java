package Game;

import java.util.Random;
import java.util.Scanner;

public class NumBaseball {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);

		int com1 = rand.nextInt(9)+1;
		int com2 = rand.nextInt(9)+1;
		int com3 = rand.nextInt(9)+1;
		
		if (com1 != com2 && com1 != com3 && com2 != com3) {
			System.out.printf("%d%d%d%n", com1,com2,com3);
		}
		
		int s;
		int b;
		int count = 1;
		
		while(true) {
			System.out.printf("세자리 숫자를 입력하세요.(%d회)%n", count++);
			int num = sc.nextInt();
			
			int num1 = num / 100;
			int numT = num - num1 * 100;
			int num2 = numT / 10;
			int num3 = numT % 10;
			// 스트라이크, 볼 값 초기화
			s = 0;
			b = 0;
			
			if(num1 != num2 && num1 != num3 && num2 != num3) {
				System.out.printf("%d:%d:%d%n", num1, num2 , num3);
			}
			
			// 스트라이크
			if (num1 == com1) {
				s++;
			} 
			if (num2 == com2) {
				s++;
			} 
			
			if (num3 == com3) {
				s++;
			} 
			
			// 볼
			if (num1 == com2 || num1 == com3) {
				b++;
			}
			if (num2 == com1 || num2 == com3) {
				b++;
			}
			if (num3 == com1 || num3 == com2) {
				b++;
			}
			
			System.out.printf("%d Strike  %d Ball%n",s, b);
			
			// 결과 값
			if (s == 3) {
				System.out.print("YOU WIN!!!");
				break;
			} else if (s < 1 && b < 1) {
				System.out.println("OUT!!!");
			}
		}
		sc.close();
	}
}