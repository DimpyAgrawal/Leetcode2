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
    int maxhe = Integer.MIN_VALUE;
    int ans=0;
    public int findBottomLeftValue(TreeNode root) {
        bottomleft(root,0);
        return ans;
    }
    public void bottomleft(TreeNode root,int height){
        if(root==null) return;
        
        if(height>maxhe){
            maxhe = height;
            ans = root.val;
        }
        bottomleft(root.left,height+1);
        bottomleft(root.right,height+1);
    }
}