package Chapter18;

import java.util.Scanner;

public class Exam18_02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("데이터를 아무거나 무작위로 입력하세요 : ");
			String str = sc.next();
			String ch = "";
			boolean isNumber = true;
			int sum = 0;

			for (int j = 0; j < str.length(); j++) {
				ch = str.substring(j, j + 1);

				try {
					int num = Integer.parseInt(ch);
					sum = sum + num;
				} catch (Exception e) {
					isNumber = false;
				}
			}
			if (!isNumber) {
				System.out.println("숫자의 합 : " + sum);
				break;
			}
		}
	}
}