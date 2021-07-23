package GenerateParentheses_22;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Solution1 {

    public static void main(String[] args) {

        System.out.println(generateParenthesis(3));
        System.out.println(globalList.size());
    }

    static List<String> globalList=new ArrayList<String>();
    public static List<String> generateParenthesis(int n) {

        if(n==1)
        {
            generatePermutation("","()");
            return globalList;
           
        }
        else if(n==2)
        {

            generatePermutation("","()()");
            return globalList;
        }

        else if(n==3)
        {
            generatePermutation("","()()()");
            return globalList;
        }
        else if(n==4)
        {
            generatePermutation("","()()()()");
            return globalList;
        }
        else if(n==5)
        {
            generatePermutation("","()()()()()");
            return globalList;
        }
        else if(n==6)
        {
            generatePermutation("","()()()()()()");
            return globalList;
        }
        else if(n==7)
        {
            generatePermutation("","()()()()()()()");
            return globalList;
        }
        else if(n==8)
        {
            generatePermutation("","()()()()()()()()");
            return globalList;
        }



        return globalList;

    }

    private static void generatePermutation(String candidate, String remaining)
    {
        if (remaining.length() == 0) {
            if(isValid(candidate))
            {
                if(globalList.contains(candidate)==false)
                globalList.add(candidate);
            }

        }



        for (int i = 0; i < remaining.length(); i++)
        {
            String newCandidate = candidate + remaining.charAt(i);
            String newRemaining = remaining.substring(0, i) +remaining.substring(i + 1);
            System.out.println(newRemaining);
            generatePermutation(newCandidate, newRemaining);
        }
    }
    public static boolean isValid(String s) {


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