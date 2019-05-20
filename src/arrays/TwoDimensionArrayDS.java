package arrays;

public class TwoDimensionArrayDS {
	
	static int hourglassSum(int[][] arr) {
		
		int countMax = Integer.MIN_VALUE;
		
		for (int l = 1; l < arr.length -1; l++) { //lines
			int sum = 0;
			for (int c = 1; c < arr[l].length - 1; c++) { //columns
				int medium = arr[l][c];
				int lineUpSum = arr[l-1][c-1] + arr[l-1][c] + arr[l-1][c+1];
				int lineDownSum = arr[l+1][c-1] + arr[l+1][c] + arr[l+1][c+1];
				
				sum = medium + lineUpSum + lineDownSum;
				if (sum > countMax)
					countMax = sum;
			}
		}
		return countMax;
    }


	public static void main(String[] args) {
		
		int[][] hourglass = { {1, 1, 1, 0, 0, 0}, 
							  {0, 1, 0, 0, 0, 0}, 
							  {1, 1, 1, 0, 0, 0}, 
							  {0, 0, 2, 4, 4, 0}, 
							  {0, 0, 0, 2, 0, 0}, 
							  {0, 0, 1, 2, 4, 0} };
		
		System.err.println(hourglassSum(hourglass));
	}

}
