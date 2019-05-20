package warmUp;

import java.io.IOException;

public class RepeatedString {

    // Complete the repeatedString function below.     
    static long repeatedString(String s, long n) {
        int strLength = s.length();
        long countAs = 0;
        long factor = n / strLength;
        long remainder = n % strLength;
        for (int i=0; i < strLength; i++) {
            if (s.charAt(i) == 'a') {
                countAs += (i < remainder) ? factor + 1 : factor;
            }
        }
        return countAs;
}


	


    public static void main(String[] args) throws IOException {
    	String[] stgs = {"epsxyyflvrrrxzvnoenvpegvuonodjoxfwdmcvwctmekpsnamchznsoxaklzjgrqruyzavshfbmuhdwwmpbkwcuomqhiyvuztwvq", "kmretasscityylpdhuwjirnqimlkcgxubxmsxpypgzxtenweirknjtasxtvxemtwxuarabssvqdnktqadhyktagjxoanknhgilnm", "aba", "a", "aab"};
	
    	
    	long[] longs = {549382313570l, 736778906400l, 10l, 1000000000000l, 882787l};
    	
    	for (int i = 0; i < stgs.length; i++) {
    		long result = repeatedString(stgs[i], longs[i]);
        	System.err.println(result);
		}
    	
    }
}
