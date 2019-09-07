// 整数反转

package io.github.ihaohong.solutions.s007;

import java.util.Arrays;

public class Solution {
    public int reverse(int x) {
        long longX = (long) x;

        boolean negative = false;
        if (longX < 0) {
            negative = true;
            longX = this.negate(longX);
        }

        long result = 0;
        long t = 0;

        while ((t = longX / 10) > 0) {
            result = result  * 10 + (longX % 10);
            longX = t;
        }

        result = result * 10 + longX;

        if (result > Integer.MAX_VALUE) {
            result = 0;
        }

        result = (negative ? this.negate(result) : result);

        int intResult = (int) result;

        return intResult;
    }


    private long negate(long x) {
        return 0 - x;
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(s.reverse(123));
        System.out.println(s.reverse(1345678913));
        System.out.println(s.reverse(-325));
        System.out.println(s.reverse(1534236469));
        System.out.println(s.reverse(-2147483648));

//        System.out.println(s.negate(-2147483648));

    }
}