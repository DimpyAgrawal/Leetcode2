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
    int total =0;
    public int pathSum(TreeNode root, int targetSum) {
        if(root==null)return 0;
        HashMap<Long, Integer> map = new HashMap<>();
        map.put(0l, 1);
        solve(root, targetSum, 0l, map);
        return total;
    }

    private void solve(TreeNode cur, int t, long sum, HashMap<Long, Integer> map){
        if(cur==null)return;
        sum+=cur.val;

        if(map.containsKey(sum-t)){
            total += map.get(sum-t);
        }
        map.put(sum,map.getOrDefault(sum,0)+1);
        solve(cur.left, t, sum, map);
        solve(cur.right, t, sum, map);
        map.put(sum, map.get(sum)-1);

        return;
    }
}