package CountGoodNodesinBinaryTree_1448;

import com.sun.source.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    static int goodNodeCount1=0;
    public static void main(String[] args) {

        TreeNode t1=new TreeNode();
        TreeNode t2=new TreeNode();
        TreeNode t3=new TreeNode();
        TreeNode t4=new TreeNode();
        TreeNode t5=new TreeNode();
        TreeNode t6=new TreeNode();
        t1.val=3;
        t2.val=1;
        t3.val=3;
        t4.val=4;
        t5.val=1;
        t6.val=5;

        t1.left=t2;
        t1.right=t4;
        t2.left=t3;
        t2.right=null;
        t3.right=null;
        t3.left=null;
        t4.left=t5;
        t4.right=t6;
        t5.left=t5.left=null;
        t6.left=t6.right=null;

        TreeNode root=t1;
        int high= Integer.MIN_VALUE;

        printTreeNode(root,high);
        System.out.println(goodNodeCount1);
        goodNodeCount1=0;


    }


    public static void  printTreeNode(TreeNode root,int high)
    {

        if(high<=root.val)
        {
            high=root.val;
            goodNodeCount1++;
        }


        if(root.left!=null)
        {
            printTreeNode(root.left,high);
        }

        if(root.right!=null)
        {
            printTreeNode(root.right,high);
        }


    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
