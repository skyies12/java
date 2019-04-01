package Game;
import java.util.Random;
import java.util.Scanner;

public class ComvsNum {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("무얼을 내겠습니까? <1: 가위 2: 바위 3: 보 0: 종료> : ");
			int num = sc.nextInt();
			int com = rand.nextInt(2)+1;
			
			if (num == 0 ) {
				System.out.println("*** 프로그램을 종료합니다. ***");
				break;
			}	else if (num > 3) {
				System.out.println("다시 입력해주세요.");
				continue;
			}
			
			switch (num) {
			case 1:
				System.out.print("사용자 : 가위\t");
				break;
			case 2:
				System.out.print("사용자 : 바위\t");
				break;
			case 3:
				System.out.print("사용자 : 보\t");
				break;
			}
			
			switch (com) {
			case 1:
				System.out.println("컴퓨터 : 가위");
				break;
			case 2:
				System.out.println("컴퓨터 : 바위");
				break;
			case 3:
				System.out.println("컴퓨터 : 보");
				break;
			default :
				break;
			}
			
			if (num == 1 && com == 3) {
				System.out.println("이겼습니다.\n");
			} else if (num == 3 && com == 1) {
				System.out.println("졌습니다.\n");
			} else if (num == com) {
				System.out.println("비겼습니다.\n");
			} else if (num > com) {
				System.out.println("이겼습니다.\n");
			} else if (num < com ) {
				System.out.println("졌습니다.\n");
			} 
		}
		sc.close();
	}
}
