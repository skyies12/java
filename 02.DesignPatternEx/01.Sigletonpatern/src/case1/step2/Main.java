package case1.step2;

public class Main {

	public static void main(String[] args) {
		Database database;

		database = Database.getInstance("첫 번째 Database");
		System.out.println("This is the " + database.getConnection() + " !!");
		
		database = Database.getInstance("두 번째 Database");
		System.out.println("This is the " + database.getConnection() + " !!");
		
		
	}
}