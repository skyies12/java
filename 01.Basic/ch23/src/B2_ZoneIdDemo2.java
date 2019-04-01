import java.time.ZoneId;

class B2_ZoneIdDemo2 {
	public static void main(String[] args) {
		ZoneId.getAvailableZoneIds()
					.stream()
					.filter(s -> s.startsWith("Asia")) // 필터링해서 아시아만 나오게 적용
					.sorted()
					.forEach(s -> System.out.println(s));
	}

}
