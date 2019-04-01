import java.util.Random;
import java.util.Scanner;

public class Project_3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
			
		while (true) {
			System.out.print("무엇을 내시겠습니다? <1: 가위 2: 바위 3: 보 0: 종료> : ");
			int str = sc.nextInt();
			int com = rand.nextInt(2)+1;
			
			switch (str) {
			case 0:
				System.out.print("*** 게임을 종료합니다 ***");
				System.exit(0);
				
			case 1:
				System.out.print("사용자 : 가위 ");
				break;
			case 2:
				System.out.print("사용자 : 바위 ");
				break;
			case 3:
				System.out.print("사용자 : 보 ");
				break;
			default:
				System.out.println("다시 입력해주십시오.");
				continue;
			}
			
			switch (com) {
			case 1:
				System.out.println("컴퓨터 : 가위 ");
				break;
			case 2:
				System.out.println("컴퓨터 : 바위 ");
				break;
			case 3:
				System.out.println("컴퓨터 : 보 ");
				break;
			}
			if (str == 3 && com == 1) {
				System.out.println("졌습니다.\n");
			} else if (str == 1 && com == 3) {
				System.out.println("이겼습니다.\n");
			} else if (str == com) {
				System.out.println("비겼습니다.\n");
			} else if(str > com || str == 1 && com == 3) {
				System.out.println("이겼습니다.\n");
			} else if (com > str || str == 3 && com == 1) {
				System.out.println("졌습니다.\n");
			}
		}
	}
}