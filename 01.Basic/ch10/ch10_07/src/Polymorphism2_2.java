//마이크로소프트사 : 윈도우 10에서 사용될 프린터는 다음의 규격을 준수해야 합니다.
//					ColorPrintable을 구현해주세요.
//아래아한글 : 구형 프로그램 : print 호출
//			 신형 프로그램 : printCMYK호출
//삼성, 엡손 : 구형 프로그램 : print 호출
//			 신형 프로그램 : printCMYK호출

interface ColorPrintable extends Printable {
	public void printCMYK(String doc);
}

class PrnColDrvSamsung implements ColorPrintable {
	public void print(String doc) {
		System.out.println(doc + "\nFrom Samsung(2) : Black-White ver");
	}
	public void printCMYK(String doc) {
		System.out.println(doc + "\nFrom Samsung(2) : Color ver");
	}
}

class PrnColDrvEpson implements ColorPrintable {
	public void print(String doc) {
		System.out.println(doc + "\nFrom Epson(2) : Black-White ver");
	}
	public void printCMYK(String doc) {
		System.out.println(doc + "\nFrom Epson(2) : Color ver");
	}
}

public class Polymorphism2_2 {

	public static void main(String[] args) {
		String doc = "프린터로 출력을 합니다.";
		
		Printable prn1 = new PrnDrvSamsung();
		prn1.print(doc);

		ColorPrintable prn2 = new PrnColDrvSamsung();
		prn2.print(doc);
		prn2.printCMYK(doc);
		
		ColorPrintable prn3 = new PrnColDrvEpson();
		prn3.print(doc);
		prn3.printCMYK(doc);
		
		// 자식을 부모에게 넣을 수는 있으나, 같은 레벨의 클래스에 넣을 수는 없다.
		// PrnColorDrvSamsung prn3 = new PrnColorDrvEpson();
	}
}