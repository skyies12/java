class Box {
	private String contents;
	private int boxNum;
	
	Box(int num, String cont) {
		boxNum = num;
		contents = cont;
	}

	public int getBoxNum() {
		return boxNum;
	}

	public String toString() {
		return contents;
	}
}

public class D2_EnhancedForInst {
	public static void main(String[] args) {

		Box[] name = new Box[5];
		
		name[0] = new Box(21, "홍길동");
		name[1] = new Box(18, "전우치");
		name[2] = new Box(16, "손오공");
		name[3] = new Box(20, "강감찬");
		name[4] = new Box(23, "이순신");
		
		for (Box e : name) {
			if(e.getBoxNum() == 23) {
				System.out.println(e);
			}
		}
	}
}