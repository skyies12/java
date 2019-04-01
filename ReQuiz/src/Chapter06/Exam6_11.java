package Chapter06;

public class Exam6_11 {

	public static void main(String[] args) {
		
		int sum = 0;
		int num = 1;
		
		do {
			if (num % 2 == 0) {
				sum = sum + num;
			}
			num++;
		} while(num <= 100);
		System.out.println(sum);
	}

}
