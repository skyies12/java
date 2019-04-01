import java.util.ArrayList;
import java.util.List;

class ToyPriceInfo {
	private String model;
	private int price;
	
	public ToyPriceInfo(String m, int p) {
		model = m;
		price = p;
	}
	
	public int getPrice() {
		return price;
	}
}
public class C4_ToyPriceInfo {
	public static void main(String[] args) {
		List<ToyPriceInfo> list = new ArrayList<>();
		
		list.add(new ToyPriceInfo("GUN_LR_45", 200));
		list.add(new ToyPriceInfo("Teddy_Bear_S_014", 350));
		list.add(new ToyPriceInfo("Car_Transgorm_ver_7719", 550));
		
		int sum = list.stream()
				.filter(p -> p.getPrice() < 500)
				.mapToInt(t -> t.getPrice())
				.sum();
		
		System.out.println("sum = " + sum);
	}
}