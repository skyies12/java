public class Exam06_11 {
	public static void main(String[] args) {
		
		int num = 1;
		int sum = 0;
		
		do {
			if (num % 2 == 0) {
				sum = sum + num;
			}
			num++;
		} while(num < 101);
		System.out.println("짝수의 합 : " + sum);
	}

}
