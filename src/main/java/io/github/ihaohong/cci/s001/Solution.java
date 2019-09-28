package io.github.ihaohong.cci.s001;

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
