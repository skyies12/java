
public class Exam_07 {

	public static void main(String[] args) {
		int num1 = 1;
		int result = 0;
		
		do {
			System.out.printf("%d + ", num1);
			num1++;
			result = result + num1;
		} while (num1 < 1000);
			System.out.println(" = " + result);
	}
}
