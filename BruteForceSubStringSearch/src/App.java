
public class App {

	public static void main(String[] args) {
		System.out.println(search("this is just a text","text"));

	}
	 
	public static int search(String text,String pattern){
		
		int lengthOfText = text.length();
		int lengthOfPattern = pattern.length();
		
		
		for(int i=0;i<=lengthOfText-lengthOfPattern;i++){
			int j;
			
			for(j=0;j<lengthOfPattern;j++){
				if(text.charAt(i+j)!=pattern.charAt(j)){
					break;
				}
			}
			if(j==lengthOfPattern) return i;
		}
		return lengthOfText;
	}

}
