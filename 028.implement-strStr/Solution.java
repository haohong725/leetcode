public class Solution {
    public int strStr(String haystack, String needle) {
        for (int i = 0; i <= haystack.length(); i++) {
            if (haystack.substring(i).startsWith(needle)) return i;
        }

        return -1;
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        String haystack = "Hello world xx";
        String needle = "worldx";

        System.out.println(s.strStr(haystack, needle));
        System.out.println(s.strStr("", ""));

    }
}