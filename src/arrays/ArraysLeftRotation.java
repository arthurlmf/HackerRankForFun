package arrays;

public class ArraysLeftRotation {
	
	
	// Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d) {
    	
    	while(d > 0) {
	    	int aux = a[0];
	    	for (int i = 0; i < a.length-1 ; i++) {
				a[i] = a[i+1];
			}
	    	a[a.length-1] = aux;
	    	d--;
    	}

    	return a;
    }

	public static void main(String[] args) {
		
		int[] array = { 1, 2, 3, 4, 5};
		int d = 4;
		
		
		rotLeft(array, d);
		
		

	}

}
