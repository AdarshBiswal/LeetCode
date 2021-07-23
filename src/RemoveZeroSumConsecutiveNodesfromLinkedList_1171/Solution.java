package RemoveZeroSumConsecutiveNodesfromLinkedList_1171;

import java.util.ArrayList;
import java.util.LinkedList;

class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

public class Solution {

    public static void main(String[] args) {

        ListNode l1=new ListNode(1);
        ListNode l2=new ListNode(2);
        ListNode l3=new ListNode(3);
        ListNode l4=new ListNode(-3);
        ListNode l5=new ListNode(4);

        l1.next=l2;
        l2.next=l3;
        l3.next=l4;
        l4.next=l5;



        ListNode output=removeZeroSumSublists(l1);
        while(output!=null)
        {
            System.out.println(output.val);
            output=output.next;
        }




    }

    public static ListNode removeZeroSumSublists( ListNode list) {

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
                    /*if(j.next!=null)
                    {*/
                        i.next=j.next;
                    /*}
                    else
                    {
                        i.next=null;
                    }*/
                }
            }
        }

        return temp.next;

    }
}
