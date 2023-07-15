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
    public boolean isBalanced(TreeNode root) {
        return dfsheight(root)!=-1;
        
    }
    static int dfsheight(TreeNode root){
        if(root== null) return 0;
        
        int lefthei= dfsheight(root.left);
        if(lefthei==-1) return -1;
        
        int righthei = dfsheight(root.right);
        if(righthei==-1) return -1;
        
        if(Math.abs(lefthei-righthei)>1) return -1;
        
        return Math.max(lefthei,righthei)+1;
    }
}