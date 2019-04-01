class Point2 implements Cloneable {
	private int xPos;
	private int yPos;
	
	public Point2(int x, int y) {
		xPos = x;
		xPos = y;
	}
	
	public void showPosition() {
		System.out.printf("[%d, %d]", xPos, yPos);
		System.out.println();
	}
	
	public void chagePos(int x, int y) {
		xPos = x;
		yPos = y;
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
class Rectangle2 implements Cloneable {
	public Point2 upperLeft;	// 좌측 상단 좌표
	public Point2 lowerRight;	// 우측 하단 좌표
	
	public Rectangle2(int x1, int y1, int x2, int y2) {
		upperLeft = new Point2(x1, y1);	
		lowerRight = new Point2(x2, y2);
	}
	// 좌표 정보를 수정함
	public void changePos(int x1, int y1, int x2, int y2) {
		upperLeft.chagePos(x1, y1);
		lowerRight.chagePos(x2, y2);
	}
	
	@Override 
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	// 직사각형 좌표 정보 출력
	public void showPosition() {
		System.out.print("좌측 상단 : ");
		upperLeft.showPosition();
		
		System.out.print("우측 하단 : ");
		lowerRight.showPosition();
		System.out.println();
	}
 }
public class C2_ShallowCopy {

	public static void main(String[] args) {
		Rectangle2 org = new Rectangle2(1, 1, 9, 9);
		Rectangle2 cpy;
		
		try {
			// 인스턴스 복사
			cpy = (Rectangle2)org.clone();
			
			// 한 인스턴스의 좌표 정보를 수정
			org.changePos(2, 2, 7, 7);
			
			org.showPosition();
			cpy.showPosition();
			
			if(org.equals(cpy)) {
				System.out.println("aaaaaa");
			} else {
				System.out.println("bbbbbb");
			}
			
			if(org.lowerRight.equals(cpy.lowerRight)) {
				System.out.println("cccccc");
			} else {
				System.out.println("dddddd");
			}
		}
		catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}