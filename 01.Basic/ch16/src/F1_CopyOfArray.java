import java.util.Arrays;

// 새로운 배열을 생성하여 복사한다.
public class F1_CopyOfArray {
	public static void main(String[] args) {
		double[] arOrg = {1.1, 2.2, 3.3, 4.4, 5.5};
		
		double[] arCpy1 = Arrays.copyOf(arOrg, arOrg.length);
		// 배열 전체를 복사하여 배열 생성
		double[] arCpy2 = Arrays.copyOf(arOrg, 3);
		// 배열의 세번째 요소까지만 복사하여 배열 생성
		for(double d : arCpy1) {
			System.out.print(d + "\t");
		}
		System.out.println();
		
		for(double d : arCpy2) {
			System.out.print(d + "\t");
		}
		System.out.println();
	}

}
