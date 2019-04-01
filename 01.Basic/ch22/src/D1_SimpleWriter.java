import java.io.FileWriter;
import java.io.Writer;

public class D1_SimpleWriter {
	public static void main(String[] args) {
//		try (Writer out = new FileWriter("data.txt")) {
//			out.write('A');
//			out.write('한');
//		}	catch (Exception e) {
//			e.printStackTrace();
//		}
		try (Writer out = new FileWriter("data.txt")) {
			out.write('A');
			out.write('한');
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}