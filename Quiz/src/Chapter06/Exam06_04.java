package Chapter06;
public class Exam06_04 {
	public static void main(String[] args) {
		
		int num = 1;
		int sum = 0;

		do {
			if(num == 1000) {
				System.out.print(num + " = ");
			} else {
				System.out.print(num + " + ");
			}
			sum = sum + num;
			num++;
			
		} while (num <= 1000);
		
		System.out.println(sum);
	}
}