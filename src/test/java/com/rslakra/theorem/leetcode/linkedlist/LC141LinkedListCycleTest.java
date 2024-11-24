package com.rslakra.theorem.leetcode.linkedlist;

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
 * @created 1/31/24 3:46 PM
 */
public class LC141LinkedListCycleTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(LC141LinkedListCycleTest.class);

    /**
     * <url>https://leetcode.com/problems/longest-consecutive-sequence</url>
     * <pre>
     * Example 1:
     *  Input: nums = [100,4,200,1,3,2]
     *  Output: 4
     *  Explanation: The longest consecutive elements sequence is [1, 2, 3, 4].
     *  Therefore its length is 4.
     *
     * Example 2:
     *  Input: nums = [0,3,7,2,5,8,4,6,0,1]
     *  Output: 9
     * </pre>
     *
     * @return
     */
    @DataProvider
    private Iterator<Object[]> inputData() {
        List<Object[]> input = new ArrayList<>();
        // [2,7,11,15], k = 9
        input.add(new Object[]{new int[]{2, 7, 11, 15}, 9, new int[]{0, 1}});
        input.add(new Object[]{new int[]{3, 2, 4}, 6, new int[]{1, 2}});
        input.add(new Object[]{new int[]{-1, 0}, -1, new int[]{0, 1}});

        return input.iterator();
    }

    /**
     * Tests the <code>hasCycle()</code> method.
     */
    @Test(dataProvider = "inputData")
    public void testHasCycle(ListNode headNode) {
        LOGGER.debug("testHasCycle({})", headNode);
        LC141LinkedListCycle instance = new LC141LinkedListCycle();
        boolean result = instance.hasCycle(headNode);
        LOGGER.debug("result:{}, expected:{}", result);
        assertEquals(result, instance.hasCycle(headNode));
    }
}
