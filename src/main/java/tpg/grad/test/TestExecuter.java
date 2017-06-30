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
		String input;
		input = "qwertyuiop";
		System.out.println("Input Str: " + input);
		
		/* Test Reverse String */
		System.out.println("reverse: " + StringUtil.reverse(input));
		
		/* Test Reshuffle String */
		System.out.println("reshuffle: " + StringUtil.reshuffle(input));
		
		/* Test Median Value */
		int[] intArray = {0,1,5,2,4,3,6};
		System.out.println("\nInput array: " + Arrays.toString(intArray));
		System.out.println("Median Value: " + IntegerArrayUtil.calculateMedianValue(intArray));
	}
}
