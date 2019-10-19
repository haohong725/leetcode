package io.github.ihaohong.cci.s005;

import java.util.Arrays;

/**
 * 压缩字符出纳
 */
public class Solution {
    public static void main(String[] args) throws Exception {
        assertEquals("a1", compress("a"));
        assertEquals("a2", compress("aa"));
        assertEquals("a3", compress("aaa"));
        assertEquals("a4", compress("aaaa"));
        assertEquals("a1b1", compress("ab"));
        assertEquals("a2b1", compress("aab"));
        assertEquals("a3b1", compress("aaab"));
        assertEquals("a4b1", compress("aaaab"));
        assertEquals("a3b2", compress("aaabb"));
        assertEquals("a3b3", compress("aaabbb"));
        assertEquals("a3b4", compress("aaabbbb"));
        assertEquals("a3b3c1", compress("aaabbbc"));
        assertEquals("a3b3c2", compress("aaabbbcc"));
        assertEquals("a3b3c3", compress("aaabbbccc"));
        assertEquals("a3b1c3", compress("aaabccc"));
    }

    public static String compress(String s) {
        StringBuilder sb = new StringBuilder();
        char[] chars = s.toCharArray();
        char currentSymbol = chars[0];
        int count = 0;
        String toAppend = "";

        for (int i=0; i<chars.length; i++) {
            if (chars[i] == currentSymbol) { // 与上个字符串相同
                count++;
            } else { // 与上个字符串不同
                toAppend = "" + currentSymbol + count;
                sb.append(toAppend);

                currentSymbol = chars[i];
                count = 1;
            }
        }

        toAppend = "" + currentSymbol + count;
        sb.append(toAppend);
        return sb.toString();
    }

    public static void assertEquals(String s1, String s2) throws Exception {
        System.out.println(s1 + " => " + s2);
        if (!s1.equals(s2)) {
            throw new Exception("error ");
        }
    }
}
