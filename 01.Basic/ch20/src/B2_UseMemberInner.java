//멤버 클래스는 클래스의 정의를 감추어야 할 때 유용하게 사용이 된다.
//다른 클래스와 연관되어 사용되지 않고 나만 사용 할 때
//관리를 편하게 하기 위해(하나의 소스 파일로 관리) 사용이 된다.

interface Printable1 {
	void print();
}

class Paper1 {
	private String con;
	
	public Paper1(String s) {
		con = s;
	}
	
	public Printable1 getPrinter() {
		return new Printer1();
	}
	
	private class Printer1 implements Printable1 {
		public void print() {
			System.out.println(con);
		}
	}
}

public class B2_UseMemberInner {
	public static void main(String[] args) {
		Paper1 p = new Paper1("서류 내용 : 행복합니다.");
		Paper1 p1 = new Paper1("서류 내용 : 쏘쏘");
		Printable1 prn = p.getPrinter();
		Printable1 prn1 = p1.getPrinter();
		prn.print();
		prn1.print();
	}
}
