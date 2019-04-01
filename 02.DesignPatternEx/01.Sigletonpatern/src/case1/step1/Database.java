package case1.step1;

public class Database {
	private static Database singleton;
	private String name;

	public Database(String name) {
		try {
			Thread.sleep(100);
			this.name = name;
		} catch (Exception e) {
			
		}
	}
	
	public static Database getInstance(String name) {
		if (singleton == null) {
			singleton = new Database(name);
		}
		return singleton;
	}
	
	public String getConnection() {
		return name;
	}

//	public void setName(String name) {
//		this.name = name;
//	}
}
