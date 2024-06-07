package scaler.day31;

public class PrintAllSubArrays {
	/* Print all sub Arrays of give Array N.*/

	public static void printSubArrays(int[] a) {

		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length; j++) {
				for (int k = i; k <= j; k++) {
					System.out.print("["+a[k]+"]");
				}
				System.out.print(" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int[] a = {2, 6, 1, 6, 9};
		printSubArrays(a);
	}
}
