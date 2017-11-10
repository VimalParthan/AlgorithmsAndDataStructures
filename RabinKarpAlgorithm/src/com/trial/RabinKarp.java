package com.trial;

public class RabinKarp {
	
	private final static int radix=256;
	
	public void search(String pattern, String text){
		
		int patternLength = pattern.length();
		int textLength = text.length();
		int primeNumber = 101;
		int patternHashValue = 0;
		int textHashValue = 0;
		int radixRaisedToPatternLengthModPrimeNumber=1;
		
		for(int i=0;i<patternLength-1;i++){
			radixRaisedToPatternLengthModPrimeNumber=(radix*radixRaisedToPatternLengthModPrimeNumber)%primeNumber;
		}
		
		
		for(int i=0;i<patternLength;i++){
			patternHashValue=(radix*patternHashValue+pattern.charAt(i))%primeNumber;
			textHashValue = (radix*textHashValue+text.charAt(i))%primeNumber;
			
		}
		
		for(int i=0;i<=textLength-patternLength;i++){
			if(patternHashValue==textHashValue){
				int j;
				for(j=0;j<patternLength;j++){
					if(pattern.charAt(j)!=text.charAt(i+j))
						break;
				}
				
				if(j==patternLength)
					System.out.println("Pattern found at : "+i);
			}
			
			if(i<textLength-patternLength){
				textHashValue = (radix*(textHashValue-text.charAt(i)*radixRaisedToPatternLengthModPrimeNumber)+text.charAt(i+patternLength))%primeNumber;
			}
			
			if(textHashValue<0){
				textHashValue+=primeNumber;
			}
		}
		
	
	}

}
