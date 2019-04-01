package Game;

import java.util.Random;
import java.util.Scanner;

public class HihgLowGame {
	public static void main(String[] args) {
		System.out.println("나는 지금 0 부터 100 사이의 값 중에 하나를 생각하겠습니다.");
		System.out.println("당신은 그 숫자를 6회안에 맞추시면 됩니다.");
		
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);

		while(true) {	
			int com = rand.nextInt(101);
			for (int i = 6; i >= 1; i--) {
				System.out.print("몇이라고 생각합니까? <0 to 100> ");

				int use = sc.nextInt();
				if (use > com) {
					System.out.printf("%d는 제가 정한 숫자보다 큽니다.\n", use);
					System.out.printf("[%d]의 기회가 남았습니다.\n", i-1);
				} else if (i == 1) {
					System.out.println("모든 기회를 소진했습니다.");
				} else {
					System.out.printf("%d는 제가 정한 숫자보다 작습니다.\n", use);
					System.out.printf("[%d]의 기회가 남았습니다.\n", i-1);
				}
			}
			System.out.println("게임을 더 진행하시겠습니까? (y/n)");
			String str = sc.next();
			if(!str.equalsIgnoreCase("y")) {
				System.out.println("Good bye~");
			break;
			}
		}
		sc.close();
	}
}
