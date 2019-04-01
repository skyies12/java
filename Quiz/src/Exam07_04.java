import java.util.Scanner;

public class Exam07_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("섭씨 : ");
		double num1 = sc.nextDouble();
		
		System.out.print("화씨 : ");
		double num2 = sc.nextDouble();
		
		Fahrenheit(num1);
		Celsius(num2);

		sc.close();
	}
	
	public static double Fahrenheit (double num1) {
		double fResult = 1.8 * ((num1 - 32)/1.8) +32;
		System.out.println("\n화씨 -> 섭씨 : " + fResult + " ℃");
		return fResult;
	}
	
	public static double Celsius (double num2) {
		double cResult = (num2 - 32)/1.8;
		System.out.printf("섭씨 -> 화씨 : %.6f ℉", cResult);
		return cResult;
	}
}
