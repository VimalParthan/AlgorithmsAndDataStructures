
public class App {

	public static void main(String[] args) {
		
		fibonacciNumber(7);

	}

	private static void fibonacciNumber(int n) {
		int [] memo = new int[n+1];
		
		for(int i=0;i<=n;i++){
			System.out.println(i+"-"+fibonacciNumber(i,memo));
		}
		
	}

	private static int fibonacciNumber(int n,int[] memo) {
		
		if(n<=0) return 0;
		else if(n==1) return 1;
		else if(memo[n]>0) return memo[n];
		
		memo[n] = fibonacciNumber(n-1, memo)+fibonacciNumber(n-2, memo);
		return memo[n];
		
	}

}
