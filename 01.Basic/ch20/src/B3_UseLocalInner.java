//로컬 클래스는 바로 위에서 소개한 멤버 클래스와 상당 부분 유사하다.

interface Printable2 {
	void print();
}

class Paper2 {
	private String con;
	
	public Paper2(String s) {
		con = s;
	}
	public Printable2 getPrinter() {	// 메소드 안에서만 아는 클래스 : 로컬 클래스
		class Printer2 implements Printable2 {	// 메소드 안에 로컬 클래스 생성
			public void print() {
				System.out.println(con);
			}
		}
		return new Printer2();
	}
}
 public class B3_UseLocalInner {
	public static void main(String[] args) {
		Paper2 p = new Paper2("서류내용 : 행복합니다.");
		Printable2 prn = p.getPrinter();
		prn.print();
	}
}