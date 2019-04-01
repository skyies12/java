class Point1 implements Cloneable {
	private int xPos;
	private int yPos;
	
	public Point1(int x, int y) {
		xPos = x;
		yPos = y;
	}
	
	public void showPosition() {
		System.out.printf("[%d, %d]", xPos, yPos);
		System.out.println();
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
public class C1_InstancsCloning {

	public static void main(String[] args) {
		Point1 org = new Point1(1,5);
		Point1 cpy;
		
		try {
			cpy = (Point1)org.clone();
			org.showPosition();
			cpy.showPosition();
			
			if(org.equals(cpy)) {
				System.out.println("aaaaaa");
			} else {
				System.out.println("bbbbbb");
			}
		}
		catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}