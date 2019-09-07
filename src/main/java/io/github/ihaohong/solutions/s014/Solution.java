// 最长公共前缀

package io.github.ihaohong.solutions.s014;

import java.util.Arrays;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length < 1) {
            return "";
        }

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            prefix = this.commonPrefix(prefix, strs[i]);
        }

        return prefix;
    }

    private String commonPrefix(String a, String b) {
        if (a == null || b == null) {
            return "";
        }

        int minLength = Math.min(a.length(), b.length());

        String prefix = "";
        for (int i = 0; i <= minLength; i++) {
            if (! b.startsWith(a.substring(0, i))) {
                break;
            }

            prefix = a.substring(0, i);
        }

        return prefix;
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        String[] sArr = new String[0];
//        sArr[0] = "Cheese";
//        sArr[1] = "Cheese2";
//        sArr[2] = "Chees2";
//        sArr[3] = "Chees3";
//        sArr[4] = "Cheex";

        String result = s.longestCommonPrefix(sArr);

        System.out.println(result);

//        System.out.println(s.commonPrefix("abcdefg", "abcde"));

//        System.out.println("abcdefg".substring(0, 2));
    }
}