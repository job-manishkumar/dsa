package scaler.day32;

public class SubArrayGivenSumAndLength {

	/*Given an array A of length N. Also given are integers B and C.
			Return 1 if there exists a subArray with length B having sum C and 0 otherwise*/
	public static int getSum(int[] a, int b, int c) {
		int sum = 0;
		for (int i = 0; i < b; i++) {
			sum += a[i];
		}

		for (int i = 1; i < a.length - b + 1; i++) {
			sum = sum - a[i - 1] + a[a.length - b + i];
			if (sum == c) {
				return 1;
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		int[] a = {4, 2, 2, 5, 1};
		int b = 4;
		int c = 6;
		int res = getSum(a,b,c);
		System.out.println(res);
	}
}
