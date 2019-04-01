class BoxD<T> {
	private T ob;
	
	public void set(T o) {
		ob = o;
	}
	
	public T get() {
		return ob;
	}
}

class UnBoxerD {
//	public static <T> T openBox(BoxD<T> box) {
//		return box.get();
//	}
	
	public static String openBox(BoxD<String> box) {
		return box.get();
	}
//	
//	public static String openBox(BoxD box) {
//		return box.get();
//	}
}
public class C2_GenericMethodBoxMaker2 {

	public static void main(String[] args) {
		BoxD<String> box = new BoxD<>();
		box.set("Mt Generic Method");

		String str = UnBoxerD.<String>openBox(box);
		System.out.println(str);
	}
}
