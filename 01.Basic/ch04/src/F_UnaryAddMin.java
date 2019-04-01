public class F_UnaryAddMin {
	public static void main(String[] args) {
		short num1 = 5;
		System.out.println(+num1);
		System.out.println(-num1 + "\n");
		
		short num2 = 7;
		short num3 = (short)(+num2);
		short num4 = (short)(-num2);
		System.out.println(num3);
		System.out.println(num4 + "\n");
		
		float num5 = 5.5f;
		float num6 = (+num5);
		float num7 = (-num5);
		System.out.println(num6);
		System.out.println(num7);
	}
}
