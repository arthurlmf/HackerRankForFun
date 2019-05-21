package arrays;

import java.util.ArrayList;

/**
 * A java class to flatten an array of arbitrarily nested arrays of integers
 * into a flat array of integers. e.g. [[1,2,[3]],4] -> [1,2,3,4].
 * 
 * @author arthurlmf
 *
 */
public class Flatten {

	/*
	 * Method which flatten the array recursively
	 */
	public static void flatten(Object[] array, ArrayList res) {
		for (Object each : array) {
			if (each instanceof Object[]) { // tests if its a array
				flatten((Object[]) each, res); // call the function recursively passing the nested array and the result
												// to store the results
			} else
				res.add(each); // stores in result by adding the value of array position
		}
	}

	public static void main(String[] args) {

		// Creating nestedArrays
		Object[] nestedArray2 = { 5, 6 };
		Object[] nestedArray3 = { 4, nestedArray2 };
		Object[] nestedArray4 = { 2, 3, nestedArray3 };
		Object[] input = { 1, nestedArray4 }; // input is [1, [2, 3, [4, [5, 6]]]]
		System.out.println("input is [1, [2, 3, [4, [5, 6]]]]");

		// The results is gonna be store in results
		ArrayList<Object> result = new ArrayList<Object>();

		// call the method flatten
		flatten(input, result);

		// printing results
		System.out.print("output is  ");
		System.out.println(result);

	}
}