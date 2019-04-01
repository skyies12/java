package Chapter13;

import java.util.Scanner;

public class Exam13_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		for (int i = 0;i < 5; i++) {
//			System.out.print("단어를 입력하시오. : ");
//			String st1 = sc.nextLine();	
//			String[] st= new String[st1.length()];
//			
//			int ch1 = 0;
//			int ch2 = st.length-1;
//			
//			char fi = st1.charAt(ch1);
//			char la = st1.charAt(ch2);
//			if (fi == la) {
//				System.out.println("회문입니다.");
//			} else {
//				System.out.println("회문이 아닙니다.");
//			}
//		}	
		
		System.out.println("단어를 입력해주세요.");
		String word = sc.next();
		
		String[] array_word = new String[word.length()];
		
		for(int i = 0; i < array_word.length; i++) {
			array_word[i] = word.substring(i, i+1);
		}
		
		int nMax1 = array_word.length;
		int nMax2 = array_word.length/2;
		
		for(int i = 0; i < nMax2; i++) {
			if(!array_word[i].equals(array_word[nMax1-1-i])) {
				System.out.println("회문이 아닙니다.");
				System.out.println(array_word[i] + " != " + array_word[nMax1-1-i]);
				return;
			}
		}
		System.out.println("회문입니다.");
		sc.close();
	}
}