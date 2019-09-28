package io.github.ihaohong.cci.s001;

/**
 * 实验一个算法，确定一个字符串的所有字符是否全都不同。不允许使用新的数据结构。
 *
 * 注意：1. 需要确定字符范围，ASCII，还是 Unicode
 * 时间复杂度O(n),空间复杂度O(1)
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println("hello");
    }

    public boolean isUniqueChars(String str) {
        if (str.length() > 256) return false;

        boolean[] has_char = new boolean[256];
        for (int i=0; i<str.length(); i++) {
            char c = str.charAt(i);
            if (has_char[c]) return false;

            has_char[c] = true;
        }

        return true;
    }
}
