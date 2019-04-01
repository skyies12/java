package Chapter13;

public class Exan13_10 {

	public static void main(String[] args) {
		int num[][] = new int[4][4];
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				num[i][j] = (i * 4) + j + 1;
				System.out.print(num[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println();
		
		int[][] numT = new int[4][4];
		
		for (int i = 0; i < 4; i++) {
			int n1 = 3;
			for (int j = 0; j < 4; j++) {
				numT[i][j] = num[n1][i];
				n1--;
				System.out.print(numT[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.arraycopy(numT, 0, numT, 0, numT.length);
	}

}
