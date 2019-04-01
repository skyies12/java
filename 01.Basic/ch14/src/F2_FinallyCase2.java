

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class F2_FinallyCase2 {

	public static void main(String[] args) {
		Path file = Paths.get("D:\\ksw\\ttt.txt");
		BufferedWriter writer = null;	
		
		try {
			// 아래 문장에서 IOException 발생 가능
			writer = Files.newBufferedWriter(file);
			
			writer.write('A');		// IOException 발생 가능
			writer.write('Z');		// IOException 발생 가능
			
			if(writer != null) {
				writer.close();		// IOException 발생 가능
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(writer!= null) {
					writer.close();	// IOException 발생 가능
				}
			}
			catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
// 실행의 흐름이 try 구문 안에 들어왔을때 반드시 실행해야 하는 문장을 finally 구문에 들어간다.
// 그러나 보다 몃진 대안이 등장했다.