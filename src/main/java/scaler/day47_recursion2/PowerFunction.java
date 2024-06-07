package scaler.day47_recursion2;

public class PowerFunction {

	/*Implement pow(A, B) % C.
	In other words, given A, B and C, Find (AB % C).
	Note: The remainders on division cannot be negative. In other words, make sure the answer you return is
	non-negative.*/


	//using loop
	public static int getPower(int a, int b) {
		int pow = 1;
		for (int i = 1; i <= b; i++) {
			pow = pow * a;
		}
		return pow;
	}

	public static int getResult(int pow, int c) {
		return pow % c;
	}

	//using recursion
	public static int getPower1(int a, int b) {

		//base case
		if (b == 0) {
			return 1;
		}
		//main logic
		return a * getPower(a, b - 1);
	}

	//improve recursion 1

	public static int getPower2(int a, int b){

		//base condition
		if(b==0){
			return  1;
		}
		//main logic
		if(b %2==0){
			return getPower2(a,b/2)*getPower2(a,b/2);
		}
		return getPower2(a,b/2)*getPower2(a,b/2)*a;

	}
	//improvement 2

	public static int  getPower3(int a, int b){

		//base condition
		if(b==0){
			return 1;
		}
		int pow = getPower(a,b/2);
		if(b%2==0){
			return  pow*pow;
		}
		return  pow*pow*a;

	}

	public static void main(String[] args) {

		int a = 2;
		int b = 3;
		int c = 3;

		System.out.println("using loop");
		int res = getResult(getPower(a, b), c);
		System.out.println(res);

		System.out.println("using recursion");
		int res1 = getResult(getPower1(a, b), c);
		System.out.println(res1);

		System.out.println("using recursion but another improvement 1");
		int res2 = getResult(getPower2(a,b),c);
		System.out.println(res2);

		System.out.println("using recursion but another improvement 2");
		int res3 = getResult(getPower3(a,b),c);
		System.out.println(res3);

	}
}
