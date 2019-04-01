import java.util.Arrays;

//for-each 요소를 하나씩 꺼내 옴
public class B2_StringStream2 {
	public static void main(String[] args) {
//		String[] names = {"Yoon","Lee","Park"};
//		
//		Arrays.stream(names).forEach(s -> System.out.println(s));
		
		String[] names = {"Son","Yu", "Jeung"};
		
		Arrays.stream(names).forEach(n -> System.out.print(n));
	}
}