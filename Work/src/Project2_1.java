import java.util.Random;

public class Project2_1 {
	public static void main(String[] args) {
		Random rand = new Random();
		
		while (true) {
			int num = rand.nextInt(988); // 0~999;
			if (num < 102) {
				continue;
			}
			// 987이 나왔다고 가정했을 때
			int num1 = num / 100;	// 9
			int numT = num - num1 * 100; // 87
			int num2 = numT / 10; // 8
			int num3 = numT % 10; 
			
			if (num1 != num2 && num1 != num3 && num2 != num3) {
				System.out.println(num1 + "" + num2 + "" + num3);
				break;
			}
		}
	}
}
