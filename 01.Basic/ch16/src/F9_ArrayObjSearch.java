import java.util.Arrays;

class Person2 implements Comparable {
	private String name;
	private int age;
	
	public Person2(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// 이름으로 비교
//	@Override
//	public int compareTo(Object o) {
//		Person2 p = (Person2)o;
//		return this.name.compareTo(p.name);
//	}
	
	// 숫자로 비교
	@Override
	public int compareTo(Object o) {
		Person2 p = (Person2)o;
		return this.age - p.age;
	}
	
	@Override
	public String toString() {
		return name + " : " + age;
	}	
}

public class F9_ArrayObjSearch {

	public static void main(String[] args) {
		Person2[] ar = new Person2[3];
		
		ar[0] = new Person2("홍길동", 29);
		ar[1] = new Person2("전우치", 15);
		ar[2] = new Person2("손오공", 37);

		Arrays.sort(ar);
		
		int idx = Arrays.binarySearch(ar, new Person2("전우치", 37));
		System.out.println(ar[idx]);
	}
}