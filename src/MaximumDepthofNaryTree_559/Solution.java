package MaximumDepthofNaryTree_559;

import java.util.List;

public class Solution {

    public static void main(String[] args) {

        Node root =new Node();



    }
    public int maxDepth(Node root) {

        if (root == null)
            return 0;
        int output = 0;
        for (Node node : root.children) {
            output = Math.max(output, maxDepth(node));
        }

        return output+1;

    }


}

class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
