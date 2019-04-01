// 키워드 this, 클래스의 은닉화
// 클래스의 은닉화 :
// - 변수에 직접적인 접근을 막는다.
// - getter, setter를 토애 변수에 접근한다.

class SimpleBox {
	private int data;
	
	SimpleBox(int data) {
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data + 1;
	}
}

public class ThisUse {

	public static void main(String[] args) {
		SimpleBox box = new SimpleBox(5);
		box.setData(10);
		System.out.println(box.getData());
	}
}