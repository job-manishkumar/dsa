package scaler.day31_carryforwardandsubarray.additionalproblems;

public class FindLeader {

	/*Given an integer array A containing N distinct integers, you have to find all the leaders in array A. An element is a leader if it is strictly greater than all the elements to its right side.
	NOTE: The rightmost element is always a leader.*/

	public static void findLeader(int[] a){
		for(int i=0;i<a.length;i++){
			boolean flag = true;
			for(int j=i+1;j<a.length;j++){
				if(a[i]<a[j]){
					flag = false;
					break;
				}
			}
			if(flag) {
				System.out.println(a[i]);
			}

		}
	}


	public static void main(String[] args) {
		int[] a = {16, 17, 4, 3, 5, 2};
		findLeader(a);

	}
}
