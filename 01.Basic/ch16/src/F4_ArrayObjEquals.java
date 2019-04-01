import java.util.Arrays;

class INum1 {
	private int num;
	
	public INum1(int num) {
		this.num = num;
	}
}
public class F4_ArrayObjEquals {
	public static void main(String[] args) {
		INum1[] ar1 = new INum1[3];
		INum1[] ar2 = new INum1[3];
		
		ar1[0] = new INum1(1);
		ar2[0] = new INum1(1);
		
		ar1[1] = new INum1(2);
		ar2[1] = new INum1(2);
		
		ar1[2] = new INum1(3);
		ar2[2] = new INum1(3);
		
		System.out.println(Arrays.equals(ar1, ar2));
	}
}