package Client;
import java.io.*;
import java.net.*;
import java.util.*;


public class MultiClient6 {
		static {
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
			} catch (ClassNotFoundException cnfe) {
				cnfe.printStackTrace();
			}
		}

		public static void main(String[] args) throws UnknownHostException, IOException, Exception{			

			Function fc = new Function();
			MultiServer8 ms = new MultiServer8();

			while (true) {
				System.out.println();		
				System.out.println("  1. 로그인   2. 회원가입   3. 회원탈퇴");
				System.out.println("===== ===== ===== ===== ===== ===== =====");
				System.out.println();
				System.out.print(">> 메뉴 : ");

				Scanner sc = new Scanner(System.in);
				int key = 0;
				try {
					key = sc.nextInt();
					System.out.println(); // 공백
					if(!(key > 0 && key < 4)){ //1~2외의 숫자가 입력되면 예외 강제 발생
						throw new InputMismatchException();
					}
				} catch (InputMismatchException e) {
					System.out.println("입력된 값이 잘못되었습니다. [1-3] 메뉴늘 선택해주세요!");
					continue;
				}
				switch (key) {
				// 로그인
				case 1:
					fc.login(args);
					break;
				case 2:
					fc.SignUp(args);
					break;
				case 3:
					fc.deleteMember(args); //회원 삭제				
					break;	
				}
				break;
			}//end switch()---------------	
		}

	}
