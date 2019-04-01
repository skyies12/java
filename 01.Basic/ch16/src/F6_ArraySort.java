import java.util.Arrays;

public class F6_ArraySort {
	public static void main(String[] args) {
		int[] ar1 = {1, 5, 3, 2, 4};
		double[] ar2 = {3.3, 2.2, 5.5, 1.1, 4.4};
		
		Arrays.sort(ar1);
		Arrays.sort(ar2);
		
//		내림차순 정렬
		for(int n : ar1) {
			System.out.print(n + "\t");
		}
		System.out.println();
		
		for(double d : ar2) {
			System.out.print(d + "\t");
		}
		System.out.println();
		
//		올림 차순 정렬		
		for(int i = ar1.length; i > 0; i--) {
			System.out.print(i + "\t");
		}
		System.out.println();
		
		for(double i = ar2.length; i > 0; i--) {
			System.out.print(i + "\t");
		}
		System.out.println();
	}
}