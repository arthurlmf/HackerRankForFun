package miscellaneous;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Braces {
	
	
	public static String longestEvenWord(String sentence) {
	    if(sentence == null || sentence.isEmpty())
	    	return "00";
	    StringTokenizer tokenizer = new StringTokenizer(sentence);
	    TreeMap<Integer, String> map = new TreeMap<Integer, String>();
	    
	    while(tokenizer.hasMoreTokens()) {
	    	String nextToken = tokenizer.nextToken();
	    	
	    	if(nextToken.length() % 2 == 0) { //is odd
	    		if(!map.containsKey(nextToken.length()))
	    			map.put(nextToken.length(), nextToken);
	    	}
	    }
	    
	    
	    
	    if(map.isEmpty())
	    	return "00";
	    else {
	    	return map.get(map.lastKey());
	    }
	}
	
	public static void main(String[] args) {
		System.out.println(longestEvenWord( "It pleasand is a pleasant day today"));
//		System.out.println(longestEvenWord( "(}" ));
//		System.out.println(longestEvenWord( "[(])" ));
//		System.out.println(longestEvenWord( "([{}])" ));
	}

}
