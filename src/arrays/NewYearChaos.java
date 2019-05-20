package arrays;

import java.util.ArrayList;

public class NewYearChaos {
		
	// Complete the minimumBribes function below.
    static void minimumBribes(int[] q) {
        
        int count = 0 ;
    
        //always keep track of min three vlaues observed
        //Compare currently seeing value with this three values.
        int midOfThree = Integer.MAX_VALUE;
        int maxOfThree =  Integer.MAX_VALUE;
        int minOfThree =  Integer.MAX_VALUE ;
        
        //iterating from left to right
        for(int i=q.length-1 ; i >= 0 ; i--){
            //person has no way to move more than two positions -> wrong
            int currentValue = q[i];
			if((currentValue-i) > 3 ) {
                System.out.println("Too chaotic");
                return;
            }
            else{
                //means current value has passed at least 3 values -> wrong
                if(currentValue > maxOfThree){
                     System.out.println("Too chaotic");
                     return;
                }
                else if(currentValue > midOfThree){ //means -> current value has bribed 2 ppl
                    count=count+2;
                }
                else if(currentValue > minOfThree){ //means-> current value has bribed 1 person.
                    count=count+1;
                }
                
                //Now adjust minThree values comparing, taking the current vlaue to account
                if(currentValue<minOfThree){
                    maxOfThree=midOfThree;
                    midOfThree=minOfThree;
                    minOfThree = currentValue;
                }
                else if(currentValue<midOfThree){
                    maxOfThree=midOfThree;
                    midOfThree = currentValue;
                }
                else if(currentValue<maxOfThree){
                    maxOfThree = currentValue;
                }
            }
        }
        System.out.println(count);
    }
	
	
	
	public static void main(String[] args) {
		
		int [] numPeopleQueue = {5, 5, 8, 8, 8} ;
		
		int [] q1 = {2, 1, 5, 3, 4};
		int [] q2 =  {2, 5, 1, 3, 4};
		int [] q3 =  {5, 1, 2, 3, 7, 8, 6, 4};
		int [] q4 =  {1, 2, 5, 3, 7, 8, 6, 4}; //1 2 3 5 7 8 6 4
		int [] q5 =  {1, 2, 5, 3, 4, 7, 8, 6};
		
		ArrayList<int[]> list = new ArrayList();
		list.add(q1);
		list.add(q2);
		list.add(q3);
		list.add(q4);
		list.add(q5);
		
		for (int i = 0; i < numPeopleQueue.length; i++) {
			int j = numPeopleQueue[i];
			minimumBribes(list.get(i));
		}
	}

}
