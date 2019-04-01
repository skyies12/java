// 쓰레드 생성(Thread를 상속받아야 하고 run이라는 메소드를 만들어야함
// 1단계 쓰레드를 상속하는 클래스의 정의와 인스턴스 생성

class Task extends Thread {	
	public void run() {
		int n1 = 10;
		int n2 = 20;
		String name = Thread.currentThread().getName();
		System.out.println(name + " : " + (n1 + n2));
	}
}

public class A2_MakeThreadDemo {

	public static void main(String[] args) {
		Task t = new Task();
		// 2단계 쓰레드의 start 메소드 호출		
		t.start();
		
		System.out.println(Thread.currentThread().getName());
	}
}