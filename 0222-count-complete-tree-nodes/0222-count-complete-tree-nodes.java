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
    public int countNodes(TreeNode root) {
         int[] cnt=new int[1];
         cnt[0]=0;
        totalNodes(root,cnt);
        return cnt[0];
    }
    static void totalNodes(TreeNode root ,int[] cnt){
        if(root ==null) return ;
        
        cnt[0]++;
        totalNodes(root.left ,cnt);
        totalNodes(root.right ,cnt);
    
    }
}