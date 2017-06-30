package tpg.grad.test;

public class IntegerArrayUtil {
	
	/**
	 * Calculates the median value of the given integer array.
	 * 
	 * @param intArray whose elements are to be averaged
	 * @return the median value of the given integer array.
	 */
	public static double calculateMedianValue(int[] intArray)
	{
		double result = 0;
		
		if (intArray != null &&  intArray.length > 0)
		{
			int total = 0;
			int size = intArray.length;
			
			for (int i = 0; i < size; i++)
			{
				total += intArray[i];
			}
			
			result = (double) total / size;
		}
		else
		{
			System.out.println("Input integer array is invalid.");
		}
		
		return result;
	}
}