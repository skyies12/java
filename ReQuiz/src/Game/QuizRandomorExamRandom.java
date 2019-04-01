package Game;

import java.util.Random;

public class QuizRandomorExamRandom {
	public static void main(String[] args) {
		Random rand = new Random();
		
		for (int i = 0; i < 5; i++) {
			int num1 = rand.nextInt(9) + 1;
			int num2 = rand.nextInt(9) + 1;
			int num3 = rand.nextInt(9) + 1;
			
			if(num1 != num2 && num1 != num3 && num2 != num3) {
				System.out.printf("%d%d%d%n",num1, num2, num3);
			}
		}
	}
}