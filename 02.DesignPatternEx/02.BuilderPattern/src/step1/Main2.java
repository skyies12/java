package step1;

import java.time.LocalDate;
import java.time.Month;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	private Person createPersonForTesting() {
		return Person.builder()
				.firstName("fristName")
				.lastName("lastName")
				.addressOne("addressOne")
				.addressTwo("addressTwo")
				.birthDate(LocalDate.of(1995, Month.APRIL, 13))
				.sex("male")
				.driverLicence(true)
				.married(true)
				.build();
	}
}

//모든 항목에 대해서 정보를 추가하기 위해 setter 를 사용하는 것이 불편하고 힘들다.
//생성자를 이용해 초기값을 넣을 수 있지만, 
//초기에 입력되지 않는 값도 있어 다양한 인자를 가진 생성자를 종류별로 만들어야 한다.

