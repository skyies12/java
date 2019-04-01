package Client;

import java.io.*;
import java.net.*;
import java.sql.*;
import java.util.*;


public class MultiServer8 {
	ServerSocket serverSocket = null;
	Socket socket = null;
	Map<String, PrintWriter> clientMap;
	Map<String, PrintWriter> clientMap1;
	Map<String, PrintWriter> clientMap2;
	Map<String, PrintWriter> clientMap3;
	Map<String, PrintWriter> clientMap4;
	Map<String, PrintWriter> clientMap5;



	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		}
	}

	// 생성자
	public MultiServer8() {
		//클라이언트의 출력스트림을 저장할 해쉬맵 생성
		clientMap = new HashMap<String, PrintWriter>();
		// 해쉬맵 동기화 설정
		Collections.synchronizedMap(clientMap);
		clientMap1 = new HashMap<String, PrintWriter>();
		// 해쉬맵 동기화 설정
		Collections.synchronizedMap(clientMap1);
		clientMap2 = new HashMap<String, PrintWriter>();
		// 해쉬맵 동기화 설정
		Collections.synchronizedMap(clientMap2);
		clientMap3 = new HashMap<String, PrintWriter>();
		// 해쉬맵 동기화 설정
		Collections.synchronizedMap(clientMap3);
		
		clientMap4 = new HashMap<String, PrintWriter>();
		// 해쉬맵 동기화 설정
		Collections.synchronizedMap(clientMap4);
		
		clientMap5 = new HashMap<String, PrintWriter>();
		// 해쉬맵 동기화 설정
		Collections.synchronizedMap(clientMap5);

		clientMap5 = new HashMap<String, PrintWriter>();
		// 해쉬맵 동기화 설정
		Collections.synchronizedMap(clientMap5);
	}


	public void init() {
		try {
			serverSocket = new ServerSocket(9999); // 9999포트로 서버소켓 객체 생성
			System.out.println("서버가 시작되었습니다.");

			while (true) {
				socket = serverSocket.accept();
				System.out.println(socket.getInetAddress() + ":" + socket.getPort());

				Thread mst = new MultiServerT(socket); // 쓰레드 생성
				mst.start();
			}	
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				serverSocket.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	// 접속자 리스트 보내기
	public void list(PrintWriter out) {
		// 출력스트림을 순차적으로 얻어와서 해당 메시지를 출력한다.
		Iterator<String> it = clientMap.keySet().iterator();
		String msg = "대기실 [";
		while (it.hasNext()) {
			msg += (String)it.next() + ",";
		}
		msg = msg.substring(0, msg.length()-1) + "]";
		out.println(msg);
	}

	public void list1(PrintWriter out) {
		// 출력스트림을 순차적으로 얻어와서 해당 메시지를 출력한다.
		Iterator<String> it = clientMap1.keySet().iterator();
		String msg = "10대 방 [";
		while (it.hasNext()) {
			msg += (String)it.next() + ",";
		}
		msg = msg.substring(0, msg.length()-1) + "]";
		out.println(msg);
	}

	public void list2(PrintWriter out) {
		// 출력스트림을 순차적으로 얻어와서 해당 메시지를 출력한다.
		Iterator<String> it = clientMap2.keySet().iterator();
		String msg = "20대 방 [";
		while (it.hasNext()) {
			msg += (String)it.next() + ",";
		}
		msg = msg.substring(0, msg.length()-1) + "]";
		out.println(msg);
	}

	public void list3(PrintWriter out) {
		// 출력스트림을 순차적으로 얻어와서 해당 메시지를 출력한다.
		Iterator<String> it = clientMap3.keySet().iterator();
		String msg = "30대 방 [";
		while (it.hasNext()) {
			msg += (String)it.next() + ",";
		}
		msg = msg.substring(0, msg.length()-1) + "]";
		out.println(msg);
	}
	
	public void list4(PrintWriter out) {
		// 출력스트림을 순차적으로 얻어와서 해당 메시지를 출력한다.
		Iterator<String> it = clientMap4.keySet().iterator();
		String msg = "40대 방 [";
		while (it.hasNext()) {
			msg += (String)it.next() + ",";
		}
		msg = msg.substring(0, msg.length()-1) + "]";
		out.println(msg);
	}

	public void sendAllMsg(String user, String msg) {
		// 출력스트림을 순차적으로 얻어와서 해당 메시지를 출력한다.
		Iterator<String> it = clientMap.keySet().iterator();

		while (it.hasNext()) {
			try {
				PrintWriter it_out = (PrintWriter) clientMap.get(it.next());
				if(user.equals("")) {
					it_out.println(msg);
				} else {
					it_out.println("[" + user + "] " + msg);
				}
			} catch (Exception e) {
				System.out.println("예외 : " + e);
			}
		} 
	}

	public void sendroom1Msg( String user, String msg) {
		// 출력스트림을 순차적으로 얻어와서 해당 메시지를 출력한다.
		Iterator<String> it = clientMap1.keySet().iterator();

		while (it.hasNext()) {
			try {
				PrintWriter it_out = (PrintWriter) clientMap1.get(it.next());
				if(user.equals("")) {
					it_out.println(msg);
				} else {
					it_out.println("[" + user + "] " + msg);
				}
			} catch (Exception e) {
				System.out.println("예외 : " + e);
			}
		} 
	}

	public void sendroom2Msg( String user, String msg) {
		// 출력스트림을 순차적으로 얻어와서 해당 메시지를 출력한다.
		Iterator<String> it = clientMap2.keySet().iterator();

		while (it.hasNext()) {
			try {
				PrintWriter it_out = (PrintWriter) clientMap2.get(it.next());
				if(user.equals("")) {
					it_out.println(msg);
				} else {
					it_out.println("[" + user + "] " + msg);
				}
			} catch (Exception e) {
				System.out.println("예외 : " + e);
			}
		} 
	}

	public void sendroom3Msg( String user, String msg) {
		// 출력스트림을 순차적으로 얻어와서 해당 메시지를 출력한다.
		Iterator<String> it = clientMap3.keySet().iterator();

		while (it.hasNext()) {
			try {
				PrintWriter it_out = (PrintWriter) clientMap3.get(it.next());
				if(user.equals("")) {
					it_out.println(msg);
				} else {
					it_out.println("[" + user + "] " + msg);
				}
			} catch (Exception e) {
				System.out.println("예외 : " + e);
			}
		} 
	}
	
	public void sendroom4Msg( String user, String msg) {
		// 출력스트림을 순차적으로 얻어와서 해당 메시지를 출력한다.
		Iterator<String> it = clientMap4.keySet().iterator();

		while (it.hasNext()) {
			try {
				PrintWriter it_out = (PrintWriter) clientMap4.get(it.next());
				if(user.equals("")) {
					it_out.println(msg);
				} else {
					it_out.println("[" + user + "] " + msg);
				}
			} catch (Exception e) {
				System.out.println("예외 : " + e);
			}
		} 
	}


	public static void main(String[] args) {
		// 서버객체 생성
		MultiServer8 ms = new MultiServer8();
		ms.init();

		///////////////////////////////////////////////////////////////
		// 내부 클래스
		// 클라이언트로부터 읽어온 메시지를 다른 클라이언트(socket)에 보내는 역할을 하는 메서드			
	}

	class MultiServerT extends Thread  {
		Socket socket;
		PrintWriter out = null;
		BufferedReader in = null;
		String s = "";
		String name = "";
		String room = "";
		String roomid = "";

		// 생성자
		public MultiServerT(Socket socket) {

			this.socket = socket;
			try {
				out = new PrintWriter(this.socket.getOutputStream(), true);
				in = new BufferedReader(new InputStreamReader(this.socket.getInputStream()));

			} catch (Exception e) {
				System.out.println("예외 : " + e);
			}
		}
		
		// 쓰레드를 사용하기 위해서 run()메서드 재정의
		@Override
		public void run() {
			// 클라이언트로부터 받은 이름을 저장할 변수
<<<<<<< HEAD
			try {			
=======
			try {
>>>>>>> Web
				name = in.readLine(); // 클라이언트에서 처음으로 보내는 메시지는
				// 클라이언트가 사용할 이름이다.
				// 현재 객체가 가지고있는 소켓을 제외하고 다른 소켓(클라이언트)들에게 접속을 알림
				clientMap.put(name, out); // 해쉬맵에 키를 name으로 출력스트림 객체를 저장
<<<<<<< HEAD
				clientMap5.put(name, out); // 해쉬맵에 키를 name으로 출력스트림 객체를 저장
				if(good() == true) {
					out.println("관리자");
				} else {
					out.println("접속자");
				}
=======
				clientMap5.put(name, out);
>>>>>>> Web
				out.println("대기실 입장");
				sendAllMsg("", name + "님이 대기실에 입장하셨습니다.");
				System.out.println("현재 대기실 접속자 수는 " + clientMap.size() + "명 입니다.");	
				while ((s = in.readLine()) != null) {
					if(s.startsWith("/")) {
						if (s.equals("/sos")) {
							order(out);
						} else if (s.equals("/badd")) {
							BlackList(out);
						} else if (s.equals("/bdel")) {
							BlackListRemove(out);
						} else if (s.equals("/list")) { // list 명령어 입력시 현재 접속자 리스트 출력
							out.println("============ *접속자 리스트* ============");
							list(out);
							list1(out);
							list2(out);
							list3(out);
							list4(out);
						} else if(s.indexOf("/to") >= 0){
							sendMsg(s);
<<<<<<< HEAD
						} else if(s.equals("/room")) {
							room();
						}
					} else {
=======
						}  else if(s.equals("/room")) {
							room();
						}
					
					} else{
>>>>>>> Web
						sendAllMsg(name, s); //현재 소켓에서 읽어온메시지를 해쉬맵에 저장된 모든
						//출력스트림으로 보낸다.
					}
				}
				//				System.out.println("Bye....");

			} catch (Exception e) {

			} finally {
				// 예외가 발생할 때 퇴장. 해쉬맵에서 해당 데이터 제거
				// 보통 종료하거나 나가면 java.net.SocketException: 예외발생
				clientMap.remove(name);
				sendAllMsg("", name + "님이 퇴장하셨습니다.");
				System.out.println("현재 접속자 수는 " + clientMap.size() + "명 입니다.");

				try {
					in.close();
					out.close();

					socket.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
<<<<<<< HEAD
		
        public void back() throws Exception {
        	Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
        	
            clientMap.put(name, out); // 해쉬맵에 키를 name으로 출력스트림 객체를 저장
            clientMap1.remove(name);
            clientMap2.remove(name);
            clientMap3.remove(name);
            clientMap4.remove(name);
        
            good();
            out.println("대기실 입장");
            sendAllMsg("", name + "님이 대기실에 입장하셨습니다.");
            
            System.out.println("현재 대기실 접속자 수는 " + clientMap.size() + "명 입니다.");    
            while ((s = in.readLine()) != null) {
                if(s.startsWith("/")) {
                    if (s.equals("/sos")) {
                        order(out);
                    } else if (s.equals("/badd")) {
                        BlackList(out);
                    } else if (s.equals("/bdel")) {
                        BlackListRemove(out);
                    } else if (s.equals("/list")) { // list 명령어 입력시 현재 접속자 리스트 출력
                    	out.println("============ *접속자 리스트* ============");
						list(out);
						list1(out);
						list2(out);
						list3(out);
						list4(out); 
                    } else if (s.equals("/yok")) {
                        yokList(out);
                    }
                    else if(s.indexOf("/to") >= 0){
                        sendMsg(s);
                    }  else if(s.equals("/room")) {
                        room();
                    }
                
                } else{
                    sendAllMsg(name, s); //현재 소켓에서 읽어온메시지를 해쉬맵에 저장된 모든
                    //출력스트림으로 보낸다.
                }
            }    
        }
		
        public void room() throws Exception {
            out.println("1. 10대    2. 20대    3. 30대    4. 40대");
            out.println(">> 방 : ");
            roomid = in.readLine();
            
            // 입력스트림이 null이 아니면 반복
            if(roomid.equals("1")) { 
                out.println("10대방 입장");
                out.println("          ============ *공지 사항* ============");
    			out.println("/rsos 입력하시면 사용할 수 있는 명령어 리스트를 볼수 있습니다.");
                sendroom1Msg("", name + "님이 10대 방에 입장하셨습니다.");
                clientMap1.put(name, out); // 해쉬맵에 키를 name으로 출력스트림 객체를 저장
                clientMap5.put(name, out);
                clientMap.remove(name);
                System.out.println("현재 10대 방 접속자 수는 " + clientMap1.size() + "명 입니다.");    
                System.out.println("현재 대기실 접속자 수는 " + clientMap.size() + "명 입니다.");
                while ((s = in.readLine()) != null) {
                    if(s.startsWith("/")) {
                        if (s.equals("/rsos")) {
                            roomorder(out);
                        } else if (s.equals("/list")) { // list 명령어 입력시 현재 접속자 리스트 출력
                        	out.println("============ *접속자 리스트* ============");
							list(out);
							list1(out);
							list2(out);
							list3(out);
							list4(out);  
                        } else if(s.indexOf("/to") >= 0){
                            sendMsg(s);
                        } else if (s.equals("/back")) {
                            back();
                        }

                    }else{
                        sendroom1Msg(name, s); //현재 소켓에서 읽어온메시지를 해쉬맵에 저장된 모든
                        //출력스트림으로 보낸다.
                    }
                }
            } else if (roomid.equals("2")) {
                out.println("20대방 입장");
                out.println("          ============ *공지 사항* ============");
    			out.println("/rsos 입력하시면 사용할 수 있는 명령어 리스트를 볼수 있습니다.");
    			
                sendroom2Msg("", name + "님이 20대 방에 입장하셨습니다.");
                // 현재 객체가 가지고있는 소켓을 제외하고 다른 소켓(클라이언트)들에게 접속을 알림
                clientMap2.put(name, out); // 해쉬맵에 키를 name으로 출력스트림 객체를 저장
                clientMap5.put(name, out);
                clientMap.remove(name);
                System.out.println("현재 20대 방 접속자 수는 " + clientMap2.size() + "명 입니다.");
                System.out.println("현재 대기실 접속자 수는 " + clientMap.size() + "명 입니다.");
                while ((s = in.readLine()) != null) {
                    if(s.startsWith("/")) {
                        if (s.equals("/rsos")) {
                            roomorder(out);
                        } else if (s.equals("/list")) { // list 명령어 입력시 현재 접속자 리스트 출력
                        	out.println("============ *접속자 리스트* ============");
							list(out);
							list1(out);
							list2(out);
							list3(out);
							list4(out);  
                        } else if(s.indexOf("/to") >= 0){
                            sendMsg(s);
                        } else if (s.equals("/back")) {
                            back();
                        }
                    }else{
                        sendroom2Msg(name, s); //현재 소켓에서 읽어온메시지를 해쉬맵에 저장된 모든
                        //출력스트림으로 보낸다.
                    }
                }
            }
            else if (roomid.equals("3")) {
                out.println("30대방 입장");
                out.println("          ============ *공지 사항* ============");
    			out.println("/rsos 입력하시면 사용할 수 있는 명령어 리스트를 볼수 있습니다.");
    			
                sendroom3Msg("", name + "님이 30대 방에 입장하셨습니다.");
                // 현재 객체가 가지고있는 소켓을 제외하고 다른 소켓(클라이언트)들에게 접속을 알림
                clientMap3.put(name, out); // 해쉬맵에 키를 name으로 출력스트림 객체를 저장
                clientMap5.put(name, out);
                clientMap.remove(name);
                System.out.println("현재 30대 방 접속자 수는 " + clientMap3.size() + "명 입니다.");    
                System.out.println("현재 대기실 접속자 수는 " + clientMap.size() + "명 입니다.");
                while ((s = in.readLine()) != null) {
                    if(s.startsWith("/")) {
                        if (s.equals("/rsos")) {
                            roomorder(out);
                        } else if (s.equals("/list")) { // list 명령어 입력시 현재 대기실 접속자 리스트 출력
                        	out.println("============ *접속자 리스트* ============");
							list(out);
							list1(out);
							list2(out);
							list3(out);
							list4(out);    
                        } else if(s.indexOf("/to") >= 0){
                            sendMsg(s);
                        } else if (s.equals("/back")) {
                            back();
                        }
                    }else{
                        sendroom3Msg(name, s); //현재 소켓에서 읽어온메시지를 해쉬맵에 저장된 모든
                        //출력스트림으로 보낸다.
                    }
                }
            } 
            else if (roomid.equals("4")) {
                out.println("40대방 입장");
                out.println("          ============ *공지 사항* ============");
    			out.println("/rsos 입력하시면 사용할 수 있는 명령어 리스트를 볼수 있습니다.");
    			
                sendroom4Msg("", name + "님이 40대 방에 입장하셨습니다.");
                // 현재 객체가 가지고있는 소켓을 제외하고 다른 소켓(클라이언트)들에게 접속을 알림
                clientMap4.put(name, out); // 해쉬맵에 키를 name으로 출력스트림 객체를 저장
                clientMap5.put(name, out);
                clientMap.remove(name);
                System.out.println("현재 40대 방 접속자 수는 " + clientMap4.size() + "명 입니다.");
                System.out.println("현재 대기실 접속자 수는 " + clientMap.size() + "명 입니다.");
                while ((s = in.readLine()) != null) {
                    if(s.startsWith("/")) {
                        if (s.equals("/rsos")) {
                            roomorder(out);
                        } else if (s.equals("/list")) { // list 명령어 입력시 현재 접속자 리스트 출력
                        	out.println("============ *접속자 리스트* ============");
							list(out);
							list1(out);
							list2(out);
							list3(out);
							list4(out);   
                        } else if(s.indexOf("/to") >= 0){
                            sendMsg(s);
                        } else if (s.equals("/back")) {
                            back();
                        }
                    }else{
                        sendroom4Msg(name, s); //현재 소켓에서 읽어온메시지를 해쉬맵에 저장된 모든
                        //출력스트림으로 보낸다.
                    }
                }
            } else {
            	out.println("입력된 값이 잘못되었습니다. [1-4] 메뉴늘 선택해주세요!");
            }
        }
=======
		public void back() throws Exception {
			clientMap.put(name, out); // 해쉬맵에 키를 name으로 출력스트림 객체를 저장
			clientMap1.remove(name);
			clientMap2.remove(name);
			clientMap3.remove(name);
			clientMap4.remove(name);
			clientMap5.put(name, out);
			out.println("대기실 입장");
			sendAllMsg("", name + "님이 대기실에 입장하셨습니다.");
			System.out.println("현재 대기실 접속자 수는 " + clientMap.size() + "명 입니다.");	
			while ((s = in.readLine()) != null) {
				if(s.startsWith("/")) {
					if (s.equals("/sos")) {
						order(out);
					} else if (s.equals("/badd")) {
						BlackList(out);
					} else if (s.equals("/bdel")) {
						BlackListRemove(out);
					} else if (s.equals("/list")) { // list 명령어 입력시 현재 접속자 리스트 출력
						list(out);	
					} else if (s.equals("/yok")) {
						yokList(out);
					}
					else if(s.indexOf("/to") >= 0){
						sendMsg(s);
					}  else if(s.equals("/room")) {
						room();
					}
				
				} else{
					sendAllMsg(name, s); //현재 소켓에서 읽어온메시지를 해쉬맵에 저장된 모든
					//출력스트림으로 보낸다.
				}
			}	
		}
		
		public void room() throws Exception {
			out.println("1. 10대    2. 20대    3. 30대    4. 40대");
			out.println(">> 방 : ");
			roomid = in.readLine();

			// 입력스트림이 null이 아니면 반복
			if(roomid.equals("1")) { 
				out.println("10대방 입장");
				sendroom1Msg("", name + "님이 10대 방에 입장하셨습니다.");
				clientMap1.put(name, out); // 해쉬맵에 키를 name으로 출력스트림 객체를 저장
				clientMap5.put(name, out);
				clientMap.remove(name);
				System.out.println("현재 10대 방 접속자 수는 " + clientMap1.size() + "명 입니다.");	
				System.out.println("현재 대기실 접속자 수는 " + clientMap.size() + "명 입니다.");
				while ((s = in.readLine()) != null) {
					if(s.startsWith("/")) {
						if (s.equals("/sos")) {
							order(out);
						} else if (s.equals("/badd")) {
							BlackList(out);
						} else if (s.equals("/bdel")) {
							BlackListRemove(out);
						} else if (s.equals("/1list")) { // list 명령어 입력시 현재 접속자 리스트 출력
							list1(out);	
						} else if (s.equals("/list")) { // list 명령어 입력시 현재 접속자 리스트 출력
							list(out);	
						} else if(s.indexOf("/to") >= 0){
							sendMsg(s);
						} else if (s.equals("/back")) {
							back();
						}

					}else{
						sendroom1Msg(name, s); //현재 소켓에서 읽어온메시지를 해쉬맵에 저장된 모든
						//출력스트림으로 보낸다.
					}
				}
			} else if (roomid.equals("2")) {
				out.println("20대방 입장");

				sendroom2Msg("", name + "님이 20대 방에 입장하셨습니다.");
				// 현재 객체가 가지고있는 소켓을 제외하고 다른 소켓(클라이언트)들에게 접속을 알림
				clientMap2.put(name, out); // 해쉬맵에 키를 name으로 출력스트림 객체를 저장
				clientMap5.put(name, out);
				clientMap.remove(name);
				System.out.println("현재 20대 방 접속자 수는 " + clientMap2.size() + "명 입니다.");
				System.out.println("현재 대기실 접속자 수는 " + clientMap.size() + "명 입니다.");
				while ((s = in.readLine()) != null) {
					if(s.startsWith("/")) {
						if (s.equals("/sos")) {
							order(out);
						} else if (s.equals("/badd")) {
							BlackList(out);
						} else if (s.equals("/bdel")) {
							BlackListRemove(out);
						} else if (s.equals("/2list")) { // list 명령어 입력시 현재 접속자 리스트 출력
							list2(out);	
						} else if (s.equals("/list")) { // list 명령어 입력시 현재 접속자 리스트 출력
							list(out);	
						} else if(s.indexOf("/to") >= 0){
							sendMsg(s);
						}
					}else{
						sendroom2Msg(name, s); //현재 소켓에서 읽어온메시지를 해쉬맵에 저장된 모든
						//출력스트림으로 보낸다.
					}
				}
			}
			else if (roomid.equals("3")) {
				out.println("30대방 입장");

				sendroom3Msg("", name + "님이 30대 방에 입장하셨습니다.");
				// 현재 객체가 가지고있는 소켓을 제외하고 다른 소켓(클라이언트)들에게 접속을 알림
				clientMap3.put(name, out); // 해쉬맵에 키를 name으로 출력스트림 객체를 저장
				clientMap5.put(name, out);
				clientMap.remove(name);
				System.out.println("현재 30대 방 접속자 수는 " + clientMap3.size() + "명 입니다.");	
				System.out.println("현재 대기실 접속자 수는 " + clientMap.size() + "명 입니다.");
				while ((s = in.readLine()) != null) {
					if(s.startsWith("/")) {
						if (s.equals("/sos")) {
							order(out);
						} else if (s.equals("/badd")) {
							BlackList(out);
						} else if (s.equals("/bdel")) {
							BlackListRemove(out);
						} else if (s.equals("/3list")) { // 3list 명령어 입력시 현재 접속자 리스트 출력
							list3(out);	
						} else if (s.equals("/list")) { // list 명령어 입력시 현재 대기실 접속자 리스트 출력
							list(out);	
						} else if(s.indexOf("/to") >= 0){
							sendMsg(s);
						}
					}else{
						sendroom3Msg(name, s); //현재 소켓에서 읽어온메시지를 해쉬맵에 저장된 모든
						//출력스트림으로 보낸다.
					}
				}
			} 
			else if (roomid.equals("4")) {
				out.println("40대방 입장");

				sendroom4Msg("", name + "님이 40대 방에 입장하셨습니다.");
				// 현재 객체가 가지고있는 소켓을 제외하고 다른 소켓(클라이언트)들에게 접속을 알림
				clientMap4.put(name, out); // 해쉬맵에 키를 name으로 출력스트림 객체를 저장
				clientMap5.put(name, out);
				clientMap.remove(name);
				System.out.println("현재 40대 방 접속자 수는 " + clientMap4.size() + "명 입니다.");
				System.out.println("현재 대기실 접속자 수는 " + clientMap.size() + "명 입니다.");
				while ((s = in.readLine()) != null) {
					if(s.startsWith("/")) {
						if (s.equals("/sos")) {
							order(out);
						} else if (s.equals("/badd")) {
							BlackList(out);
						} else if (s.equals("/bdel")) {
							BlackListRemove(out);
						} else if (s.equals("/4list")) { // list 명령어 입력시 현재 접속자 리스트 출력
							list4(out);	
						} else if (s.equals("/list")) { // list 명령어 입력시 현재 접속자 리스트 출력
							list(out);	
						}else if(s.indexOf("/to") >= 0){
							sendMsg(s);
						} else if (s.equals("/yok")) {
							yokList(out);
						}
					}else{
						sendroom4Msg(name, s); //현재 소켓에서 읽어온메시지를 해쉬맵에 저장된 모든
						//출력스트림으로 보낸다.
					}
				}
			} 
		}
>>>>>>> Web

		public void order(PrintWriter out) {
			out.println("======= 대기실 명령어 =======");
			out.println("/list : 전체 리스트");
			out.println("/to [받는 사람] [내용] : 귓속말");
			out.println("/room : 채팅 방 참여");
			out.println("q : 프로그램 종료");
		}
		
		public void roomorder(PrintWriter out) {
			out.println("======= 방 명령어 =======");
			out.println("/list : 전체 리스트");
			out.println("/to [받는 사람] [내용] : 귓속말");
			out.println("/back : 방 나가기");
			out.println("q : 프로그램 종료");
		}


		// 귓속말
		public void sendMsg(String message) {
			// 귀속말로 넘어온 메시지 중 아이디 부분에 해당되는 문자열을 찾기 위해서
			int start = message.indexOf(" ") + 1;	// 처음 공백 문자 다음부다
			int end = message.indexOf(" ",start);	// 두번째 공백 문자 사이의 만자가 아이디
			if(end != -1) {
				String id = message.substring(start, end);	// 보내진 메시지 중 아이디 부분만 얻어냄
				String msg = message.substring(end +1);	// 아이디 이후는 대화내용이 된다
				PrintWriter pw = clientMap5.get(id);	// 해쉬 맵에서 아이디로 출력 스트림을 얻어
				if(pw != null) {		
					pw.println(name + "님의 귓속말 : " + msg);
					pw.flush();
				}
<<<<<<< HEAD
			}
		}
		
		public boolean good() throws Exception {
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			boolean blogin = false;
			
			con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe",
					"scott",
					"tiger");
			String sql = "select * from test3 where id = 'skyies12'";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				blogin = true;
=======
>>>>>>> Web
			}
			return blogin;
		}

		public void yokList(PrintWriter out) throws Exception {	
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;

			while(true) {
				try {
					con = DriverManager.getConnection(
							"jdbc:oracle:thin:@localhost:1521:xe",
							"scott",
							"tiger");
					out.println("==== 금칙어 중복 체크 ====");
					out.println("지정할 금칙어를 입력하세요.");
					String yok = in.readLine();
					out.println();

					String sql = "select * from test4 where yok = '"+ yok +"'";
					pstmt = con.prepareStatement(sql);
					rs = pstmt.executeQuery();

					if(rs.next()) {
						out.println("이미 등록된 금칙어 입니다.");
						out.println();
						break;

					} else {
						out.println("등록 가능한 금칙어입니다.");
						out.println();
						sql = "insert into test4 values(?)";
						pstmt = con.prepareStatement(sql);
						out.println("지정할 금칙어를 입력하세요.");
						String nyok = in.readLine();
						pstmt.setString(1, nyok);
						int updateCount = pstmt.executeUpdate();
						out.println();
						out.println("금칙어 등록이 정상적으로 완료되었습니다!!");
						out.println();
						break;
					}

				} catch(SQLException sqle) {


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
				break;
			}
		}
		
		// 블랙리스트 처리
		public void BlackList(PrintWriter out) throws Exception {	
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;

			while(true) {
				try {
					con = DriverManager.getConnection(
							"jdbc:oracle:thin:@localhost:1521:xe",
							"scott",
							"tiger");
					out.println("==== 블랙 리스트 중복 체크 ====");
					out.println("블랙 리스트할 아이디를 입력하세요.");
					String nblack = in.readLine();
					out.println();

					String sql = "select * from test3 where black = '"+ nblack +"'";
					pstmt = con.prepareStatement(sql);
					rs = pstmt.executeQuery();

					if(rs.next()) {
						out.println("이미 블랙리스트에 등록된 아이디입니다.");
						out.println();
						break;

					} else {
						out.println("블랙리스트에 등록 가능한 아이디입니다.");
						out.println();
						sql = "insert into test3 values(0, 0, ?)";
						pstmt = con.prepareStatement(sql);
						out.println("블랙 리스트할 아이디를 입력하세요.");
						String black = in.readLine();
						pstmt.setString(1, black);
						int updateCount = pstmt.executeUpdate();
						out.println();
						out.println("등록이 정상적으로 완료되었습니다!!");
						out.println();
						break;
					}

				} catch(SQLException sqle) {


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
				break;
			}
		}


		public void BlackListRemove(PrintWriter out) throws Exception {	
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;

			while(true) {
				try {
					con = DriverManager.getConnection(
							"jdbc:oracle:thin:@localhost:1521:xe",
							"scott",
							"tiger");
					out.println("==== 블랙 리스트 제거 ====");
					out.println("블랙 리스트에서 삭제할 아이디를 입력하세요.");
					String nblack = in.readLine();
					out.println();

					String sql = "select * from test3 where black = '"+ nblack +"'";
					pstmt = con.prepareStatement(sql);
					rs = pstmt.executeQuery();

					if(rs.next()) {
						out.println("삭제가 가능한 아이디입니다.");
						out.println();

						out.println("블랙 리스트할 아이디를 입력하세요.");
						String black = in.readLine();
						sql = "delete from test3 where black = '"+ black +"'";
						pstmt = con.prepareStatement(sql);
						int updateCount = pstmt.executeUpdate();
						out.println();
						out.println("삭제가 정상적으로 완료되었습니다!!");
						out.println();
						break;

					} else {
						out.println("블랙리스트에서 이미 삭제되거나 등록되지 않은 아이디입니다.");
						out.println();
						break;
					}
				} catch(SQLException sqle) {


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
				break;
			}
			
		}
		
	}

}
