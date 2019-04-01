import java.util.HashMap;

class E1_HashMapCollection {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		
		// Key-Value 기반 데이터 저장
		map.put(35, "Brown");
		map.put(12, "Nunu");
		map.put(46, "Ashe");
		
		// 데이터 탐색
		System.out.println("35번 : " + map.get(35));
		System.out.println("12번 : " + map.get(12));
		System.out.println("46번 : " + map.get(46));
		
		// 데이터 삭제
		map.remove(12);
		
		// 데이터 삭제 확인
		System.out.println("12번 : " + map.get(12));

	}

}
