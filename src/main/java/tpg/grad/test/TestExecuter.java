package tpg.grad.test;

import java.util.Arrays;

/**
 * Program Driver
 * 
 * @author junfeng
 *
 */
public class TestExecuter {
	
	public static void main(String[] args)
	{
		String input, output;
		input = "qwertyuiop";
		System.out.println("Input Str: " + input);
		
		/* Test Reverse String */
		output = StringUtil.reverse(input);
		System.out.println("reverse: " + output);
		
		/* Test Reshuffle String */
		output = StringUtil.reshuffle(input);
		System.out.println("reshuffle: " + output);
		
		/* Test Median Value */
		int[] intArray = {0,1,5,2,4,3,6};
		System.out.println("Input array: " + Arrays.toString(intArray));
		
		int medianValue = IntegerArrayUtil.calculateMedianValue(intArray);
		System.out.println("Median Value: " + medianValue);
	}
}
