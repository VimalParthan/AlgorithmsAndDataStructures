
public class App{

	public static void main(String[] args) {
		
		System.out.println(OneStringIsPermutationOfAnotherString("Vimal","lamiV"));

	}
	private static boolean OneStringIsPermutationOfAnotherString(String stringOne,String stringTwo){
		
		if(stringOne.length()!=stringTwo.length())
			return false;
		
		int [] chars = new int[256];
		
		for(char c:stringOne.toCharArray()){
			int charArrayIndex = (int)c;
			
			chars[charArrayIndex]++;
		}
		
		
		for(char c:stringTwo.toCharArray()){
			int charArrayIndex = (int)c;
			if(chars[charArrayIndex]==0)
				return false;
			else
				chars[charArrayIndex]--;
		
		}
		
		return true;
		
	} 
}
