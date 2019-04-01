class Calc {
	int add(int a, int b) {
		return a+b;
	}
}

class Calculation {
	
	static void disp() {
		Calc calc = new Calc();
		int nRtn = calc.add(3, 9);
		
		System.out.println("3 + 9 = " + nRtn);
	}
	public static void main(String[] args) {
		disp();
	}
}