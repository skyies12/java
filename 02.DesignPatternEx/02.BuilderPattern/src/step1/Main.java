package step1;

public class Main {

	public static void main(String[] args) {

	}
	
	public static Person createPersonForTesting() {
		Person person = new Person();
		person.setFirstName("firstName");
		person.setLastName("lastName");
		person.setAddressOne("Address1");
		
		return person;
	}
}
//모든 항목에 대해서 정보를 추가하기 위해 setter 를 사용하는 것이 불편하고 힘들다.
//생성자를 이용해 초기값을 넣을 수 있지만, 
//초기에 입력되지 않는 값도 있어 다양한 인자를 가진 생성자를 종류별로 만들어야 한다.
