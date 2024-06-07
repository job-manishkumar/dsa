package practices.array;

import java.util.ArrayList;
import java.util.List;

public class PeakElement {

	/*Find a peak element which is not smaller than its neighbours*/

	public static List<Integer> getPeakElements(int[] a) {

		List<Integer> list = new ArrayList<>();
		if (a.length == 0) {
			throw new IllegalArgumentException("Array size should not be zero");
		}
		if (a.length == 1) {
			list.add(a[0]);
			return list;
		} else {
			for (int i = 1; i < a.length - 1; i++) {
				if (a[i] > a[i - 1] && a[i] > a[i + 1]) {
					list.add(a[i]);
				}
			}
		}
		return list;
	}

	public static void main(String[] args) {
//		int[] a = {5, 10, 20, 15};
		int[] a = {10, 20, 15, 2, 23, 90, 67};
		List<Integer> peak = getPeakElements(a);
		System.out.println("peak element = " + peak);
	}
}
