import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

class C2_DataFilterInputStream {
	public static void main(String[] args) {
//		try(DataInputStream in = 
//				new DataInputStream(new FileInputStream("data.dat"))) {
//			int num1 = in.readInt();
//			Double num2 = in.readDouble();
//			
//			System.out.println(num1);
//			System.out.println(num2);
//		}
//		catch (IOException e) {
//			e.printStackTrace();
//		}
		try (DataInputStream in = 
				new DataInputStream(new FileInputStream("data.dat"))) {
			int num1 = in.readInt();
			Double num2 = in.readDouble();
			
			System.out.println(num1);
			System.out.println(num2);
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}