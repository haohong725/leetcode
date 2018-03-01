import java.util.HashSet;
import java.util.Set;

/**
 * @author haohong
 */
class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] strCharArr = s.toCharArray();

        int longestStrLen = 0;

        for (int start = 0; start < strCharArr.length; start++) {
            // 依次从每个字符开始，往后算最长的不重复子串

            Set<Character> charSet = new HashSet<Character>();
            for (int charIndex = start; charIndex < strCharArr.length; charIndex++) {
                if (charSet.contains(strCharArr[charIndex])) {
                    // 重复
                    longestStrLen = Math.max(charSet.size(), longestStrLen);
                    break;
                } else {
                    charSet.add(strCharArr[charIndex]);
                }
                longestStrLen = Math.max(charSet.size(), longestStrLen);
            }
        }

        return longestStrLen;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();

        String str = "pwwkew";
        System.out.println(solution.lengthOfLongestSubstring(str));

    }

    private void p(Object o) {
        System.out.println(o);
    }
}