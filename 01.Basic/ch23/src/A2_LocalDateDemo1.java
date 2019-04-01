import java.time.LocalDate;

public class A2_LocalDateDemo1 {
	public static void main(String[] args) {
		// 오늘
		LocalDate today = LocalDate.now();
		System.out.println("today : " + today);
		
		// 크리스마스
		LocalDate Xmas = LocalDate.of(today.getYear(), 12, 25);
		System.out.println("Xmas = " + Xmas);
		
		// 크리스마스 이브
		LocalDate eve = Xmas.plusMonths(2);
		System.out.println("Xmas eve : " + eve);
	}
}