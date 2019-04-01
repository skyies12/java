package Game;

import java.util.Random;
import java.util.Scanner;

public class MindReader {
	public static void main(String[] args) {
		System.out.println("0부터 100 사이의 값 중에 하나를 생각하세요.");
		System.out.println("컴이 제시한 숫자가 생각한 숫자보다 크면 h를 입력하세요.");
		System.out.println("컴이 제시한 숫자가 생각한 숫자보다 작으면 l를 입력하세요.");
		System.out.println("컴이 제시한 숫자를 맞췄다면 y를 입력하세요.\n");
		
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		int com = rand.nextInt(101);
		
		System.out.println("당신이 선택한 숫자는 " + com + "입니까?");
		
		int min = 0;
		int max = 100;
		int num = com;
		
		for(int i = 1; i < 10; i++) {
			String use = sc.nextLine();
			
			if (use.equalsIgnoreCase("h")) {
				max = num;
				num = (num + min)/2;
				System.out.println("당신이 선택한 숫자는 " + num + "입니까?");
			} else if (use.equalsIgnoreCase("l")) {
				min = num;
				num = (num + max)/2;
				System.out.println("당신이 선택한 숫자는 " + num + "입니까?");
			} else if (use.equalsIgnoreCase("y")) {
				System.out.printf("정답입니다. [%d회차]\nGood Bye~~!", i);
				break;
			}
		}
		sc.close();
	}
}