package ParisElement;

import java.util.HashMap;
import java.util.Map;

public class FindParisElement {

	public static void main(String[] args) {

		int[] a = { 5, 3, 2, 4, 1, 8, 7 };
		printSumPairs(a, 12);

	}

	public static void printSumPairs(int []input, int k){
		    Map<Integer, Integer> pairs = new HashMap<Integer, Integer>();

		    for(int i=0;i<input.length;i++){

		        if(pairs.containsKey(input[i]))
		            System.out.println(input[i] +", "+ pairs.get(input[i]));
		        else
		            pairs.put(k-input[i], input[i]);
		    }

	}
	

}
