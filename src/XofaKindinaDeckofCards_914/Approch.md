## `914.`  X of a Kind in a Deck of Cards


### Problem statement


```text
In a deck of cards, each card has an integer written on it.

Return true if and only if you can choose X >= 2 such that it is possible to split the entire deck into 1 or more groups of cards, where:

    Each group has exactly X cards.
    All the cards in each group have the same integer.

 

Example 1:

Input: deck = [1,2,3,4,4,3,2,1]
Output: true
Explanation: Possible partition [1,1],[2,2],[3,3],[4,4].

Example 2:

Input: deck = [1,1,1,2,2,2,3,3]
Output: false
Explanation: No possible partition.

Example 3:

Input: deck = [1]
Output: false
Explanation: No possible partition.
In a deck of cards, each card has an integer written on it.

Return true if and only if you can choose X >= 2 such that it is possible to split the entire deck into 1 or more groups of cards, where:

    -> Each group has exactly X cards.
    -> All the cards in each group have the same integer.

 

Example 1:

    Input: deck = [1,2,3,4,4,3,2,1]
    Output: true
    Explanation: Possible partition [1,1],[2,2],[3,3],[4,4].

Example 2:

    Input: deck = [1,1,1,2,2,2,3,3]
    Output: false
    Explanation: No possible partition.

Example 3:

    Input: deck = [1]
    Output: false
    Explanation: No possible partition.

```

### Approch 1


### Approch 2

##### Using BackTracking Approch

```text
To split the entire deck into two parts we need gcd because we can also split the card in 3 ways               
```

### CODE

```java
class Solution {
    public boolean hasGroupsSizeX(int[] deck) {

        HashMap<Integer,Integer>hm =new HashMap<Integer,Integer>();


        if(deck.length==1||deck.length==0)
            return false;

        for(int i=0;i<deck.length;i++)
        {
            if(hm.get(deck[i])!=null)
            {
                hm.put(deck[i],hm.get(deck[i])+1);
            }
            else
            {
                hm.put(deck[i],1);
            }

        }

        int check=0;


        for(Integer itr:hm.keySet())
        {
            if(check==0)
            {
                check=hm.get(itr);
                continue;
            }
            else
            {
                if(gcd(check,hm.get(itr))==1)
                {
                    return false;
                }
                else
                {
                    check=hm.get(itr);
                }

            }
        }


        return true;

    }
    public static int gcd(int x,int y)
    {
        int gcd=1;
        for(int i = 1; i <= x && i <= y; i++)
        {
            if(x%i==0 && y%i==0)
                gcd = i;
        }
        return gcd;
    }
}
```


## Link
[X of a Kind in a Deck of Cards](https://leetcode.com/problems/x-of-a-kind-in-a-deck-of-cards/)


















