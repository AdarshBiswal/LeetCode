## `20.`   Valid Parentheses


### Problem statement


```text
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

    Open brackets must be closed by the same type of brackets.
    Open brackets must be closed in the correct order.

 

Example 1:

    Input: s = "()"
    Output: true

Example 2:

    Input: s = "()[]{}"
    Output: true

Example 3:

    Input: s = "(]"
    Output: false

Example 4:

    Input: s = "([)]"
    Output: false

Example 5:

    Input: s = "{[]}"
    Output: true


```



### Approch 1

##### Using Bruteforce Approch

```text
1. Loop for all char in String
2. When we encounter any open bracket we add to stack
3. When we encounter any close bracket we pop from stack and check if the close bracket is its corresponding open bracket or not. 
4. If not then return false else return true when stack size is empty.            
```

### CODE

```java
class Solution {
    public boolean isValid(String s) {


        Stack<Character> stack =new Stack<>();


        if(s.length()<2)
            return false;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{')
            {
                stack.push(s.charAt(i));
            }
            else
            {

                if(stack.isEmpty())
                    return false;
                char s1=stack.pop();

                if(s1=='(' && s.charAt(i)==')')
                    continue;
                else if(s1=='[' && s.charAt(i)==']')
                    continue;
                else if(s1=='{' && s.charAt(i)=='}')
                    continue;
                else
                    return false;
            }
        }

        if(stack.isEmpty())
            return true;

        return false;

    }
}
```


## Link
[Valid Parentheses](https://leetcode.com/problems/valid-parentheses/


















