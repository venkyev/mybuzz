package ParisElement;

public class FindPairBruteForceMathod {

	static void findPairsWithSumEqualsToXBruteForce(int arr[], int X) {
		if (arr.length < 2)
			return;

		System.out.println("The pair whose sum is equal to " + X + " using brute force method: ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int tempSum = arr[i] + arr[j];

				if (tempSum == X) {
					System.out.println(arr[i] + " " + arr[j]);
				}
			}
		}
	}
	
	  public static void main(String[] args)
	    {
		  findPairsWithSumEqualsToXBruteForce(new int[] {4, 6, 5, -10, 8, 5, 20}, 12);
		  
		  findPairsWithSumEqualsToXBruteForce(new int[] {4, 6, 5, -10, 8, 5, 20}, 10);
		  
		  findPairsWithSumEqualsToXBruteForce(new int[] {5,3,2,4,1,8,7}, 12);
		  
		  findPairsWithSumEqualsToXBruteForce(new int[] {5,3,2,4,1,8,7}, 30);
	    }
}
