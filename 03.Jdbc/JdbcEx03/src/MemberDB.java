import java.sql.*;
import javax.naming.*;
import javax.sql.*;

public class MemberDB {
	public int confirmID(String id) throws Exception {
		Connection con = null;
		PreparedStatement pstmt;
		ResultSet rs = null;
		
		String sql = "select id from test3 where id = ?";
		int re = -1;
		try {
			con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe",
					"scott",
					"tiger");
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				re = 1;
			}
			rs.close();
			pstmt.close();
			con.close();
		} catch (Exception e) {
			System.out.println("예외 : " + e);
		}
		return re;
	}
}
