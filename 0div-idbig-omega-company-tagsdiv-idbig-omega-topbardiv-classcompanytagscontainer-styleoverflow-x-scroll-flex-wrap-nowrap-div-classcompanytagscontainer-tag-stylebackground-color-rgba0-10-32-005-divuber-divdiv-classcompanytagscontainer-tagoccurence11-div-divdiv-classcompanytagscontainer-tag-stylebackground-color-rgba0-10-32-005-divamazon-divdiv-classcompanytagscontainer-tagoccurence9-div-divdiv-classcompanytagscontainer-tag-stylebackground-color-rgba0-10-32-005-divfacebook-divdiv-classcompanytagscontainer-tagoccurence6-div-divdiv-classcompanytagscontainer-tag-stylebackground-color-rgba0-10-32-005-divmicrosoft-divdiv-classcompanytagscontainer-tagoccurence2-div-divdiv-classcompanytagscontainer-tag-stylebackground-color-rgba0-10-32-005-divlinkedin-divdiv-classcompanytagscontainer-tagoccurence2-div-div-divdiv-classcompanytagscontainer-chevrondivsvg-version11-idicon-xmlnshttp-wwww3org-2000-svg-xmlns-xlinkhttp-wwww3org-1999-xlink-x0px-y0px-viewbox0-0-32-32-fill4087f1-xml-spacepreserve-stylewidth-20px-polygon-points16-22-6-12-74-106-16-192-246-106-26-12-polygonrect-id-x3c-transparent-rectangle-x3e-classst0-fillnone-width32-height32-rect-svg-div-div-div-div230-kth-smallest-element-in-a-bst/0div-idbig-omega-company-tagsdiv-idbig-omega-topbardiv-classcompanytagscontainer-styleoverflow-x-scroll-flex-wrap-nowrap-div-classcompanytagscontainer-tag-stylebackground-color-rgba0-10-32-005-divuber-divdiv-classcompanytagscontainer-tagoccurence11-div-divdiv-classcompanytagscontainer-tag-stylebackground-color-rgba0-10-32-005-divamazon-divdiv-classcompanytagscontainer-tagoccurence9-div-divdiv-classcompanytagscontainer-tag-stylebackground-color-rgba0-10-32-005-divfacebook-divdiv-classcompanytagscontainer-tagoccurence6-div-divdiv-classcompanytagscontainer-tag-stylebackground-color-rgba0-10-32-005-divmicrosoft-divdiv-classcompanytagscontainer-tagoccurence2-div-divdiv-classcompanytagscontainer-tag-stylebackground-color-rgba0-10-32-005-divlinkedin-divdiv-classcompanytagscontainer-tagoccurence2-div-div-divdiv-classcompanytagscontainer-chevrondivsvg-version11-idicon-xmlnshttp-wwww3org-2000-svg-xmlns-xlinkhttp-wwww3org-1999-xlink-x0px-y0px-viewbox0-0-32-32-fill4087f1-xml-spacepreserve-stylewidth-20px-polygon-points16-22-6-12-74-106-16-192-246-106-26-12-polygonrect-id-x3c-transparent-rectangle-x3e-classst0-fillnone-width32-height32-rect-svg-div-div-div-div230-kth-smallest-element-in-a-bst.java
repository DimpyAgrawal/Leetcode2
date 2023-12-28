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
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> list  = new ArrayList<>();
        preO(root,list);
        return (list.get(k-1));
        
    }
    public void preO(TreeNode root,ArrayList<Integer> list){
        if(root==null) return;
        
        preO(root.left,list);
        list.add(root.val);
        preO(root.right,list);
    }
}