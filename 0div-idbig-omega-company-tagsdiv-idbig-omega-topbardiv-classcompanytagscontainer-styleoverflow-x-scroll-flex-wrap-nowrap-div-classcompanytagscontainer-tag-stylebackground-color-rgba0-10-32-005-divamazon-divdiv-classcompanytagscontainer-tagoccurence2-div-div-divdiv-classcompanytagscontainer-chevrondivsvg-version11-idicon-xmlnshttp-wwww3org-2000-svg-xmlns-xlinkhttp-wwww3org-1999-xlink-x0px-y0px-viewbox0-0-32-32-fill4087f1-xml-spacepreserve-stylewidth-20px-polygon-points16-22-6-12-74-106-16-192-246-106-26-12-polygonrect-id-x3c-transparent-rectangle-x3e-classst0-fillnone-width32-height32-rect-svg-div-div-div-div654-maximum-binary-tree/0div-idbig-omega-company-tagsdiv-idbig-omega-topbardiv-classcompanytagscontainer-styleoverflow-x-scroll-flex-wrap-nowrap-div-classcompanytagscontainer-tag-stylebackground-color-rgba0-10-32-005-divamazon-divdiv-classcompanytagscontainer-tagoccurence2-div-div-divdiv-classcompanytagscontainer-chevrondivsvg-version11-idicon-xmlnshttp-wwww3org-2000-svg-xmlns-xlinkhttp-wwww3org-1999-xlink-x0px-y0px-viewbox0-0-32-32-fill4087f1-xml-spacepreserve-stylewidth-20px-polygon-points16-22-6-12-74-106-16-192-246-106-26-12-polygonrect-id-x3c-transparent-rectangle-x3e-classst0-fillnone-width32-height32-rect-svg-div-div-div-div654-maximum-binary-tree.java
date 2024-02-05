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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
      return constructTree(nums,0,nums.length-1);    
    }
    
    public TreeNode constructTree(int[] nums,int s,int e){
        if(s>e) return null;
        if(s==e) new TreeNode(nums[s]);
        
        int idx = max(nums,s,e);
        TreeNode root = new TreeNode(nums[idx]);
        root.left = constructTree(nums,s,idx-1);
        root.right = constructTree(nums,idx+1,e);
        return root;
    }
    
    public int max(int[] nums,int s,int e){
        int maxNum = Integer.MIN_VALUE;
        int idx = -1;
        for(int i=s;i<=e;i++){
            if(nums[i]>maxNum){
                maxNum = nums[i];
                idx = i;
            }
        }
        return idx;
    }
}