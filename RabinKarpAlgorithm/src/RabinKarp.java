public class RabinKarp {
	
	 public final static int radix = 256;
	
	public void search(String pat, String txt)
    {
		int primeNumber=101;
        int patternLength = pat.length();
        int textLength = txt.length();
      
        int patternHashValue = 0; // hash value for pattern
        int textHashValue = 0; // hash value for txt
        int radixToPowerPatternLengthModPrime = 1;
     
        // The value of h would be "pow(d, M-1)%q"
        for (int i = 0; i < patternLength-1; i++)
            radixToPowerPatternLengthModPrime = (radixToPowerPatternLengthModPrime*radix)%primeNumber;
     
        // Calculate the hash value of pattern and first
        // window of text
        for (int i = 0; i < patternLength; i++)
        {
            patternHashValue = (radix*patternHashValue + pat.charAt(i))%primeNumber;
            textHashValue = (radix*textHashValue + txt.charAt(i))%primeNumber;
        }
     
        // Slide the pattern over text one by one
        for (int i = 0; i <= textLength - patternLength; i++)
        {
     
            // Check the hash values of current window of text
            // and pattern. If the hash values match then only
            // check for characters on by one
            if ( patternHashValue == textHashValue )
            {
            	int j=0;
                /* Check for characters one by one */
                for (j=0; j < patternLength; j++)
                {
                    if (txt.charAt(i+j) != pat.charAt(j))
                        break;
                }
         
                // if p == t and pat[0...M-1] = txt[i, i+1, ...i+M-1]
                if (j == patternLength)
                    System.out.println("Pattern found at index " + i);
            }
     
            // Calculate hash value for next window of text: Remove
            // leading digit, add trailing digit
            if ( i < textLength-patternLength )
            {
                textHashValue = (radix*(textHashValue - txt.charAt(i)*radixToPowerPatternLengthModPrime) + txt.charAt(i+patternLength))%primeNumber;
     
                // We might get negative value of t, converting it
                // to positive
                if (textHashValue < 0)
                textHashValue = (textHashValue + primeNumber);
            }
        }
    }
     
}
