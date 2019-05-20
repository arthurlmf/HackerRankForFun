package warmUp;

import java.io.IOException;
import java.util.ArrayList;

public class JumpingOnTheClouds {

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {
    	int jumps = 0;
    	String path =  "";
    	
    	int i = 0;
    	while (i < c.length -1) {
    		if(i >= c.length) {
    			path += c.length + " "; 
    			jumps++;
    			break;
    		}
    		
			if((i + 2 < c.length) && c[i+2] == 0){
				i += 2;
				path += i +" "; 
				jumps++;
			} else if(i < c.length ) {
				i++;
				path += i +" ";  
				jumps++;
			}
			
		}
    	System.out.println(path);
    	return jumps;
    }


    public static void main(String[] args) throws IOException {
    	
    				 
    	int[] input = {0, 0, 0, 1, 0, 0};
    	
    	int[] input3 = {0, 0, 1, 0, 0, 1, 0 };
    	
    	int[] input4 = {0, 0, 0, 1, 0, 0 };
    	
    	int[] input5 = {0, 0, 0, 0, 1, 0};
    	
    	ArrayList<int[]> array = new ArrayList<int[]>();
//    	array.add(input);
    	array.add(input3);//4
    	array.add(input4);// 3
    	array.add(input5); //3
    	
    	for (int[] object : array) {
    		int result = jumpingOnClouds(object);
        	System.err.println(result);
		}
        
    	
       
       

        
    }
}
