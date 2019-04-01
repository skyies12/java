package Game;
import java.util.Random;
import java.util.Scanner;

public class MindReader {

	public static void main(String[] args) {
		
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("0부터 100까지의 숫자 중 하나를 생각하세요.");
		System.out.println("제(컴)가 제시한 숫자가 생각한 숫자보다 크면 h를 입력하세요.");
		System.out.println("제(컴)가 제시한 숫자가 생각한 숫자보다 작으면 l를 입력하세요.");
		System.out.println("제(컴)가 제시한 숫자를 맞췄다면 y를 입력해 주세요.\n");
		
		int com = rand.nextInt(101);
		System.out.printf("당신이 선택한 숫자는 %d입니까?\n", com);
		
		int min = 0;
		int max = 100;
		int num = com;
	
		for (int i = 1; i < 10; i++) {
			
			String use = sc.nextLine();
			
			switch (use) {
			case "y":
				System.out.printf("정답입니다. [%d회차]\nGood Bye ~~", i);
				break;
			}
			switch (use) {
			case "h":
				max = num;
				num = (num + min)/2;
				System.out.printf("당신이 선택한 숫자는 %d입니까?\n", num);
			}
			switch (use) {
			case "l":
				min = num;
				num = (num + max)/2;
				System.out.printf("당신이 선택한 숫자는 %d입니까?\n", num);
			}
		}
		sc.close();
	}
}