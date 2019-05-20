package warmUp;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SockMerchant {

    // Complete the sockMerchant function below
    private static ArrayList arrayList;

	static int sockMerchant(int n, int[] ar) {
		int result= 0;
		Integer[] array = Arrays.stream(ar).boxed().toArray( Integer[]::new );
    	
		
    	Arrays.sort(array);
    	
    	for(int i = 0; i < array.length; i++) {    		
    		Integer[] copyOfRange = Arrays.copyOfRange(array, i+1, array.length);
    		List<Integer> asList = Arrays.asList(copyOfRange);
			int j = array[i];
			if(asList.contains(j)){
    			result++;
    			i++;
    		}
		}        
		return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       

     
//        int n= 9;
//		int[] ar = { 10, 20, 20, 10, 10, 30, 50, 10, 20} ;
		
		int n = 15;
		int[] ar = { 6, 5, 2, 3, 5, 2, 2, 1, 1, 5, 1, 3, 3, 3, 5};
		
		int result = sockMerchant(n, ar);
		
		System.out.println(result);

        
    }
}
