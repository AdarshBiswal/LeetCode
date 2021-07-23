## `22.`  Generate Parentheses


### Problem statement


```text
Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

Example 1:
    Input: n = 3
    Output: ["((()))","(()())","(())()","()(())","()()()"]

Example 2:
    Input: n = 1
    Output: ["()"]
   
```

### Approch 1

##### Using Bruteforce Approch

```text
1. Put the first String in output list
    Ex: if n=1 put () in output list
        if n=2 put ()() in output list 
2. Find the Permutation of all Parenthesis.
3. Check for valid Parenthesis. 
4. Return the output list.                         
```

### Approch 2

##### Using BackTracking Approch

```text
1. We create an empty output list.
2. CurrentString=""; Open=0; close=0; n=input;
3. We call the generateParenthesisPermutation(output,CurrentString,open,close,n);
4. private static void generateParenthesisBackTrack(List<String> output, String currentString, int open, int close, int n) {



        if(n*2==currentString.length())
        {


            output.add(currentString);
            return;
        }

        if(open < n)
            generateParenthesisBackTrack(output,currentString+"(",open+1,close,n);

        if(close < open)
            generateParenthesisBackTrack(output,currentString+")",open,close+1,n);

    }

5. We see that if suppose n=3 then total close bracket + open backet should be n*2; As n is pair (); Add currentString to output list.
6. if (open < n) call generateParenthesisBackTrack
    then we pass the same output list
    then we pass currentString=currentString+"(" , open +1, close,n
7. if(close<open)
    then we add a ")" to currentString and close++;                   
```

### CODE

```java
private static void generateParenthesisBackTrack(List<String> output, String currentString, int open, int close, int n) 
{
    
    if(n*2==currentString.length())
    {
        output.add(currentString);
        return;
    }
    if(open < n)
        generateParenthesisBackTrack(output,currentString+"(",open+1,close,n);
    if(close < open)
        generateParenthesisBackTrack(output,currentString+")",open,close+1,n);

}
```


## Link
[Generate Parentheses](https://leetcode.com/problems/generate-parentheses/)


















