package Game;

import java.util.Random;
import java.util.Scanner;

public class NumBaseball {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자로 하는 야구게임");
		
		int com1 = rand.nextInt(9) + 1;
		int com2 = rand.nextInt(9) + 1;
		int com3 = rand.nextInt(9) + 1;
			
		if(com1 != com2 && com1 != com3 && com2 != com3) {
			System.out.printf("%d%d%d%n",com1, com2, com3);
		}
		
		int i = 1;
		
		while(true) {
			System.out.printf("세자리 숫자를 입력하세요.(%d회)\n", i++);
			int num = sc.nextInt();
			
			int num1 = num / 100;
			int num2 = (num - num1 * 100) / 10;
			int num3 = (num - num1 * 100) % 10;
			
			int Strike = 0;
			int Ball = 0;
			
			// Strike
			if (com1 == num1) {	
				Strike++;
			} 
			if (com2 == num2) {
				Strike++;
			}
			if (com3 == num3) {
				Strike++;
			}
			
			
			// Strike
			if (com1 == num2 || com1 == num3) {
				Ball++;
			} 
			if (com2 == num1 || com2 == num3) {
				Ball++;
			} 
			if (com3 == num1 || com3 == num2) {
				Ball++;
			}
			
			// 결과 값
			if (Strike == 3) {
				System.out.println("YOU WIN!!!");
			} else if (Strike != 3 && Ball != 3) {
				System.out.println("OUT!!!");
			}
			
			System.out.printf("%d Strike   %d Ball\n", Strike, Ball);
			System.out.printf("%d:%d:%d\n", num1, num2, num3);
		}
	}
}