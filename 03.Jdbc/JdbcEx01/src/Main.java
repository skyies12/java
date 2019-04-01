
import java.sql.*;

public class Main {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe",
					"scott",
					"tiger");
			System.out.println(con);
//			Statement stmt = con.createStatement();
//			
//			StringBuffer sb = new StringBuffer();
//			sb.append("select * from employee");
//			
//			ResultSet rs = stmt.executeQuery(sb.toString());
//			while(rs.next()) {
//				System.out.print("eno : " + rs.getInt(1) + ", ");
//				System.out.println("ename : " + rs.getString("ename"));
//			}
//			
//			rs.close();
//			stmt.close();
//			con.close();
		}	catch(ClassNotFoundException | SQLException e) {
			System.out.println("Connection Error");
		}
	}
}
