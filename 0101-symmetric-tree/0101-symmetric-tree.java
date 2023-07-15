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
    public boolean isSymmetric(TreeNode root) {
        return root==null || symmetricutil(root.left,root.right);
    }
    
    static boolean symmetricutil(TreeNode left,TreeNode right){
        if(left==null || right==null) return(left==right);
        
        if(left.val!=right.val) return false;
        
        return symmetricutil(left.left,right.right) && symmetricutil(left.right,right.left);
        
    }
}