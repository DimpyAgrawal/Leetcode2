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
    String minString="";
    public String smallestFromLeaf(TreeNode root) {
        traverse(root,"");
        return minString;
    }

    public void traverse(TreeNode root,String curr){
        if(root==null) return ;
        curr = (char)('a'+root.val)+curr;
        if(root.left==null && root.right==null){
            if(minString.compareTo("")==0) 
                minString = curr;
            else
                minString = curr.compareTo(minString)<0 ? curr:minString;
        }
        traverse(root.left,curr);
        traverse(root.right,curr);
    }
}