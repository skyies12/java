package Chapter06;
public class Exam06_08 {
	public static void main(String[] args) {
		System.out.println("구구단을 출력하되 짝수 단만 출력하는 프로그램");
		System.out.println();
		
		for(int i = 2; i < 10; i++) {
			for(int j = 1; j < 9; j++) {
				if(i % 2 == 0 && j <= i) {
					System.out.printf("%d x %d = %d\n",i, j, (i * j));
				}
			}
			System.out.println();
		}
	}
}