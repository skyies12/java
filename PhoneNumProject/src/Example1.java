import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.io.*;

interface INIT_MENU1 {
	int INPUT = 1, SEARCH = 2, DELETE = 3, EXIT = 4;
}

interface INPUT_SELECT1 {
	int NORMAL = 1, SALES = 2, MARKETING = 3;
}

class MenuEmpChoiceException extends Exception {
	int wrongchoice;
	
	public MenuEmpChoiceException(int choice) {
		super("잘못된 선택이 이뤄졌습니다.");
		wrongchoice = choice;
	}
	
	public void showEmpWrongChoice() {
		System.out.println(wrongchoice + "에 해당하는 선택은 존재하지 않습니다.");
	}
}

class employee implements Serializable {
	Integer eno;
	String ename;
	String job;
	
	public employee(Integer eno, String ename, String job) {
		this.eno = eno;
		this.ename = ename;
		this.job = job;
	}

	public void showemployee() { 
		System.out.println("eno : " + eno + "\t");
		System.out.println("ename : " + ename + "\t");
		System.out.println("job : " + job + "\t");
		System.out.println();
	}
	
	public int hashCode() {
		return ename.hashCode();
	}
	
	public boolean equals(Object obj) {
		employee cpm = (employee)obj;
		if (ename.compareTo(cpm.ename)==0) {
			return true;
		} else {
			return false;
		}
	}
}

class empSales extends employee {
	Integer commission;
	
	public empSales(Integer eno, String ename, String job, Integer commission) {
		super(eno, ename, job);
		this.commission = commission;
	}
	

	public void showemployee() {
		super.showemployee();
		System.out.println("commission : " + commission);
	}
}

class empMarketing extends employee {
	String Design;
	
	public empMarketing(Integer eno, String ename, String job, String design) {
		super(eno, ename, job);
		this.Design = design;
	}
	
	public void showemployee() {
		super.showemployee();
		System.out.println("Design : " + Design);
	}
}
class employeeManager {
//	final int MAX_NUM = 100;
//	employee[] empStorage = new employee[MAX_NUM];
//	int Cnt = 0;
	private final File dataFile = new File("Emp.dat");
	HashSet<employee> empStorage = new HashSet<employee>();
	
	static employeeManager inst = null;
	
	public static employeeManager createManager() {
		if (inst == null) {
			inst = new employeeManager();
		}
		return inst;
	}
	
	private employeeManager() {
		
	};
	
	private employee readInfo() {
		System.out.print("사원번호 : ");
		int eno = MenuViewer.sc.nextInt();
		System.out.print("사원이름 : ");
		String ename = MenuViewer.sc.next();
		System.out.print("업무 : ");
		String job = MenuViewer.sc.next();
		return new employee(eno, ename, job);
	}
	
	private employee readSalesInfo() {
		System.out.print("사원번호 : ");
		int eno = MenuViewer.sc.nextInt();
		System.out.print("사원이름 : ");
		String ename = MenuViewer.sc.next();
		System.out.print("업무 : ");
		String job = MenuViewer.sc.next();
		System.out.print("커미션 : ");
		Integer commission = MenuViewer.sc.nextInt();
		
		return new empSales(eno, ename, job, commission);
	}
	
	private employee readMarketingInfo() {
		System.out.print("사원번호 : ");
		int eno = MenuViewer.sc.nextInt();
		System.out.print("사원이름 : ");
		String ename = MenuViewer.sc.next();
		System.out.print("업무 : ");
		String job = MenuViewer.sc.next();
		System.out.print("디자인 : ");
		String design = MenuViewer.sc.next();
		
		return new empMarketing(eno, ename, job, design);
	}
	public void inputData() throws MenuEmpChoiceException {
		System.out.println("데이터 입력을 시작합니다...");
		System.out.println("1. 일반  2. 영업부  3. 마케팅부");
		System.out.print("선택 : ");
		
		int choice = MenuViewer.sc.nextInt();
		MenuViewer.sc.nextLine();
		
		employee emp = null;
		
		if (choice < INPUT_SELECT1.NORMAL || choice > INPUT_SELECT1.MARKETING) {
			throw new MenuEmpChoiceException(choice);
		}
		
		switch(choice) {
		case INPUT_SELECT1.NORMAL :
			emp = readInfo();
			break;
		case INPUT_SELECT1.SALES :
			emp = readSalesInfo();
			break;
		case INPUT_SELECT1.MARKETING : 
			emp = readMarketingInfo();
		}
		
//		empStorage[Cnt++] = emp;
		boolean isAdded = empStorage.add(emp);
		if(isAdded == true) {
			System.out.println("데이터 입력이 완료되었습니다. \n");
		} else {
			System.out.println("이미 저장된 데이터입니다. \n");
		}
	}
	
	public void searchData() {
		System.out.print("사원이름 : ");
		String ename = MenuViewer.sc.next();
		/*
		int dataInx = search(ename);
		if(dataInx < 0) {
			System.out.println("해당하는 데이터가 존재하지 않습니다. \n");
		} else {
			empStorage[dataInx].showemployee();
			System.out.println("데이터 검색이 완료되었습니다. \n");
		}
		*/
		
		employee info = search(ename);
		if (info == null) {
			System.out.println("해당하는 데이터가 존재하지 않습니다. \n");
		} else {
			info.showemployee();
			System.out.println("데이터 검색이 완료되었습니다. \n");
		}
	}
	
	public void deleteData() {
		System.out.print("사원이름 : ");
		String ename = MenuViewer.sc.next();
		/*
		int dataIdx = search(ename);
		if(dataIdx < 0) {
			System.out.println("해당하는 데이터가 존재하지 않습니다. \n");
		} else {
			for (int idx = dataIdx; idx < (Cnt -1); idx++) {
				empStorage[idx] = empStorage[idx + 1];
			}
			Cnt--;
			System.out.println("데이터 삭제가 완료되었습니다. \n");
		}
		*/
		
		Iterator<employee> itr = empStorage.iterator();
		while(itr.hasNext()) {
			employee curInfo = itr.next();
			if (ename.compareTo(curInfo.ename)==0) {
				itr.remove();
				System.out.println("데이터 삭제가 완료되었습니다. \n");
				return;
			}
		}
	}
	
	private employee search(String ename) {
		/*
		for (int idx = 0; idx < Cnt; idx++) {
			employee curEmp = empStorage[idx];
			if (ename.compareTo(curEmp.ename)==0) {
				return idx;
			}
		}
		*/
		Iterator<employee> itr = empStorage.iterator();
		while(itr.hasNext()) {
			employee curInfo = itr.next();
			if (ename.compareTo(curInfo.ename)==0) {
				return curInfo;
			}
		}
		return null;
	}
	
	public void storeToFile() {
		try {
			FileOutputStream file = new FileOutputStream(dataFile);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			Iterator<employee> itr = empStorage.iterator();
			while (itr.hasNext()) {
				out.writeObject(itr.next());
			}
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void readFromFile() {
		if(dataFile.exists() == false) {
			return;
		}
		try {
			FileInputStream file = new FileInputStream(dataFile);
			ObjectInputStream in = new ObjectInputStream(file);
			while (true) {
				employee emp = (employee)in.readObject();
				if(emp == null) {
					break;
				}
				empStorage.add(emp);
			}
			in.close();
		} catch (IOException e) {
			return;
		} catch(ClassNotFoundException e) {
			return;
		}
	}
}
class MenuView {
	public static Scanner sc = new Scanner(System.in);
	
	public static void showMenu() {
		System.out.println("선택하세요...");
		System.out.println("1. 데이터 입력");
		System.out.println("2. 데이터 검색");
		System.out.println("3. 데이터 삭제");
		System.out.println("4. 프로그램 종료");
		System.out.print("선택 : ");
	}
}
public class Example1 {
	public static void main(String[] args) throws MenuEmpChoiceException {
		employeeManager emp1 = employeeManager.createManager();
		int user;
		
		while(true) {
			try {
				MenuViewer.showMenu();
				user = MenuViewer.sc.nextInt();
				
				if (user < INIT_MENU1.INPUT || user > INIT_MENU1.EXIT) {
					throw new MenuEmpChoiceException(user);
				}
					
				
				switch (user) {
				case INIT_MENU1.INPUT:
					emp1.inputData();
					break;
				case INIT_MENU1.SEARCH:
					emp1.searchData();
					break;
				case INIT_MENU1.DELETE:
					emp1.deleteData();
					break;
				case INIT_MENU1.EXIT:
					System.out.println("프로그램을 종료합니다...");
					return;
				}
			} catch (MenuEmpChoiceException e) {
				e.showEmpWrongChoice();
				System.out.println("메뉴 선택을 처음부터 다시 진행합니다. \n");
			}
		}
	}
}