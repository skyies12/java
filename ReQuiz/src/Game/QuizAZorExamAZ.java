package Game;

public class QuizAZorExamAZ {
	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				if (i + j == 9) {
					System.out.printf("%d%d + %d%d = 99\n",i,j,j,i);
				}
			}
		}
	}

}
