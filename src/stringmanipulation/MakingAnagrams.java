package stringmanipulation;

public class MakingAnagrams {
	// Complete the makeAnagram function below.
    static int makeAnagram(String a, String b) {
    	int[] lettercounts = new int[26];
		for(char c : a.toCharArray()){
			lettercounts[c-'a']++;
		}
		for(char c : b.toCharArray()){
			lettercounts[c-'a']--;
		}
		int result = 0;
		for(int i : lettercounts){
			result += Math.abs(i);
		}
		return result;
    	
    }
      

	public static void main(String[] args) {
		String a = "fcrxzwscanmligyxyvym";
	    String b = "jxwtrhvujlmrpdoqbisbwhmgpmeoke";
//		String a = "cde";
//	    String b = "abc";
	    
	    System.out.println(makeAnagram(a,b));
	}

}
