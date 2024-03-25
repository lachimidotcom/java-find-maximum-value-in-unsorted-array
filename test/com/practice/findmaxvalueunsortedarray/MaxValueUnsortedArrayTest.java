package com.practice.findmaxvalueunsortedarray;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MaxValueUnsortedArrayTest {

	@Test
    public void testFindMaxValueWithMixedValues() {
        int[] array = { 5, 2, 8, 6, 1, 3, 10, 9 };
        assertEquals(10, MaxValueUnsortedArray.findMaxValueUnsortedArray(array));
    }

    @Test
    public void testFindMaxValueWithNegativeValues() {
        int[] array = { -5, -2, -8, -6, -1, -3, -10, -9 };
        assertEquals(-1, MaxValueUnsortedArray.findMaxValueUnsortedArray(array));
    }

    @Test
    public void testFindMaxValueWithEmptyArray() {
        int[] array = {};
        assertEquals(Integer.MIN_VALUE, MaxValueUnsortedArray.findMaxValueUnsortedArray(array));
    }

    @Test
    public void testFindMaxValueWithNullArray() {
        int[] array = null;
        assertEquals(Integer.MIN_VALUE, MaxValueUnsortedArray.findMaxValueUnsortedArray(array));
    }

}
