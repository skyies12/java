import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class PreparedStatementEx {	
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}	catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		}
	}

	public static void main(String[] args) throws Exception {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Scanner sc = new Scanner(System.in);
//		while(true) {
//			try {
//				con = DriverManager.getConnection(
//						"jdbc:oracle:thin:@localhost:1521:xe",
//						"scott",
//						"tiger");
//				System.out.println("==== 블랙 리스트 중복 체크 ====");
//				System.out.println("블랙 리스트할 아이디를 입력하세요.");
//				String nblack = sc.nextLine();
//				System.out.println();
//
//				String sql = "select * from test3 where black = '"+ nblack +"'";
//				pstmt = con.prepareStatement(sql);
//				rs = pstmt.executeQuery();
//
//				if(rs.next()) {
//					System.out.println("이미 블랙리스트에 등록된 아이디입니다.");
//					System.out.println();
//					continue;
//
//				} else {
//					System.out.println("블랙리스트에 등록 가능한 아이디입니다.");
//					System.out.println();
//					sql = "insert into test3 values(0, 0, ?)";
//					pstmt = con.prepareStatement(sql);
//					System.out.println("블랙 리스트할 아이디를 입력하세요.");
//					String black = sc.nextLine();
//					pstmt.setString(1, black);
//					int updateCount = pstmt.executeUpdate();
//					System.out.println();
//					System.out.println("등록이 정상적으로 완료되었습니다!!");
//					System.out.println();
//					break;
//				}
//			} catch(SQLException sqle) {
//				break;
//
//			} finally {
//				try {
//					if (rs != null) {
//						rs.close();
//					}
//					if (con != null) {
//						con.close();
//					}
//					if (pstmt != null) {
//						pstmt.close();
//					}
//				} catch (SQLException sqle) {}
//			}
//		}
				try {
					con = DriverManager.getConnection(
							"jdbc:oracle:thin:@localhost:1521:xe",
							"scott",
							"tiger");
					System.out.println("회원정보를 입력해주세요.");
					String nid = sc.nextLine();
		
					String sql = "select * from test3 where id = '" + nid +"'";
					pstmt = con.prepareStatement(sql);
					int updateCount = pstmt.executeUpdate();
					rs = pstmt.executeQuery();
					if(rs.next()) {
						System.out.println("중복된아이디입니다.");
					} else {
						System.out.println("사용가능한 아이디입니다");
						sql = "insert into test3 values(?, ?, 0)";
						pstmt = con.prepareStatement(sql);
						System.out.println("============== 회원가입 =============");
						System.out.println();
						System.out.println("회원정보를 입력해주세요.");
						System.out.println();
						System.out.print(">> Id : ");
						String id = sc.next();
						System.out.print(">> Password : ");
						String pw = sc.next(); 
		
						pstmt.setString(1, id);
						pstmt.setString(2, pw);
						updateCount = pstmt.executeUpdate();
					}
					System.out.println();
				} catch(SQLException sqle) {
					System.out.println("이미 사용중인 Id입니다.");
					System.out.println();
					//				continue;
				} finally {
					try {
						if (rs != null) {
							rs.close();
						}
						if (con != null) {
							con.close();
						}
						if (pstmt != null) {
							pstmt.close();
						}
					} catch (SQLException sqle) {}
				}
	}
}


//			try {
//				con = DriverManager.getConnection(
//						"jdbc:oracle:thin:@localhost:1521:xe",
//						"scott",
//						"tiger");
//
//
//					String sql = "select id from test4";
//					pstmt = con.prepareStatement(sql);
//					rs = pstmt.executeQuery();
//					while(rs.next()) {
//						String b = rs.getString("id");
//						System.out.println(b);
//					}
//					
//					sql = "select id from test3";
//					pstmt = con.prepareStatement(sql);
//					rs = pstmt.executeQuery();
//					
//					
//					while(rs.next()) {
//						String a = rs.getString("id");
//						System.out.println(a);
//					}
//					System.out.println();
//					
//					sql = "select id from test3";
//					pstmt = con.prepareStatement(sql);
//					rs = pstmt.executeQuery();
//					
//					
//					while(rs.next()) {
//						String a = rs.getString("id");
//						System.out.println(a);
//					}

//					while (rs.next()) {
//						System.out.println(rs.getString(1));
//						if (a.equals(b)) {
//							System.out.println("접근제한");
//							break;
//						}
//						break;
//					}


//				String sql = "select * from test2";
//				pstmt = con.prepareStatement(sql);
//				int updateCount = pstmt.executeUpdate();

//-----------------------------------------------------------------------------
//				String sql = "insert into test4 values(?)";
//				pstmt = con.prepareStatement(sql);
//				System.out.println("블랙 리스트할 아이디를 입력하세요.");
//				String id = sc.nextLine();
//				pstmt.setString(1, id);
//				int updateCount = pstmt.executeUpdate();

//				if(rs.next()) {
//				System.out.println("블랙리스트 등록이 완료되었습니다.");
//				b = rs.getString(1);
//				break;
//			}
//				System.out.println();
//				sql = "select id from test3";
//				pstmt = con.prepareStatement(sql);
//				rs = pstmt.executeQuery();
//				
//				while(rs.next()) {
//					if(rs.getString(1).equals(id)) {
//						System.out.println("접근 제한");
//						break;
//					}
//				}

//-----------------------------------------------------------

//				sql = "drop table test3";
//				pstmt = con.prepareStatement(sql);
//				updateCount = pstmt.executeUpdate();

//			} catch(SQLException sqle) {
//				System.out.println("이미 아이디가 있습니다.");
//				
//			} finally {
//				try {
//					if (rs != null) {
//						rs.close();
//					}
//					if (con != null) {
//						con.close();
//					}
//					if (pstmt != null) {
//						pstmt.close();
//					}
//				} catch (SQLException sqle) {}
//			}



