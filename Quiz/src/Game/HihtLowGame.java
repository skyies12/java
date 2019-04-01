package Game;
import java.util.Random;
import java.util.Scanner;

public class HihtLowGame {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("나는 지금 0부터 100사이의 값 중에 하나를 생각하겠습니다.\n당신은 그 숫자를 6회 안에 맞추시면 됩니다..\n");

			int com = rand.nextInt(101);

			for (int i = 6; i >= 1; i--) {
				System.out.print("몇이라고 생각합니다? <0 to 100> ");
				int num = sc.nextInt();
				
				if (num == com) {
					System.out.printf("%n%d는 정답입니다. 축하합니다!!");
					break;
				} else if (num != com && i == 1) {
					System.out.printf("\n모든 기회를 다 사용했습니다.%n정답은 %d입니다.\n",num, com);
				}
				else if (num > com) {
					System.out.println(num + "는 제가 정한 숫자보다 큽니다.\n");
					System.out.printf("[%d]의 기회가 남았습니다.%n", i-1);
				} else if (com > num) {
					System.out.println(num + "는 제가 정한 숫자보다 작습니다.\n");
					System.out.printf("[%d]의 기회가 남았습니다.%n", i-1);
				}
			}
			System.out.println("게임을 더 진행하시겠습니까? (y/n)...");
			String str = sc.next();
			if(!str.equalsIgnoreCase("y")) {
				System.out.println("Good bye");
				break;
			}
		}
		sc.close();
	}
}