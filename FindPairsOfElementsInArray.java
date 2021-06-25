package ParisElement;

public class FindPairsOfElementsInArray {
	
	static void findThePairs(int inputArray[], int inputNumber)
    {
        System.out.println("Pairs of elements whose sum is "+inputNumber+" are : ");
 
        for (int i = 0; i < inputArray.length; i++)
        {
            for (int j = i+1; j < inputArray.length; j++)
            {
                if(inputArray[i]+inputArray[j] == inputNumber)
                {
                    System.out.println(inputArray[i]+" + "+inputArray[j]+" = "+inputNumber);
                }
            }
        }
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findThePairs(new int[] {4, 6, 5, -10, 8, 5, 20}, 10);
		findThePairs(new int[] {5,3,2,4,1,8,7}, 12);
	}

}
