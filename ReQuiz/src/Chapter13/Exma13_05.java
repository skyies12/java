package Chapter13;

import java.util.Scanner;

public class Exma13_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("회문이 아닌지 판단하는 프로그램");
		
		while(true) {
			System.out.println("단어를 입력하시오.");
			String str = sc.nextLine();
			
			String[] arr = new String[str.length()];
			
			int num1 = 0;
			int num2 = str.length() - 1;
			
			char n1 = str.charAt(num1);
			char n2 = str.charAt(num2);
			
			if(n1 == n2) {
				System.out.println("회문 입니다.");
			} else {
				System.out.println("회문이 아닙니다.");
			}
		}
	}
}