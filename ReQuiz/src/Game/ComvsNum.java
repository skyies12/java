package Game;

import java.util.Random;
import java.util.Scanner;

public class ComvsNum {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		String str1 = "가위";
		String str2 = "바위";
		String str3 = "보";
		

		while(true) {
			int com = rand.nextInt(3) + 1;
			System.out.println("무엇을 내겟습니까?<1: 가위 2: 바위 3: 보 0: 종료>");
			
			int use = sc.nextInt();
			
			if(use > 3) {
				System.out.println("잘못된 입력입니다. 재입력해주십시오.");
				continue;
			}
			// 사용자 값
			if (use == 1) {
				System.out.printf("사용자 : %s\t", str1);
			} else if (use == 2) {
				System.out.printf("사용자 : %s\t", str2);
			} else if (use == 3) {
				System.out.printf("사용자 : %s\t", str3);
			} else if (use == 0) {
				System.out.println("*** 게임을 종료합니다. ***");
				break;
			}
			
			// 컴퓨터 값
			if (com == 1) {
				System.out.printf("컴퓨터 : %s\n", str1);
			} else if (com == 2) {
				System.out.printf("컴퓨터 : %s\n", str2);
			} else if (com == 3) {
				System.out.printf("컴퓨터 : %s\n", str3);
			}
			
			// 결과 내용
			if (use == 3 && com == 1){
				System.out.println("졌습니다.");
			} else if (use == 1 && com == 3){
				System.out.println("이겼습니다.");
			} else if (use == com) {
				System.out.println("비겼습니다.");
			} else if (use > com){
				System.out.println("이겼습니다.");
			} else if (use < com){
				System.out.println("졌습니다.");
			}
			
			System.out.println();
		}
		sc.close();
	}
}