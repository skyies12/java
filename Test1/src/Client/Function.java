package Client;

import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Function {
	Connection con =null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	String sql="";
	Scanner sc = new Scanner(System.in);


	// 로그인
	public void login(String[] args) {

		String s_name = null;
		Function fc = new Function();

		try {
			con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe",
					"scott",
					"tiger");


			while(true) {  
				System.out.println("============== 로그인 =============");
				System.out.println();
				System.out.println("Id와 Password를 입력해 주세요.");
				System.out.print(">> Id : ");
				String id = sc.next().trim();

				System.out.print(">> Password : ");
				String pwd = sc.next().trim();
				System.out.println();
				s_name = id;
				
				String sql = "select * from test3";

				pstmt = con.prepareStatement(sql);
				rs = pstmt.executeQuery();
				
				boolean bLogin = false;
				while (rs.next()) {
					if (rs.getString("id").equals(id) && rs.getString("pwd").equals(pwd)) {
						bLogin = true;
						
						sql = "select * from test3 where black = '" + id +"'";
            			pstmt = con.prepareStatement(sql);
            			rs = pstmt.executeQuery();

            			if(rs.next()) {
            				System.out.println("접근 제한");
            				System.out.println();
<<<<<<< HEAD
            			} else {
            				System.out.println("Id와 Password가 일치합니다.");
=======
            			} 
            			else {
            				System.out.println("Id와 비밀번호가 일치합니다.");
>>>>>>> Web
            				fc.MultiClient(args);
                            break;
            			}
            			
            			sql = "select * from test3 where id = 'skyies12'";
            			pstmt = con.prepareStatement(sql);
            			rs = pstmt.executeQuery();
					} 
				}
				
				if (bLogin == false) {
					System.out.println("Id 또는 Password가 일치하지 않습니다. 다시입력해주세요.");
				} else {
					break;
				}
			}
		} catch (SQLException e) {
			System.out.println("예외 : " + e);
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("예외 : " + e);
			e.printStackTrace();
		}
		
	}

	public void MultiClient(String[] args) {
		try {
			String ServerIP = "localhost";
			if(args.length > 0) {
				ServerIP = args[0];
			}

			Socket socket = new Socket(ServerIP, 9999); // 소켓 객체 생성
			System.out.println("서버와 연결이 되었습니다......");
			System.out.println();
			System.out.println("   -----*****-----");
			System.out.println("닉네임을 설정해주세요.");
			System.out.print(">> 닉네임 : ");
			String s_name = sc.next();
			System.out.println("대기실에 입장하셨습니다.");
			System.out.println("          ============ *공지 사항* ============");
			System.out.println("/sos 입력하시면 사용할 수 있는 명령어 리스트를 볼수 있습니다.");
			System.out.println();

			// 서버에서 보내는 메시지를 사용자의 콘솔에 출력하는 쓰레드
			Thread receiver = new Receiver6(socket);
			receiver.start();

			// 사용자로부터 얻은 문자열을 서버로 전송해주는 역할을 하는 쓰레드
			//			Thread sender = new Sender6(socket, s_name);
			//			sender.start();

			new ChatWin(socket, s_name);
		} catch (Exception e) {
			System.out.println("예외[MultiClient class] : " + e);
		}
	}

	// 회원 가입
	public void SignUp(String[] args) throws Exception {
		Function fc = new Function();
		MultiClient6 mc = new MultiClient6();

		while(true) {
			try {

				con = DriverManager.getConnection(
						"jdbc:oracle:thin:@localhost:1521:xe",
						"scott",
						"tiger");

				System.out.println("가입하실 Id를 적으시오");
				System.out.print(">> Id : ");
				String nId = sc.next();
				System.out.println();

				String sql = "select * from test3 where id = '" + nId +"'";
				pstmt = con.prepareStatement(sql);
				int updateCount = pstmt.executeUpdate();
				rs = pstmt.executeQuery();
				
				if(rs.next()) {
					System.out.println("중복된 Id입니다.");
					System.out.println();
					continue;
				} else {
					System.out.println("사용 가능한 Id입니다.");
					System.out.println();
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
					System.out.println();
					System.out.println("가입이 정상적으로 완료되었습니다!!");
					System.out.println();
					
					mc.main(args);
					break;
				}

			} catch(SQLException sqle) {
				System.out.println();
				System.out.println("이미 사용중인 Id입니다.");
				System.out.println();
				continue;
			}  finally {
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
			}//회원 등록
		}
	}
	
	public void deleteMember(String[] args) throws Exception {
		MultiClient6 mc = new MultiClient6();

		while(true) {
			try {
				con = DriverManager.getConnection(
						"jdbc:oracle:thin:@localhost:1521:xe",
						"scott",
						"tiger");

				System.out.println("삭제하실 Id를 적으시오");
				System.out.print(">> Id : ");
				String nId = sc.next();
				System.out.println();

				String sql = "select * from test3 where id = '" + nId +"'";
				pstmt = con.prepareStatement(sql);
				rs = pstmt.executeQuery();
				

				if(rs.next()) {
					System.out.println("회원탈퇴 가능한 Id입니다.");
					System.out.println();
					
					System.out.println("회원탈퇴하실 Id를 적으시오");
					System.out.print(">> Id : ");
					String bId = sc.next();
					
					sql = "delete from test3 where id = '"+ bId +"'";
					pstmt = con.prepareStatement(sql);
					
					int updateCount = pstmt.executeUpdate();
					
					System.out.println();
					System.out.println("회원탈퇴가 정상적으로 완료되었습니다!!");
					System.out.println();
					mc.main(args);
				} else {
					System.out.println("사용자 정보가 없는 Id입니다.");
					System.out.println();		
					mc.main(args);
				}

			} catch(SQLException sqle) {

			}  finally {
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
			}//회원 등록
		}
	}

}