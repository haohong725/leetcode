package io.github.ihaohong.solutions;

import io.github.ihaohong.solutions.s121.Solution;
import junit.framework.TestCase;

public class SolutionsTest extends TestCase {
    public void tests121() {
        int[] prices1 = new int[]{7, 1, 5, 3, 6, 4};
        assertEquals(5, new Solution().maxProfit(prices1));

        int[] prices2 = new int[]{10,2,9,1,2,1,3,1};
        assertEquals(7, new Solution().maxProfit(prices2));

        int[] prices3 = new int[]{7, 6, 5, 4, 3};
        assertEquals(0, new Solution().maxProfit(prices3));
    }
}
