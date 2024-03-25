package com.practice.findmaxvalueunsortedarray;

public class MaxValueUnsortedArray {
	
	public static int findMaxValueUnsortedArray(int[] array) {
        if (array == null || array.length == 0) {
            return Integer.MIN_VALUE;
        }

        int maxValue = Integer.MIN_VALUE;
        for (int value : array) {
            if (value > maxValue) {
                maxValue = value;
            }
        }
        return maxValue;
    }

	public static void main(String[] args) {
        System.out.println("Maximum Value (Test 1) is " + findMaxValueUnsortedArray(new int[]{ 5, 2, 8, 6, 1, 3, 10, 9 }));
	}
}
