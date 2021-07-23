package ValidParentheses_20;

import java.util.Stack;

class Solution {

    public static void main(String[] args) {

        Solution s=new Solution();
        System.out.println(s.isValid("){"));

    }

    public boolean isValid(String s) {


        Stack<Character> stack = new Stack<>();


        if (s.length() < 2)
            return false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                stack.push(s.charAt(i));
            }
            else {

                if (stack.isEmpty())
                    return false;
                else {
                    char s1 = stack.pop();

                    if (s1 == '(' && s.charAt(i) == ')')
                        continue;
                    else if (s1 == '[' && s.charAt(i) == ']')
                        continue;
                    else if (s1 == '{' && s.charAt(i) == '}')
                        continue;
                    else
                        return false;
                }
            }
        }

            if (stack.isEmpty())
                return true;

            return false;

        }

}