public class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        String lastWord = s.substring(s.lastIndexOf(" ") + 1);
        System.out.println("lastword : " + lastWord);

        return lastWord.length();
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        String test = "hello  world ";

        System.out.println("length " + s.lengthOfLastWord(test));

        System.out.println("length " + s.lengthOfLastWord("a "));
    }
}