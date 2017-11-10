
public class App {

	public static void main(String[] args) {
		
		powersOfTwo(50);
	}

	private static int powersOfTwo(int n) {
		if(n<1) {System.out.println(0);return 0;}
		if(n==1) {System.out.println(1);return 1;}
		else{
			int prev=powersOfTwo(n/2);
			int current = prev*2;
			System.out.println(current);
			return current;
		}
		
	}

}
