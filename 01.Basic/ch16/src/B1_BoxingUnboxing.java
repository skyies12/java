public class B1_BoxingUnboxing {
	public static void main(String[] args) {
//		// 인스턴스에 값을 감싸는 박싱
//		Integer iObj = new Integer(10);
//		Double dObj = new Double(3.14);
//		
//		System.out.println(iObj);
//		System.out.println(dObj);
//		System.out.println();
//		
//		// 메소드 호출을 통한 언박싱
//		int num1 = iObj.intValue();
//		double num2 = dObj.doubleValue();
//		
//		System.out.println(iObj);
//		System.out.println(dObj);
//		System.out.println();
//		
//		// 래포 인스턴스 값의 증가 방법
//		iObj =  new Integer(num1 + 10);
//		dObj = new Double(num2 + 1.2);
//		
//		System.out.println(iObj);
//		System.out.println(dObj);
		
		Integer iob = new Integer(10);
		Double dob = new Double(3.14);
		
		System.out.println(iob);
		System.out.println(dob);
		System.out.println();
		
		int num = iob.intValue();
		double num2 = dob.doubleValue();
		
		System.out.println(num);
		System.out.println(num2);
		System.out.println();
		
		iob = new Integer(num + 10);
		dob = new Double(num2 + 1.3);
		
		System.out.println(iob);
		System.out.println(dob);
		System.out.println();
	}
}