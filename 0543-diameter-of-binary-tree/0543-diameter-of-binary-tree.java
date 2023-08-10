/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public class Solution {
    static int ans=0;
    public int diameterOfBinaryTree(TreeNode root) {
       //int[] diameter = new int[1];
        ans=0;
        height(root);
        return ans;        
    }

    private int height(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int lh = height(node.left);
        int rh = height(node.right);
        ans = Math.max(ans,lh + rh);
        return 1 + Math.max(lh, rh);
    }
}