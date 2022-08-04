package info.ashutosh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class J8_03_Comparator_Compare implements Comparator<Integer> {

	public static void main(String[] args) {

		/* populating Array List */
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(5);
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(6);
		arrayList.add(4);

		/* Print Before Sorting */
		System.out.println(arrayList);

		/* sort method will take list and Comparator. Comparator for customized Sorting. */
		// Collections.sort(arrayList, new J8_03_Comparator_Compare());
		/* Lambda Expression */
		Collections.sort(arrayList, (o1, o2) -> (o1 > o2) ? -1 : (o1 > o2) ? 1 : 0);

		/* Print After Sorting */
		System.out.println(arrayList);
	}

	@Override
	public int compare(Integer o1, Integer o2) {
		/* Shortcut ternary Operator */
		// return (o1 > o2) ? -1 : (o1 > o2) ? 1 : 0;

		if (o1 > o2) {
			return -1;
		} else if (o1 < 02) {
			return 1;
		} else {
			return 0;
		}
	}

}
