package stringmanipulation;

public class AlternatingCharacters {
	
	
	 // Complete the alternatingCharacters function below.
    static int alternatingCharacters(String s) {
    	int count = 0;
    	
    	int i =0;
    	while(i < s.length()-1) {
			if(s.charAt(i) == s.charAt(i+1)){
				count++;
			}
			i++;
		}
    	return count;

    }

	public static void main(String[] args) {
		
		String[] strings = {"AAAA",
		"BBBBB",
		"ABABABAB",
		"BABABA",
		"AAABBB"};
		
		for (int i = 0; i < strings.length; i++) {
			System.out.println(alternatingCharacters(strings[i]));
		}
		
	}

}
