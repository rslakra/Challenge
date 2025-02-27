package com.rslakra.theorem.leetcode.array;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Rohtash Lakra
 * @created 1/22/24 5:05 PM
 */
public class LC153FindMinimumInRotatedSortedArrayTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(LC154FindMinimumInRotatedSortedArray2Test.class);

    /**
     * @return
     */
    @DataProvider
    private Iterator<Object[]> inputData() {
        List<Object[]> input = new ArrayList<>();
        // [2,7,11,15], k = 9
        input.add(new Object[]{new int[]{1, 3, 5}, 1});
        input.add(new Object[]{new int[]{15, 2, 7, 11}, 2});
        input.add(new Object[]{new int[]{2, 0, 1}, 0});
        input.add(new Object[]{new int[]{10, 1}, 1});
        input.add(new Object[]{new int[]{3, 1}, 1});

        return input.iterator();
    }

    /**
     * Tests the <code>findMin()</code> method.
     *
     * @param inputData
     * @param expected
     */
    @Test(dataProvider = "inputData")
    public void testFindMin(int[] inputData, int expected) {
        LOGGER.debug("testFindMin({}, {})", inputData, expected);
        LC153FindMinimumInRotatedSortedArray instance = new LC153FindMinimumInRotatedSortedArray();
        int result = instance.findMin(inputData);
        LOGGER.debug("result:{}, expected:{}", result, expected);
        assertEquals(expected, result);
    }
}
