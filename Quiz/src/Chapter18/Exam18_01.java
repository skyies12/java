package Chapter18;

import java.util.ArrayList;
import java.util.List;

public class Exam18_01 {

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();

		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		
		list2.add(3);
		list2.add(4);
		list2.add(5);
		list2.add(6);
		
		System.out.println("list1 = " + list1);
		System.out.println("list2 = " + list2);
		
		// 교집합, 차집합, 합집합을 구하시오.
		// 교집합
		List<Integer> kyo = new ArrayList<>();
		
//		kyo.addAll(list1);
//		kyo.retainAll(list2);
		
		kyo.addAll(list1);
		kyo.retainAll(list2);
		System.out.println("kyo = " + kyo);

		// 차집합
		List<Integer> cha = new ArrayList<>();
		
		cha.addAll(list1);
		cha.removeAll(list2);
		System.out.println("cha = " + cha);
		
		// 합집합
		List<Integer> hap = new ArrayList<>();
		
		hap.addAll(list1);
		hap.removeAll(kyo);
		hap.addAll(list2);
		
		System.out.println("hap = " + hap);
		//
	}

}
