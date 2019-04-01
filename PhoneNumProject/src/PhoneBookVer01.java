import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import javax.swing.*;
import javax.swing.border.*;
import java.sql.*;

interface INIT_MENU {
	int INPUT = 1, EXIT = 2;
}

interface INPUT_SELECT {
	int NORMAL = 1, UNIV = 2, COMPANY = 3;
}

class MenuChoiceException extends Exception {
	int wrongChoice;
	
	public MenuChoiceException(int Choice) {
		super("잘못된 선택이 이뤄졌습니다.");
		wrongChoice = Choice;
	}
	
	public void showWroungChoice() {
		System.out.println(wrongChoice + "에 해당하는 선택은 존재하지 않습니다.");
	}
}
class PhoneInfo implements Serializable {
	String name;
	String phoneNumber;

	
	public PhoneInfo (String name, String num) {
		this.name = name;
		phoneNumber = num;
	}
	
	public void showPhoneInfo() {
		System.out.println("Name : " + name);
		System.out.println("phoneNumber : " + phoneNumber);
	}
	
	public int hashCode() {
		return name.hashCode();
	}
	
	public boolean equals(Object obj) {
		PhoneInfo cmp = (PhoneInfo)obj;
		if(name.compareTo(cmp.name)==0) {
			return true;
		} else {
			return false;
		}
	}
}

class PhoneUnivInfo extends PhoneInfo {
	String Univ;
	int year;
	
	public PhoneUnivInfo(String name,String num, String Univ, int year) {
		super(name, num);
		this.Univ = Univ;
		this.year = year;
	}
	
	public void showPhoneInfo() {
		System.out.println("Univ : " + Univ);
		System.out.println("year : "+ year);
	}
}

class PhoneCompanyInfo extends PhoneInfo {
	String company;
	
	public PhoneCompanyInfo(String name,String num, String company) {
		super(name, num);
		this.company = company;
	}
	
	public void showPhoneInfo() {
		super.showPhoneInfo();
		System.out.println("Company : " + company);
	}
	
	public String toString() {
		return super.toString() + "Company : " + company + '\n'; 
	}
}

class PhoneBookManager {
//	final int MAX_CNT = 100;
//	
//	PhoneInfo[] infoStorage = new PhoneInfo[MAX_CNT];
//	int curCnt = 0;
	private final File dataFile = new File("PhoneBook.dat");
	HashSet<PhoneInfo> infoStorage = new HashSet<PhoneInfo>();
	
	static PhoneBookManager inst = null;
	
	public static PhoneBookManager createManagerInst() {
		if (inst == null) {
			inst = new PhoneBookManager();
		}
		return inst;
	}
	
	private PhoneBookManager() {
		readFromFile();
	}
	
	private PhoneInfo readFriendInfo() {
		System.out.print("이름 : ");
		String name = MenuViewer.sc.next();
		System.out.print("전화번호 : ");
		String num = MenuViewer.sc.next();
		return new PhoneInfo(name, num);
	}
	
	private PhoneInfo readUnivFriendInfo() {
		System.out.print("이름 : ");
		String name = MenuViewer.sc.next();
		System.out.print("전화번호 : ");
		String num = MenuViewer.sc.next();
		System.out.print("전공 : ");
		String univ = MenuViewer.sc.next();
		System.out.print("학년 : ");
		int year = MenuViewer.sc.nextInt();
		
		return new PhoneUnivInfo(name, num, univ, year);
	}
	
	private PhoneInfo readCompanyFriendInfo() {
		System.out.print("이름 : ");
		String name = MenuViewer.sc.next();
		System.out.print("전화번호 : ");
		String num = MenuViewer.sc.next();
		System.out.print("회사 : ");
		String company = MenuViewer.sc.next();
		
		return new PhoneCompanyInfo(name, num, company);
	}
	
	public void inputData() throws MenuChoiceException {
		System.out.println("데이터 입력을 시작합니다...");
		System.out.println("1. 일반  2. 대학 3. 회사");
		System.out.print("선택 : ");
		
		int choice = MenuViewer.sc.nextInt();
		MenuViewer.sc.nextLine();
		PhoneInfo info = null;
		
		if (choice < INPUT_SELECT.NORMAL || choice > INPUT_SELECT.COMPANY) {
			throw new MenuChoiceException(choice);
		}
		
		switch (choice) {
		case INPUT_SELECT.NORMAL:
			info = readFriendInfo();
			break;
		case INPUT_SELECT.UNIV:
			info = readUnivFriendInfo();
			break;
		case INPUT_SELECT.COMPANY:
			info = readCompanyFriendInfo();
			break;
		}
		
//		infoStorage[curCnt++] = info;
		System.out.println("데이터 입력이 완료되었습니다. \n");
		
		boolean isAdded = infoStorage.add(info);
		if(isAdded == true) {
			System.out.println("데이터 입력이 완료되었습니다. \n");
		} else {
			System.out.println("이미 저장된 데이터입니다. \n");
		}
	}
	
	public String searchData(String name) {
		PhoneInfo info = search(name);
		if(info == null) {
			return null;
		} else {
			return info.toString();
		}
	}
	
	public boolean deletData(String name) {
		Iterator<PhoneInfo> itr = infoStorage.iterator();
		while(itr.hasNext()) {
			PhoneInfo curInfo = itr.next();
			if(name.compareTo(curInfo.name)==0) {
				itr.remove();
				return true;
			}
		}
		return false;
	}
	
	private PhoneInfo search(String name) {
		/*
		for (int idx = 0; idx < curCnt; idx++) {
			PhoneInfo curInfo = infoStorage[idx];
			if(name.compareTo(curInfo.name)==0) {
				return idx;
			}
		}
		*/
		Iterator<PhoneInfo> itr = infoStorage.iterator();
		while (itr.hasNext()) {
			PhoneInfo curInfo = itr.next();
			if(name.compareTo(curInfo.name)==0) {
				return curInfo;
			}
		}
		return null;
	}

	public void storeToFile() {
		try {
			FileOutputStream file = new FileOutputStream(dataFile);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			Iterator<PhoneInfo> itr = infoStorage.iterator();
			while(itr.hasNext()) {
				out.writeObject(itr.next());
			}
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void readFromFile() {
		if (dataFile.exists() == false) {
			return;
		}
		try {
			FileInputStream file = new FileInputStream(dataFile);
			ObjectInputStream in = new ObjectInputStream(file);
			
			while(true) {
				PhoneInfo info = (PhoneInfo)in.readObject();
				if(info == null) {
					break;
				}
				infoStorage.add(info);
			}
			in.close();
		} catch (IOException e) {
			return;
		} catch (ClassNotFoundException e) {
			return;
		}
	}
}

class MenuViewer {
	public static Scanner sc = new Scanner(System.in);
	
	public static void showMenu() {
		System.out.println("선택하세요...");
		System.out.println("1. 데이터 입력");
		System.out.println("2. 프로그램 종료");
		System.out.print("선택 : ");
	}
}

class SearchEventHandler implements ActionListener {
	JTextField searchField;
	JTextArea textArea;
	
	public SearchEventHandler(JTextField field, JTextArea area) {
		searchField = field;
		textArea = area;
	}
	
	public void actionPerformed(ActionEvent e) {
		String name = searchField.getText();
		PhoneBookManager manager = PhoneBookManager.createManagerInst();
		
		String srchResult = manager.searchData(name);
		if(srchResult == null) {
			textArea.append("해당하는 데이터가 존재하지 않습니다.\n");
		} else {
			textArea.append("찾으시는 정보를 알려드립니다.\n");
			textArea.append(srchResult);
			textArea.append("\n");
		}
	}
}

class DeleteEventHandler implements ActionListener {
	JTextField delField;
	JTextArea textArea;
	
	public DeleteEventHandler(JTextField field, JTextArea area) {
		delField = field;
		textArea = area;
	}
	
	public void actionPerformed(ActionEvent e) {
		String name = delField.getText();
		PhoneBookManager manager = PhoneBookManager.createManagerInst();
		boolean isDeleted = manager.deletData(name);
		if (isDeleted) {
			textArea.append("데이터 삭제를 완료하였습니다. \n");
		} else {
			textArea.append("해당하는 데이터가 존재하지 않습니다. \n");
		}
	}
}

class SearchDelFrame extends JFrame {
	JTextField srchField = new JTextField(15);
	JButton srchBtn = new JButton("SEARCH");
	
	JTextField delField = new JTextField(15);
	JButton delBtn = new JButton("DEL");
	
	JTextArea textArea = new JTextArea(20, 25);
	
	public SearchDelFrame() {
		super("PhoneBookVer09");
		setBounds(100, 200, 330, 450);
		setLayout(new BorderLayout());
		Border border = BorderFactory.createEtchedBorder();
		
		Border srchBorder = BorderFactory.createTitledBorder(border, "Search");
		JPanel srchPanel = new JPanel();
		srchPanel.setBorder(srchBorder);
		srchPanel.setLayout(new FlowLayout());
		srchPanel.add(srchField);
		srchPanel.add(srchBtn);
		
		Border delBorder = BorderFactory.createTitledBorder(border, "Delete");
		JPanel delPanel = new JPanel();
		delPanel.setBorder(delBorder);
		delPanel.setLayout(new FlowLayout());
		delPanel.add(delField);
		delPanel.add(delBtn);
		
		JScrollPane screllTextArea = new JScrollPane(textArea);
		Border texBorder = BorderFactory.createTitledBorder(border, "Infomation Board");
		screllTextArea.setBorder(texBorder);
		
		add(srchPanel, BorderLayout.NORTH);
		add(delPanel, BorderLayout.SOUTH);
		add(screllTextArea, BorderLayout.CENTER);
		
		srchBtn.addActionListener(new SearchEventHandler(srchField, textArea));
		delBtn.addActionListener(new DeleteEventHandler(delField, textArea));
		
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}
}
class PhoneBookVer01 {
	public static void main(String[] args) {
		PhoneBookManager pbm =  PhoneBookManager.createManagerInst();
		SearchDelFrame winFrame = new SearchDelFrame();
		int choice;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch(ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		}
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe",
					"scott",
					"tiger");
			String sql = "select * from employee";
			pstmt = con.prepareStatement(sql);
			pstmt.executeUpdate();
			rs = pstmt.executeQuery();
			while (rs.next()) {
				int i = 1;
				String name = rs.getString(i++);
				String num = rs.getString(i++);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		while(true) {
			try {
				MenuViewer.showMenu();
				choice = MenuViewer.sc.nextInt();
				MenuViewer.sc.nextLine();
				
				if (choice < INIT_MENU.INPUT || choice > INIT_MENU.EXIT) {
					throw new MenuChoiceException(choice);
				}
				
				switch (choice) {
				case INIT_MENU.INPUT:
					pbm.inputData();
					break;
				case INIT_MENU.EXIT:
					pbm.storeToFile();
					System.out.println("프로그램을 종료합니다.");
					System.exit(0);
					return;
				}
			} catch (MenuChoiceException e) {
				e.showWroungChoice();
				System.out.println("메뉴 선택을 처음부터 다시 진행합니다. \n");
			}
		}
	}
}