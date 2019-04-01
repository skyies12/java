//Math 클래스에 정의된 메서드는 모두 static으로
//선언되어 있다. 즉,Math는 기능의 제공이 목적일 뿐,
//인스턴스의 생성을 목적으로 정의된 클래스는 아니다.

public class D_SimpleMathUse {
	public static void main(String[] args) {
		System.out.println("원주율 : " + Math.PI);
		System.out.println("2의 제곱근 : " + Math.sqrt(2));
		System.out.println();
		
		System.out.println("파이에 대한 Degree : " + Math.toDegrees(Math.PI));
		System.out.println("2파이에 대한 Degree : " + Math.toDegrees(2.0 * Math.PI));
		System.out.println();
		
		double radian45 = Math.toRadians(45);
		
		System.out.println("싸인 45 : " + Math.sin(radian45));
		System.out.println("코싸인 45 : " + Math.cos(radian45));
		System.out.println("탄젠트 45 : " + Math.tan(radian45));
		System.out.println();
		
		System.out.println("로그 25 : " + Math.log(25));
		System.out.println("2의 16승 : " + Math.pow(2, 16));
	}
}