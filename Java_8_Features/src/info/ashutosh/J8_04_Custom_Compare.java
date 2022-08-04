package info.ashutosh;

import java.util.Comparator;
import java.util.TreeSet;

public class J8_04_Custom_Compare implements Comparable<J8_04_Custom_Compare> {

	int eid;
	String name;

	public J8_04_Custom_Compare(int id, String name) {
		this.eid = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return eid + ":" + name;
	}

	/* Default behavior of Sorting unless user don't implement customized sorting by implementing Comparator */
	@Override
	public int compareTo(J8_04_Custom_Compare o) {
		int eid1 = this.eid;
		J8_04_Custom_Compare employee = (J8_04_Custom_Compare) o;
		int eid2 = employee.eid;

		if (eid1 < eid2) {
			return 1;
		} else if (eid1 > eid2) {
			return -1;
		} else {
			return 0;
		}

	}// compareTo()

}// class Employee

class compcomp {
	public static void main(String[] args) {
		J8_04_Custom_Compare employee = new J8_04_Custom_Compare(1, "Ashutosh");
		J8_04_Custom_Compare employee2 = new J8_04_Custom_Compare(2, "ccc");
		J8_04_Custom_Compare employee3 = new J8_04_Custom_Compare(3, "bbb");
		J8_04_Custom_Compare employee4 = new J8_04_Custom_Compare(4, "eee");
		J8_04_Custom_Compare employee5 = new J8_04_Custom_Compare(5, "ddd");
		/* by using Implementation class */
		// TreeSet<J8_04_Custom_Compare> treeSet = new TreeSet<J8_04_Custom_Compare>(new MyComparater());

		/* by using Lambda Function class */
		TreeSet<J8_04_Custom_Compare> treeSet = new TreeSet<J8_04_Custom_Compare>((o1, o2) -> ((J8_04_Custom_Compare) o1).name.compareTo(((J8_04_Custom_Compare) o2).name));

		treeSet.add(employee);
		treeSet.add(employee2);
		treeSet.add(employee3);
		treeSet.add(employee4);
		treeSet.add(employee5);

		System.out.println(treeSet);
	}
}

class MyComparater implements Comparator<Object> {

	/* Customized Sorting by name in Ascending Order */
	@Override
	public int compare(Object o1, Object o2) {
		// J8_04_Custom_Compare e1 = (J8_04_Custom_Compare) o1;
		// J8_04_Custom_Compare e2 = (J8_04_Custom_Compare) o2;

		// Method Chaining
		return ((J8_04_Custom_Compare) o1).name.compareTo(((J8_04_Custom_Compare) o2).name);

	}// compare()
}// class MyComparater
