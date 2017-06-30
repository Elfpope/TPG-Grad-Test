package tpg.grad.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StringUtil {
	
	/**
	 * Outputs the given string in reversed order.
	 * @param inputString to be reversed
	 * @return the reversed string
	 */
	public static String reverse(String inputString)
	{
		String result = "";
		
		if (inputString != null &&  inputString.length() > 0)
		{
			char[] inputCharArray = inputString.toCharArray();
			for(int i = inputCharArray.length - 1; i >= 0; i--)
			{
				result += inputCharArray[i];
			}
		}
		else
		{
			System.out.println("Input string is invalid.");
		}
		
		return result;
	}
	
	/**
	 * Shuffles the given string in random order
	 * @param inputString to be shuffled
	 * @return the shuffled string
	 */
	public static String reshuffle(String inputString)
	{
		String result = "";
		
		if (inputString != null &&  inputString.length() > 0)
		{
			// Transform inputString into a collection of strings
			List<String> inputList = new ArrayList<String>();
			
			char[] inputChars = inputString.toCharArray();
			for (int i = 0; i < inputChars.length; i++)
			{
				inputList.add(String.valueOf(inputChars[i]));
			}
			
			int min = 0;
			Random random = new Random();
			
			while(!inputList.isEmpty())
			{
				int range, index, max;
				max = inputList.size();
				range = max - min;
				index = random.nextInt(range);
				
				result += inputList.remove(index);
			}
		}
		else
		{
			System.out.println("Input string is invalid.");
		}
		
		return result;
	}
}
