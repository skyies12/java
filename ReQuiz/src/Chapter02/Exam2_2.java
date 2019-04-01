package Chapter02;

import java.util.Scanner;

public class Exam2_2 {

	public static void main(String[] args) {
		for(int i=0; i <=10 ; ++i) {
			if( (i %3) != 0 ) {
				continue ; 
			}
		 System.out.printf("i = %d\n", i);
		 }
	}

}
