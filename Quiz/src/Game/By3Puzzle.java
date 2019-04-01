package Game;

import java.util.Random;
import java.util.Scanner;

public class By3Puzzle {
//	public static void shuffleQuestion(String[][] arr) {
//		Random rand = new Random();
//		
//		for (int i = 0; i < 100; i++) {
//			int num = rand.nextInt(4);
//			
//			if (num == 0) {
//				moveL(arr, COMPUTER);
//			} else if (num == 1) {
//				moveR(arr, COMPUTER);
//			} else if (num == 2) {
//				moveU(arr, COMPUTER);
//			} else if (num == 3) {
//				moved(arr, COMPUTER);
//			}
//		}
//	}
	
	public static void moveL(String[][] arr, int type) {
		for (int i = 0; i< arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if((j - 1) >= 0 && arr[i][j-1] == "x") {
					arr[i][j-1] = arr[i][j];
					arr[i][j] = "x";
					break;
				}
			}
		}
//		if (type == USER) {
//			if(!checkAnswer(arr)) {
//				arrPrint(arr);
//			}
//		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[][] arr = {
				{"1","2","3"},
				{"4","5","6"},
				{"7","8","x"}
		};
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
			
		System.out.println();
			
		System.out.println("[ Move ] a : Left s : Right w : Up z : Down");
		System.out.println("[ Exit ] k : Exit");
		System.out.print("이동키를 입력하세요 : ");
		String use = sc.nextLine();
		
		if(use.equalsIgnoreCase("a")) {
			
		}
	}
}

