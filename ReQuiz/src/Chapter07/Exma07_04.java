package Chapter07;

import java.util.Scanner;

public class Exma07_04 {
	public static void main(String[] args) {
		System.out.println("섭씨 화씨 변환 출력 프로그램\n");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("섭씨 입력 : ");
		double cel = sc.nextDouble();
		
		System.out.println("섭씨 -> 화씨의 변환 값 : " + Fahrenheit(cel));
		
		System.out.println();
		
		System.out.print("화씨 입력 : ");
		double fah = sc.nextDouble();
		
		System.out.printf("화씨 -> 섭씨의 변환 값 : %.6f", Celsius(fah));
		
		sc.close();
	}
	
	public static double Fahrenheit(double cel) {
		double fah = 0;
		
		fah = 1.8 * cel + 32;
		
		return fah;
	}
	
	public static double Celsius(double fah) {
		double cel = 0;
		
		cel = (fah -32)/1.8;
		
		return cel;
	}
}