import java.util.Arrays;
import java.util.List;

//IntStream mapToInt
//LongStream mapToLong
//DoubleStream mapToDouble

public class C3_MapToInt2 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Robot", "Box", "Simple");
		
		list.stream().mapToInt(s -> s.length()).forEach(s -> System.out.print(s + "\t"));
	}

}
