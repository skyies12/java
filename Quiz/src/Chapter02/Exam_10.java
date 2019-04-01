package Chapter02;
public class Exam_10 {
	public static void main(String[] args) {
		
		int num = 1;
		int num1 = 1;
		
		System.out.print("7의 배수 : ");
		while (num < 100) {
			if (num % 7 == 0) {
				System.out.print(num + " ");
			}
			num++;
		}
		System.out.print("\n9의 배수 : ");
		while (num1 < 100) {
			if (num1 % 9 == 0) {
				System.out.print(num1 + " ");
			} 	
			num1++;
		}
	}
}