interface PrintableC {
	void print(String s);
}

class C3_Lambda {
	public static void main(String[] args) {
		PrintableC prn = (s) -> {System.out.println(s);};
		prn.print("What is Lambda?");
	}
}