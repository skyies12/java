package Chapter06;

public class Exam6_8 {

	public static void main(String[] args) {
		for(int i = 2; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				if (i % 2 == 0 && i >= j) {
					System.out.printf("%d x %d = %d ",i,j,(i*j));
				}
			}
			System.out.println();
		}

	}

}
