## `1171.` Remove Zero Sum Consecutive Nodes from Linked List


### Problem statement


```text
Given the head of a linked list, we repeatedly delete consecutive
sequences of nodes that sum to 0 until there are no such sequences.
After doing so, return the head of the final linked list.  You may return any such answer. 

(Note that in the examples below, all sequences are serializations of ListNode objects.)

Example 1:
    Input: head = [1,2,-3,3,1]
    Output: [3,1]
    Note: The answer [1,2,1] would also be accepted.

Example 2:
    Input: head = [1,2,3,-3,4]
    Output: [1,2,4]
Example 3:
    Input: head = [1,2,3,-3,-2]
    Output: [1]
   
```

### CODE




### Approch

Using Bruteforce Approch:-

```text
1. We take a TEMP node and asign the first element as 0
2. We then assign TEMP.next=head.
   Because if we have a Linked list with 4 5 -5 so we need to be
   4 to delete 5 & -5. So we start out i from temp which was 0.
3. we start our i from from temp
4     we assign sum=0 for every i
5     we put our J as i+1 to rest of the list
          if anytime we see that sum=0 then
               we assign i.next to j.next and we ignore the middle.
6.     return temp.next
```

### CODE

```java
public static ListNode removeZeroSumSublists( ListNode list) 
{

    ListNode temp=new ListNode();
    temp.next=list;

    for(ListNode i=temp;i!=null;i=i.next)
    {
        int sum=0;
        for(ListNode j=i.next;j!=null;j=j.next)
        {
            sum+=j.val;
            if(sum==0)
            {
                i.next=j.next;
                   
            }
         }
            
     }

        return temp.next;

}
```


## Link
[Remove Zero Sum Consecutive Nodes from Linked List](https://choosealicense.com/licenses/mit/)