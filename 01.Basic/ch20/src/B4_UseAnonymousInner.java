//익명 내부 클래스는 예전에 자바 UI에서
//이번트를 처리하는 데 많이 사용했다. 현재는
//안드로이드 프로그래밍에서 위젯의 이벤트
//처리하는 핸들러를 구현할 때 사용한다.

interface Printable3 {
	void print();
}

class Paper3 {
	private String con;
	
	public Paper3(String s) {
		con = s;	
	}
	public Printable3 getPrinter() {
		return new Printable3() {	// 익명 클래스의 정의와 인스턴스 생성
			
			@Override
			public void print() {
				System.out.println(con);
			}
		};
	}
}

public class B4_UseAnonymousInner {

	public static void main(String[] args) {
		Paper3 p = new Paper3("서류내용 :  행복쓰");
		Printable3 prn = p.getPrinter();
		prn.print();
	}
}