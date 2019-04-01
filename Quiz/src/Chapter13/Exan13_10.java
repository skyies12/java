package Chapter13;

public class Exan13_10 {

	public static void main(String[] args) {
		int[][] arr = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}
				};
		
		for(int i = 0; i < arr.length; i ++) {
			for(int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();
		
		int[][] arr1 = rotate90Right(arr);
		for(int i = 0; i < arr.length; i ++) {
			for(int j = 0; j < arr.length; j++) {
				System.out.print(arr1[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();
		
		int[][] arr2 = rotate90Right(arr1);
		for(int i = 0; i < arr.length; i ++) {
			for(int j = 0; j < arr.length; j++) {
				System.out.print(arr2[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();
		int[][] arr3 = rotate90Right(arr2);
		for(int i = 0; i < arr.length; i ++) {
			for(int j = 0; j < arr.length; j++) {
				System.out.print(arr3[i][j] + "\t");
			}
			System.out.println();
		}
	}
	// 오른쪽 방향으로 이동
	public static int[][] rotate90Right(int[][] arr) {
        int n1 = arr.length;
        int n2 = arr.length;
        int[][] temp = new int[n1][n2];
 
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr.length; i++) {
            	 temp[i][n2 - j - 1] = arr[j][i];
            }
        }
        return temp;
    }
//	public static int[][] rotate90Right(int[][] arr) {
//        int n1 = 4;
//        int n2 = 4;
//        int[][] temp = new int[n1][n2];
// 
//        for (int j = 0; j < n1; j++) {
//            for (int i = 0, k = n2 - 1; i < n2; i++, k--) {
//                temp[i][j] = arr[j][k];
//            }
//        }
//        return temp;
//    }
}