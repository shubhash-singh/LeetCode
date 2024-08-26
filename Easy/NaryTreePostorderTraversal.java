package Easy;

import java.util.ArrayList;
import java.util.List;

// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    Node() {
        children = new ArrayList<>();
    }

    Node(int _val) {
        val = _val;
        children = new ArrayList<>();
    }

    Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}

public class NaryTreePostorderTraversal {
    public List<Integer> postorder(Node root) {
        // If the root is null, return an empty list
        if (root == null) return new ArrayList<>();

        List<Integer> res = new ArrayList<>();

        // Start DFS from the root
        dfs(root, res);

        // Return the result list containing node values in post-order
        return res;
    }

    private void dfs(Node root, List<Integer> res) {
        // Recursively call dfs for each child of the current node
        for (Node child : root.children) {
            dfs(child, res);
        }
        // Append the value of the current node to the result list
        res.add(root.val);
    }
}
