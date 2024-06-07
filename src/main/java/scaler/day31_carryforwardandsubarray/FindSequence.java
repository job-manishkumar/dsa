package scaler.day31_carryforwardandsubarray;

public class FindSequence {

	/*You have given a string A having Uppercase English letters.
	You have to find the number of pairs (i, j) such that A[i] = 'A', A[j] = 'G' and i < j.*/

	public static int countPair(String str) {
		char[] c = str.toCharArray();
		int countPair = 0;
		for (int i = 0; i < c.length; i++) {
			if (c[i] == 'A') {
				for (int j = i + 1; j < c.length; j++) {
					if (c[j] == 'G') {
						countPair++;
					}
				}
			}
		}
		return countPair;
	}

	//carry forward approach
	public static int countStringPair(String str) {
		int countOfA = 0;
		int totalCount = 0;
		char[] c = str.toCharArray();
		for (char i : c) {
			if (i == 'A') {
				countOfA++;
			}
			if (i == 'G' && countOfA != 0) {
				totalCount += countOfA;
			}
		}
		return totalCount;
	}

	public static void main(String[] args) {

		String str = "ABCGAGAG";
		int countPair = countPair(str);
		System.out.println(countPair);

		System.out.println("using carry forward approach");
		int count = countStringPair(str);
		System.out.println(count);
	}
}
