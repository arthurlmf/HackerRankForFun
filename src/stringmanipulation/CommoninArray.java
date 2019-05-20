package stringmanipulation;

public class CommoninArray {
	
	

	public static boolean containsCommonItem(char[] array1, char[] array2){

		int[] occurence1 = new int[26];
		int[] occurence2 = new int[26];

		for(int i = 0; i < array1.length; i++){
		  occurence1[array1[i]-'a']++;                  
		}
		
		for(int i = 0; i < array2.length; i++){
		  occurence2[array2[i]-'a']++;                  
		}
		
		for(int i = 0; i < array1.length; i++){
			if((occurence1[i] != 0) && (occurence2[i] != 0)){
			    return true;
			}                 
		}
		return false;
}







	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] a1 = { 'a','b','c','x'} ;
		char[] a2 = {'z','y','i'} ;
		
		System.out.println(containsCommonItem(a1,a2));

	}

}
