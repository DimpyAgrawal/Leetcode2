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
      int diff = Integer.MIN_VALUE;
    public int maxAncestorDiff(TreeNode root) {
        Ance(root,root.val,root.val);
        return diff;
        
    }
    public void Ance(TreeNode root,int max,int min){
        if(root == null) return;
      

        max = Math.max(max,root.val);
        min = Math.min(min,root.val);
        diff = Math.max(diff,max-min);
        Ance(root.left,max,min);
        Ance(root.right,max,min);
      
        
       
    }
}