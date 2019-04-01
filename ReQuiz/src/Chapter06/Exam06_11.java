package Chapter06;
public class Exam06_11 {
	public static void main(String[] args) {
		
		int sum = 0;
		int i = 1;
		
		do {
			if (i % 2 ==0) {
				sum = sum + i;
			}
			i++;
		} while (i <= 100);
		System.out.println("1부터 100까지의 짝수의 합 : " + sum);
	}
}