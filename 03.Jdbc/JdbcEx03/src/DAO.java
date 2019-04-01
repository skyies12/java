
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

public interface DAO {
	static final String oracleDriver = "oracle.jdbc.driver.OracleDriver";
	static final String oracleURL = "jdbc:oracle:thin:@localhost:1521:xe";
	static final String oracleId = "scott";
	static final String oraclePw = "tiger";
	
	public Connection getConnection() throws ClassNotFoundException, Exception;
	
	public ArrayList<Member> getMembers() throws SQLException, Exception;
}
