class C1_Varargs {
	public static void showAll(Integer... vargs) {
		System.out.println("LEN : " + vargs.length);
		
		for(Integer s : vargs) {
			System.out.print(s + "\t");
		}
		System.out.println();
	}
	public static void main(String[] args) {
//		showAll("Box");
//		showAll("Box","Toy");
//		showAll("Box","Toy","Apple");
		
		// Integer형으로 받음
		showAll(1);
		showAll(1,2);
		showAll(1,2,3);
	}
}