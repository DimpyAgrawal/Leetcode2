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
class Solution {
    int nummov = 0;
    public int distributeCoins(TreeNode root) {
        distribute(root);
        return nummov;
    }
    public int distribute(TreeNode root){
        if(root==null) return 0;
        int left = distribute(root.left);
        int right = distribute(root.right);
        nummov += Math.abs(left) + Math.abs(right);
        return root.val+left+right-1;
    }
}