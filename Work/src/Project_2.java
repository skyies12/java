import java.util.Random;

public class Project_2 {

	public static void main(String[] args) {
		
		Random random = new Random();
				
		while (true) {
			int num1 = random.nextInt(10);
			int num2 = random.nextInt(10);
			int num3 = random.nextInt(10);
			
			if (num1 != 0) {
				if(num1 != num2 && num2 != num3 && num3 != num1) {
				System.out.printf("랜덤 번호 : %d%d%d\n", num1, num2, num3);
				break;
				}
			}
		}
	}
}