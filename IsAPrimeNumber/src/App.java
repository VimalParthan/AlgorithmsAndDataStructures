
public class App {
	public static void main(String[] args) {
		
		System.out.println(isPrime(23));
		
	}
	
	private static boolean isPrime(int n){
		for(int i=2;i*i<=n;i++){
			if(n%i==0){
				return false;
			}
		}
		return true;
	}
}
