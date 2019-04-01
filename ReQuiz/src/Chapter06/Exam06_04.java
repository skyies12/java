package Chapter06;
public class Exam06_04 {
	public static void main(String[] args) {
		int num = 1;
		int result = 0;
		
		do {
			if (num == 1000) {
				System.out.print(num + " = ");
			} else {
				System.out.print(num + " + ");
			}
			result = result + num;
			num++;
			
		} while(num <= 1000);
		System.out.println(result);
	}

}
