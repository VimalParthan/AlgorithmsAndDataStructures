public class App {

	public static void main(String[] args) {
		
		
		System.out.println(allUniqueChars("Vimal=="));
		

	}

	public static boolean allUniqueChars(String stringToCheck){
		
		if(stringToCheck.length()>256) return false;
		
		int[] chars = new int [256];
		
		for(char c: stringToCheck.toCharArray()){
			if(chars[(int)c]==0){
				chars[(int) c]++;
			}else{
				return false;
			}
			
		}
		
		return true;
	}
}
