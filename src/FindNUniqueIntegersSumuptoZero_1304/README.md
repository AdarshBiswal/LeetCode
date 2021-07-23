## `1304.`  Find N Unique Integers Sum up to Zero


### Problem statement


```text
Given an integer n, return any array containing n unique integers such that they add up to 0.

Example 1:

    Input: n = 5
    Output: [-7,-1,1,3,4]
    Explanation: These arrays also are accepted [-5,-1,1,2,3] , [-3,-1,2,-2,4].

   
Example 2:

    Input: n = 3
    Output: [-1,0,1]

Example 3:

    Input: n = 1
    Output: [0]

```


### Approch

##### Using Bruteforce Approch

```text
1. To generate unique number we can sse that index are always unique.
2. So we see that suppose index = 3 so we need to add -3 to it to make it 0.
3. So we always generate 2 numbers. So when n is even we can generate in this way but when n is odd we need to manually add 0 to it.
4. Return the array.       
```


### CODE

```java
public int[] sumZero(int n) 
{

    int output[]=new int[n];
    for (int i = 0; i < n-1; i+=2) 
    {
        output[i]=i+1;
        output[i+1]=-(i+1);
    }
    if(n%2!=0)
        output[n-1]=0;
        
    return output;

}
```


## Link
[Find N Unique Integers Sum up to Zero](https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/)















