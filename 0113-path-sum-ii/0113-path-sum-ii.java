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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if (root == null) return new ArrayList<>();
        return pathSumUtil(root, targetSum, 0, new ArrayList<>(), new ArrayList<>());
    }
    
    List<List<Integer>> pathSumUtil(TreeNode root, int targetSum, int currentSum, List<List<Integer>> ans, List<Integer> sublist) {
        if (root == null) return ans;
        
        sublist.add(root.val);
        currentSum += root.val;
        
        if (root.left == null && root.right == null && currentSum == targetSum) {
            ans.add(new ArrayList<>(sublist));
        }
        
        pathSumUtil(root.left, targetSum, currentSum, ans, sublist);
        pathSumUtil(root.right, targetSum, currentSum, ans, sublist);
        
        sublist.remove(sublist.size() - 1);
        
        return ans;
    }
}
