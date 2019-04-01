package Game;
import java.util.Random;

public class QuizRandom {

	public static void main(String[] args) {
		Random rand = new Random();
		
		for (int i = 1;i < 20; i++) {
			int num1 = rand.nextInt(9)+1;
			int num2 = rand.nextInt(10);
			int num3 = rand.nextInt(10);
			
			if (num1 != num3 && num2 != num1 && num2 != num3) {
				System.out.printf("랜덤한 세자리 수 : %d%d%d%n",num1,num2,num3);
			}
		}
	}
}