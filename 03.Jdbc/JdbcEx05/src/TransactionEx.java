import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TransactionEx {
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		boolean success = false;
		
		try {
			con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe",
					"scott",
					"tiger");
			
			con.setAutoCommit(false);
			
			//------------------------------------------------------
			
			String sql = "insert into test1 valuse ('홍길동', '1111')";
			
			pstmt = con.prepareStatement(sql);
//			pstmt.executeUpdate();
			System.out.println("1111");
			
			sql = "insert into test1 valuse ('전우치', '2222')";
			pstmt = con.prepareStatement(sql);
//			pstmt.executeUpdate();
			System.out.println("2222");
			
			sql = "insert into test1 valuse ('손오공', '3333')";
			pstmt = con.prepareStatement(sql);
//			pstmt.executeUpdate();
			System.out.println("3333");
			
			sql = "select * from test1";
			pstmt = con.prepareStatement(sql);
			 rs = pstmt.executeQuery();
			while(rs.next()) {
				System.out.print("eno : " + rs.getInt(1) + ", ");
				System.out.println("ename : " + rs.getString("ename"));
			}
			
			success = true;	
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		} finally {
			try {
				if (success) {
					System.out.println("4444");
					con.commit();
				} else {
					System.out.println("5555");
					con.rollback();
				}
				if (con != null) {
					con.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
			} catch (SQLException sqle) { }
		}
	}
}