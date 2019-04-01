import java.util.Arrays;

// for-each 요소를 하나씩 꺼내 옴
public class B3_DoubleStream {
	public static void main(String[] args) {
//		double[] ar = {1.1, 2.2, 3.3, 4.4, 5.5};
//		
//		Arrays.stream(ar).forEach(d -> System.out.print(d + "\t"));
//		System.out.println();
//		
//		Arrays.stream(ar,1,3).forEach(d -> System.out.print(d + "\t"));
//		System.out.println();
		
		double[] ds = {1.1, 2.2, 3.3, 4.4, 5.5};
		
		Arrays.stream(ds).forEach(d -> System.out.print(d + "\t"));
		System.out.println();
		
		Arrays.stream(ds, 2, 4).forEach(d -> System.out.print(d +"\t"));
		System.out.println();
	}
}