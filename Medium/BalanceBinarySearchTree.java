import java.util.*;


public class BalanceBinarySearchTree {
    List<Integer> res = new ArrayList<>();
    public TreeNode balanceBST(TreeNode node) {
        inOrder(node);
        // int middleIndex = res.size() / 2;

        return insert(null, node);

        
        
    }

    public TreeNode insert(TreeNode x, TreeNode y){
        if (res.isEmpty()) {
            return null;
        }
        int[] nums = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            nums[i] = res.get(i);
        }
        return sortedArrayToBST(nums, 0, nums.length - 1);
    }

    private TreeNode sortedArrayToBST(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }
        int mid = left + (right - left) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = sortedArrayToBST(nums, left, mid - 1);
        node.right = sortedArrayToBST(nums, mid + 1, right);
        return node;
    }
    


    private void inOrder(TreeNode node){
        if(node != null){
            inOrder(node.left);
            res.add(node.val);
            inOrder(node.right);
        }
    }
}


// Definition for a binary tree TreeNode.
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