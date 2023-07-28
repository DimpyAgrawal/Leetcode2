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
// class Solution {
//     public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
//         if(root == null) return new ArrayList<>();
//         return pathsumutil(root,targetSum,0,new ArrayList<>(),new ArrayList<>());
//     }
//      List<List<Integer>> pathsumutil(TreeNode root, int targetSum,int sum,List<List<Integer>> ans,List<Integer> sublist){
       
//         if(root==null) return ans;
//         sublist.add(root.val);
        
        
//         if(root.left==null && root.right==null && targetSum+root.val==sum){
//              ans.add(new ArrayList<>(sublist));
//         }
//        pathsumutil(root.left,targetSum,sum+root.val,ans,sublist);
//            pathsumutil(root.right,targetSum,sum+root.val,ans,sublist);
//        sublist.remove(sublist.size()-1);
//         return ans;
//     }
// }

class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if(root == null) return new ArrayList<>();
        return helper(root, 0, targetSum, new ArrayList<>(), new ArrayList<>());
    }
    List<List<Integer>> helper(TreeNode node, int sum, int target, List<List<Integer>> ans, List<Integer> list){
        if(node == null) return ans;
        list.add(node.val);
        if(node.left == null && node.right == null && sum + node.val == target){
            ans.add(new ArrayList<>(list));
        }
        helper(node.left, sum + node.val, target, ans, list);
        helper(node.right, sum + node.val, target, ans, list);
        list.remove(list.size() - 1);
        return ans;
    }
 }