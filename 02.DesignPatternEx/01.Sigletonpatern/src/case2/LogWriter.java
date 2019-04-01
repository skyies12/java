package case2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.time.LocalDateTime;

public class LogWriter {
	private static LogWriter singleton = new LogWriter();
	private static BufferedWriter bw;
	
	public LogWriter() {
		try {
			bw = new BufferedWriter(new FileWriter("log.txt"));
		} catch (Exception e) { }
	}
	
	public static synchronized LogWriter getInstance() {
		return singleton;
	}
	
	public synchronized void log(String str) {
		try {
			bw.write(LocalDateTime.now() + " : " + str + "\n");
			bw.flush();
		} catch (Exception e) { }
	}
	
	@Override
	protected void finalize() {
		try {
			super.finalize();
			bw.close();
		} catch (Throwable ex) { }
	}
}
