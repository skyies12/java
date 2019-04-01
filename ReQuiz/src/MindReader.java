import java.util.Scanner;

public class MindReader {

	public static void main(String[] args) {
		int min = 0;
		int max = 101;
		int avg;
		
		System.out.println("0부터 100까지의 숫자 중 하나를 생각하세요.");
		System.out.println("제(컴)가 제시한 숫자가 생각한 숫자보다 크면 h를 입력하세요.");
		System.out.println("제(컴)가 제시한 숫자가 생각한 숫자보다 작으면 l를 입력하세요.");
		System.out.println("제(컴)가 제시한 숫자를 맞췄다면 y를 입력해 주세요.\n");
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 1; i< 8; i++) {
			avg = (min + max)/2;
			System.out.println("당신이 선택한 숫자는 " + avg + "입니까?");
			
			String use = sc.nextLine();
			
			if(use.equalsIgnoreCase("y")) {
				System.out.printf("정답입니다. [%d회차]\n", i);
				break;
			} else if(use.equalsIgnoreCase("h")) {
				max = avg;
			}	else if(use.equalsIgnoreCase("l")) {
				min = avg;
			}
		}
		System.out.println("Good Bye ~~");
		sc.close();
	}

}
