package scaler.day46;

public class Print1toA {

	/*You are given an integer A, print 1 to A using recursion.
			Note :- After printing all the numbers from 1 to A, print a new line.*/

	//using loop
	public static void getSeries(int num){
		for(int i=1;i<=num;i++){
			System.out.print(i+" ");
		}
		System.out.println();
	}

	public static void getSeries1(int number){

		//base case
		if(number ==1){
			System.out.print(number+" ");
			return;
		}
		//main logic
		getSeries1(number-1);
		System.out.print(number+" ");
	}

	public static void main(String[] args) {
		int a = 10;
		getSeries(a);
		System.out.println("using recursion");
		getSeries1(a);
	}
}


