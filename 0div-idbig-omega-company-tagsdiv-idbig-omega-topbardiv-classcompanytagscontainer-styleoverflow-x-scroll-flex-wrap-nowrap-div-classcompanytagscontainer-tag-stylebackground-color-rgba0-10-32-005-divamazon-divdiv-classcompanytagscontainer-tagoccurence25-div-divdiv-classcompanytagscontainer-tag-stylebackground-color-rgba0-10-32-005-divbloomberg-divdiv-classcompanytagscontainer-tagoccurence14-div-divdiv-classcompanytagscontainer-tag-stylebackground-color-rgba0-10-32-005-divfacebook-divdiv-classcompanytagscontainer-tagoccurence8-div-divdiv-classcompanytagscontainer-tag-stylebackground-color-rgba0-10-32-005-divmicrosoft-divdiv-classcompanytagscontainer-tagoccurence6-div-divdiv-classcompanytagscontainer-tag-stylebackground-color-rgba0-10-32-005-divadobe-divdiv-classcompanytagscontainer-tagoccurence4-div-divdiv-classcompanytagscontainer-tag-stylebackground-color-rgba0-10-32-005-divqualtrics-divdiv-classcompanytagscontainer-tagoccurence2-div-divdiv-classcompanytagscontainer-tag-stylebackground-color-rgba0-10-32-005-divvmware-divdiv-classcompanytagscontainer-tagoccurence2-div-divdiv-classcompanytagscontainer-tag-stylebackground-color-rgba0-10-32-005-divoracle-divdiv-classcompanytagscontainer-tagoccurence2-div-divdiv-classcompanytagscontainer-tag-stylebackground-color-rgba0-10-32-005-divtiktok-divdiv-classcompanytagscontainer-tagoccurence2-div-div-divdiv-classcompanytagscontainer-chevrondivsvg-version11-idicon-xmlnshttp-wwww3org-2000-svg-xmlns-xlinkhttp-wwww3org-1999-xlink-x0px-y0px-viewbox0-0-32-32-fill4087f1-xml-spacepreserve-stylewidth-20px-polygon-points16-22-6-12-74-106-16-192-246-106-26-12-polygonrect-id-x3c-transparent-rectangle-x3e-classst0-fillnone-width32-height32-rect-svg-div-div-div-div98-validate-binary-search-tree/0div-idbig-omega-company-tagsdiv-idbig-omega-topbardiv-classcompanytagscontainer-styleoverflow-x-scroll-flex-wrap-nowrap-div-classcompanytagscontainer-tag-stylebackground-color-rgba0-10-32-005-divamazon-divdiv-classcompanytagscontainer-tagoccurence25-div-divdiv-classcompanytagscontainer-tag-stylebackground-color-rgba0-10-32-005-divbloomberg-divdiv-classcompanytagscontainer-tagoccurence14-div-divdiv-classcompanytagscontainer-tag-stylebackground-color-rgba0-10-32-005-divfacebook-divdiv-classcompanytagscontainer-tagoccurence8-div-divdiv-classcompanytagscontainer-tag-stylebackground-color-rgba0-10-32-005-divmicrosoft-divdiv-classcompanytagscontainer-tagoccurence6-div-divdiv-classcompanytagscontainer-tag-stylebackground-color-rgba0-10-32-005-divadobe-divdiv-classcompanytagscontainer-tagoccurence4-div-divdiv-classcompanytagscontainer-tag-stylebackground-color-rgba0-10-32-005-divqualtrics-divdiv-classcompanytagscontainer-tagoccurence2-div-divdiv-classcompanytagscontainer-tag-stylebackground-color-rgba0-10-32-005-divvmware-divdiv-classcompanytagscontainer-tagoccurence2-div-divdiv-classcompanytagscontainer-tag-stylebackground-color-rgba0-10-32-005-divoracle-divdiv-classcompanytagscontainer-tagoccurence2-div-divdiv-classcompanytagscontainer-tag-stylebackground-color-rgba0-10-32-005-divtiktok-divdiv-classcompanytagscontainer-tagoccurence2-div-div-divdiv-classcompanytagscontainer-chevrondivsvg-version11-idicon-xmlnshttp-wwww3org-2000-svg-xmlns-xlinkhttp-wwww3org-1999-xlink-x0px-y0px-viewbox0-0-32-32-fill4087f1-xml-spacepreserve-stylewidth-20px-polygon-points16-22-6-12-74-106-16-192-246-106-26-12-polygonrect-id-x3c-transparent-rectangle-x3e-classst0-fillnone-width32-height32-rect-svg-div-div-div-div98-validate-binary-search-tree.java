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
    public boolean isValidBST(TreeNode root) {
        return validBST(root).isbst;
       
    }
    public diapair validBST(TreeNode node){
        if(node==null) return new diapair();
        diapair l = validBST(node.left);
        diapair r = validBST(node.right);
        diapair sdp = new diapair();
        
        sdp.maxSum = Math.max(l.maxSum,(Math.max(r.maxSum,node.val)));
         sdp.minSum = Math.min(l.minSum,(Math.min(r.minSum,node.val)));
        if(l.isbst && r.isbst &&l.maxSum<node.val && r.minSum>node.val) sdp.isbst=true;
        else sdp.isbst = false;
        return sdp;
    }
    
    
    class diapair{
        boolean isbst = true;
        long maxSum = Long.MIN_VALUE;
        long minSum = Long.MAX_VALUE;
    }
   
}