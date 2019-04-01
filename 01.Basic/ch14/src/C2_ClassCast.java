class Board {
	int a = 5;
}

class pBoard extends Board {
	int b = 10;
}

public class C2_ClassCast {
	public static void main(String[] args) {
		Board pbd1 = new pBoard();
		pBoard pbd2 = (pBoard)pbd1;		// OK!
		
		System.out.println(".. intermediate locaton ..");
		Board ebd1 = new Board();
		pBoard ebd2 = (pBoard)ebd1;		// Exception!
	}
}