package io.github.ihaohong.cci.s003;

import java.util.Arrays;

/**
 * 给定两个字符串，请编写程序，确定其中一个字符串的字符重新排列后，能否编程另一个字符串
 */
public class Solution {
    public static void main(String[] args) {

    }

    public boolean permutation(String s, String t) {
        if (s.length() != t.length()) return false;
        return sortString(s).equals(sortString(t));
    }

    private String sortString(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
