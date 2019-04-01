public class D_OperatePromotion {
	public static void main(String[] args) {
		short num1 = 11;
		short num2 = 22;
		// short에 값을 저장하고 계산하면 int 값으로 나오기 때문에 
		// int로 저장해야 함
		
		// int 값으로 나타내는 방법;
		// int result = num1 + num2;
		
		// short 값으로 나타내는 방법
		short result = (short)(num1+num2);
		System.out.println(result);
	}
}
