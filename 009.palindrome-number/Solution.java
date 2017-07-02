public class Solution {
    public boolean isPalindrome(int x) {
        String xStr = String.valueOf(x);

        int strLength = xStr.length();

        int leftIndex = 0;
        while (true) {
            int rightIndex = strLength - leftIndex - 1;

            char leftChar = xStr.charAt(leftIndex);
            char rightChar = xStr.charAt(rightIndex);

            if (leftChar != rightChar) {
                return false;
            }

            if ((rightIndex - leftIndex) == 1 || (rightIndex == leftIndex)) {
                return true;
            }

            leftIndex++;
        }
    }

    public static void main(String[] args) {
       int x = 2345432;

       Solution s = new Solution();
       System.out.println(s.isPalindrome(x));
       System.out.println(s.isPalindrome(234232));
        System.out.println(s.isPalindrome(-2332));
    }
}