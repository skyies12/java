import java.util.Scanner;

public class F3_FinallyCase3 {

	public static void main(String[] args) {
		
		int num = 0;
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		try {
			num = a / b;
		} catch (Exception e) {
//			e.printStackTrace();
		} finally {
			// 데이터베이스 접속 종료 등... 무조건 해야 할일
			num = num + 1;
		}
		System.out.println(num);
		
		sc.close();
	}

}
