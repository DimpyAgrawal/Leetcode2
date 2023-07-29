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
class NodeValue{
    public int maxValue,minValue,maxsum;
    NodeValue(int max,int min,int maxsum){
         this.maxValue = max;
         this.minValue = min;
         this.maxsum = maxsum ;
        
    }
}
class Solution{
    int max=0;
    public int maxSumBST(TreeNode root) {
        maxSumHelper(root);
        return max;
    }

public NodeValue maxSumHelper(TreeNode root){
   if(root == null){
            return new NodeValue(Integer.MIN_VALUE,Integer.MAX_VALUE,0);
        }
    
    NodeValue left = maxSumHelper(root.left);
    NodeValue right = maxSumHelper(root.right);
    
    if(left.maxValue<root.val && root.val<right.minValue){
        max= Math.max(max,left.maxsum+right.maxsum+root.val);
        return new NodeValue(Math.max(root.val,right.maxValue),Math.min(root.val,left.minValue),left.maxsum+right.maxsum+root.val);
    }
    return new NodeValue(Integer.MAX_VALUE,Integer.MIN_VALUE,Math.max(left.maxsum,right.maxsum));
}
}

