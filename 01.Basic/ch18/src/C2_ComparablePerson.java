import java.util.Set;
import java.util.TreeSet;

class Person implements Comparable<Person> {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return name + " : " + age;
	}
	@Override
	public int compareTo(Person p) {
//		검색 조건을 필요에 따라 자유롭게 변경할 수 없어 불편하다.
//		조건 변경시 컴파일이 필요하다.
		
//		나이 정렬 오른차순 내림차순
//		return this.age - p.age;
		return p.age - this.age;
		
//		이름 정렬 오른차순 내림차순		
//		return this.name.compareTo(p.name);
//		return p.name.compareTo(this.name);
	}
}

public class C2_ComparablePerson {

	public static void main(String[] args) {
		Set<Person> tree = new TreeSet<>();
		tree.add(new Person("TOON",33));
		tree.add(new Person("WOON",24));
		tree.add(new Person("HOON",53));
		
		for (Person p : tree) {
			System.out.println(p);
		}
	}
}