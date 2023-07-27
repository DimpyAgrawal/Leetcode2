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
    public int sumNumbers(TreeNode root) {
        return helpersumNumbers(root,0);
        
    }
    
    public int helpersumNumbers(TreeNode root, int curr){
        if(root==null) return 0;
        
        curr= curr*10+root.val;
        
        if(root.left==null && root.right==null) return curr;
        
        int leftsum = helpersumNumbers(root.left,curr);
        int rightsum = helpersumNumbers(root.right,curr);
        return leftsum+rightsum;
    }
}