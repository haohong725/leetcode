import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();

        char[] sArray = s.toCharArray();
        for (char c : sArray) {
            if (c == '{' || c == '[' || c == '(') {
                stack.push(c);
            } else if (c == '}' || c == ']' || c == ')') {
                if (stack.size() < 1) {
                    return false;
                }

                char p = stack.pop();
                if ((c == '}' && p != '{')
                        || (c == ']' && p != '[')
                        || (c == ')' && p != '(')) {
                    return false;
                }
            } else {
                return false;
            }
        }

        if (stack.size() > 0) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        String test1 = "]}{";
        String test2 = "{}[{}]";
        String test3 = "[";
        System.out.println(s.isValid(test3));

//        Stack stack = new Stack<Character>();
//
//        System.out.println("------isEmpty");
//        System.out.println(stack.isEmpty());
//        System.out.println("------push");
//        stack.push('a');
//        stack.push('b');
//        stack.push('c');
//
//        System.out.println(stack.pop());
    }
}