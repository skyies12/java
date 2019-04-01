package Chapter06;

public class Exam6_4 {

	public static void main(String[] args) {
		int result = 0;
		int num = 1;
		do {
			if (num == 1000) {
				System.out.print(num + " = ");
			} else {
				System.out.print(num + " + ");
			}
			result = result + num;
			++num;
		} while(num <= 1000);
		
		System.out.println(result);
	}
}