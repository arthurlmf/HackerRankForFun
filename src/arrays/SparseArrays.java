package arrays;

public class SparseArrays {
	
	
	// Complete the matchingStrings function below.
    static int[] matchingStrings(String[] strings, String[] queries) {
    	
    	int[] result = new int[queries.length];
		
    	for (int s = 0; s < strings.length; s++) {
    		for (int q = 0; q < queries.length; q++) {
    			if(strings[s].equals(queries[q])) {		
    				result[q] += 1; 
    			}
    			
			}
		}
    	return result;
    }

	public static void main(String[] args) {
		String[] str1 = { "aba", "baba", "aba", "xzxb"};
		String[] qrs1 = { "aba", "xzxb", "ab"};
		
		String[] str2 = { "def", "de", "fgh"} ;
		String[] qrs2 = { "de","lmn", "fgh"};
		
		String[] str3 = { "abcde","sdaklfj","asdjf","na","basdn","sdaklfj","asdjf","na","asdjf",
								"na","basdn","sdaklfj",	"asdjf"};
		String[] qrs3 = { "abcde", "sdaklfj",	"asdjf", "na","basdn"};
		
		
		
		System.out.println(matchingStrings(str1, qrs1));
		System.out.println(matchingStrings(str2, qrs2));
		System.out.println(matchingStrings(str3, qrs3));

	}

}
