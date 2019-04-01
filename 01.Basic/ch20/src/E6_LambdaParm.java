@FunctionalInterface
interface PrintableE {
	void pirnt(String s);
}

public class E6_LambdaParm {
	public static void ShowString(PrintableE p, String s) {
		p.pirnt(s);
	}
	
	public static void main(String[] args) {
		ShowString((s) -> {System.out.println(s);}, "What is Lambda?");
	}
}