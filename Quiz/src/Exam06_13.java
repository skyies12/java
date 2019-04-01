public class Exam06_13 {
	public static void main(String[] args) {
		System.out.println("가로형" + "\n");
		
		for(int i=1; i<10; i++) {
			for(int j=2; j<10; j++){
				//System.out.print(j+" x "+ i + " = " + (j*i) + "\t");
				System.out.printf("%d x %d = %d\t", j, i, (j*i));
			}
		System.out.println();
		}
		
		System.out.println("\n" + "세로형" + "\n");
		
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				// System.out.print(i + " x " + j + " = " + (i*j) + "\t");
				System.out.printf("%d x %d = %d\t", i, j, (j*i));
			}
			System.out.println("\n");
		}
	}
}