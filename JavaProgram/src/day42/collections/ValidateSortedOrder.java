package day42.collections;

import java.util.ArrayList;
import java.util.List;

public class ValidateSortedOrder {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);

		boolean isSorted = true;
		for (int i = 0; i < list.size() - 1; i++) {
			if (list.get(i) > list.get(i + 1)) {
				isSorted = false;
				break;
			}
		}
		if (isSorted) {
			System.out.println("The list is sorted.");
		} else {
			System.out.println("The list is not sorted.");
		}
	}
}
