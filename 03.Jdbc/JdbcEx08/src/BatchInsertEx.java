import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchInsertEx {
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		String sql = null;
		boolean commit = false;
		
		try {
			con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe",
					"scott",
					"tiger");
			
			stmt = con.createStatement();
			sql = "create table test5 ( " +
			" 		id varchar2(10),    " +
			"		password varchar2(10) )";
			
			stmt.executeUpdate(sql);
			
			con.setAutoCommit(false);
			
			stmt.addBatch("insert into test5 " +
					"values ('홍길동', '1111')");
			stmt.addBatch("INSERT INTO test5 " +
					"VALUES ('전우치', '2222')");
			stmt.addBatch("INSERT INTO test5 " +
					"VALUES ('손오공', '3333')");
			stmt.addBatch("INSERT INTO test5 " +
					"VALUES ('이지함', '4444')");
			
			int [] updateCounts = stmt.executeBatch();
			commit = true;
			con.commit();
			
			rs = stmt.executeQuery("select * from test5");
			while (rs.next()) {
				String id = rs.getString("id");
				String password = rs.getString("password");
				System.out.println("id : " + id + ", password : " + password);
			}
			
			//------------------------------------------------------------
			
			sql = "drop table test5";
			stmt.executeUpdate(sql);
			
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		} finally {
			try {
				if (!commit) {
					con.rollback();
				}
				if (rs != null) {
					rs.close();
				}
				if(stmt != null) {
					stmt.close();
				}
				if(con != null) {
					con.close();
				}
			} catch (SQLException sqle) {
				sqle.printStackTrace();
			}
		}
	}
}