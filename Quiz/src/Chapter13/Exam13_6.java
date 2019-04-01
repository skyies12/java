package Chapter13;

public class Exam13_6 {

	public static void main(String[] args) {
		
		int[][] arr = new int [3][9];

		int num = 0;
		
		for(int i = 0;i < 3;i++) {
			for(int j = 0; j < 9; j++) {
				num = (i+2) * (j+1);
				arr[i][j] = num;
			}
		}
		
		for(int i = 0;i < 3;i++) {
			for(int j = 0; j < 9; j++) {
				System.out.print((i+2) + "x" + (j+1) + " = " + arr[i][j] + " \t");
			}
			System.out.println();
		}
	}
}
