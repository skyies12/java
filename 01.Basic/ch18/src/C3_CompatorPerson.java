import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class Person2 implements Comparable<Person2> {
	String name;
	int age;
	
	public Person2(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return name + " : " + age;
	}
	@Override
	public int compareTo(Person2 p) {
		// 나이가 동일한 데이터는 추가되지 않는다.
//		나이 정렬 오른차순 내림차순
//		return this.age - p.age;
		return p.age - this.age;
		
//		이름 정렬 오른차순 내림차순		
//		return this.name.compareTo(p.name);
//		return p.name.compareTo(this.name);
	}
}

class Person2Comparator implements Comparator<Person2> {
	public int compare(Person2 p1, Person2 p2) {
		return p2.age - p1.age;
	}
}
public class C3_CompatorPerson {

	public static void main(String[] args) {
		Set<Person2> tree = new TreeSet<>(new Person2Comparator());
		tree.add(new Person2("TOON",33));
		tree.add(new Person2("WOON",24));
		tree.add(new Person2("HOON",53));
		tree.add(new Person2("MOON",53));
		
		for (Person2 p : tree) {
			System.out.println(p);
		}

	}

}
