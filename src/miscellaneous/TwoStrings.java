package miscellaneous;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TwoStrings {
	
	 static String twoStrings(String s1, String s2) {
		 char[] charArray = s1.toCharArray();
		 
		 List list = new ArrayList(Arrays.asList(charArray));
		 
		 Set set = new HashSet();
		 //set.addAll(Arrays.asList();
		 Set set2 = new HashSet(Arrays.asList(s2.toCharArray()));
		 
		 set.retainAll(set2);
		 
		 if(set.isEmpty())
			 return "NO";
		 return "YES"; 
		
     }
	 
	

	public static void main(String[] args) {
		
		String[] inputs = {"hello","hi",};
		String[] inputs2 = {"world","world"};
		
		for (int i = 0; i < inputs.length; i++) {
			System.out.println(twoStrings(inputs[i], inputs2[i]));
		}
		

	}

}
