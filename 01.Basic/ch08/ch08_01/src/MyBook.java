class Book {
	String title;
	String author;
	int money;
}

class 사람 {
	int 키;
	int 몸무게;
	String 이름;
}


class MyBook {

	public static void main(String[] args) {
		Book book1 = new Book();
		book1.title = "자바 프로그래밍";
		book1.author = "김승욱";
		book1.money = 15000;
		
		사람 man = new 사람();
		man.키 = 180;
		man.몸무게 = 62;
		man.이름 = "김승욱";
		
		System.out.println(book1.title + " : " + book1.author + " : " + book1.money);
		System.out.println(man.키 + " : " + man.몸무게 + " : " + man.이름);
	}
}