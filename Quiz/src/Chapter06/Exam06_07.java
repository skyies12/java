package Chapter06;
public class Exam06_07 {
	public static void main(String[] args) {
		
		int i = 1;
		
		while (i < 100) {
			if(i % 7 == 0 || i % 9 == 0) {
				System.out.println(i);
			}
			i++;
		}
	}
}
