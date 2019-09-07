// 加一

package io.github.ihaohong.solutions.s066;

import java.util.Arrays;

public class Solution {
    public int[] plusOne(int[] digits) {
        int length = digits.length;
        for (int i = length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i] += 1;
                return digits;
            }

            digits[i] = 0;
        }

        int[] newDigit = new int[length + 1];
        newDigit[0] = 1;

        return newDigit;
    }

    public static void main(String[] args) {
        Solution s = new Solution();


        System.out.println(Arrays.toString(s.plusOne(new int[]{1,2, 3, 4})));
        System.out.println(Arrays.toString(s.plusOne(new int[]{4, 9, 9, 9})));
        System.out.println(Arrays.toString(s.plusOne(new int[]{9, 9, 9, 9})));
    }
}