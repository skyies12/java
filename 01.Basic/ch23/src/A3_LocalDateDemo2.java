import java.time.LocalDate;
import java.time.Period;

public class A3_LocalDateDemo2 {

	public static void main(String[] args) {
		// 오늘
		LocalDate today = LocalDate.now();
		System.out.println("today : " + today);
		
		// 크리스마스
		LocalDate Xmas = LocalDate.of(today.getYear(), 12, 25);
		System.out.println("Xmas = " + Xmas);
		
		// 크리스마스 이브까지 앞으로 몇칠?
		Period left  = Period.between(today, Xmas);
		System.out.println("Xmas까지 앞으로 " + left.getYears() +"년" + left.getMonths() + "개월 " + left.getDays() + "일");
	}

}
