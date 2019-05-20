package warmUp;

import java.io.IOException;

public class CountingValleys {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
    	
    	char[] charArray = s.toCharArray();
    	int valley = 0, level = 0;
    	boolean goingDown = false;
    	
    	for (int i = 0; i < n; i++) {
			char c = charArray[i];
			if(c == 'U') {			
				if(level < 0)
					goingDown = false;
				level++;
			}else {
				if(level > 0)
					goingDown = true;
				level--;
				while((i+1 > n) && charArray[i] == charArray[i + 1] ) {
					i++;						
					level--;
				}
			}
			if(level == 0 && !goingDown)
				valley++;
		}

    	return valley;

    }

       

    public static void main(String[] args) throws IOException {

        
        String input[] = { "UDDDUDUU", "DDUUDDUDUUUD", "UDUUUDUDDD"} ;
        
        for (String string : input) {
        	int result = countingValleys(string.length(), string); 
        	System.out.println(result);
		}
        
        
        
        //Output 1 and 2 and 0       
        

    }
}
