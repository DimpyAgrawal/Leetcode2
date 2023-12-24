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
      if(root==null) return new ArrayList<>();
        return path(root,targetSum,0,new ArrayList<>(),new ArrayList<>());
    }
    
    public List<List<Integer>> path(TreeNode root, int targetSum,int sum,ArrayList<Integer> sublist,List<List<Integer>> list){
        if(root==null) return list;
         sublist.add(root.val);
        sum+=root.val;
       
        
        if(root.left==null && root.right==null && targetSum==sum)
            list.add(new ArrayList<>(sublist));
        path(root.left,targetSum,sum,sublist,list);
         path(root.right,targetSum,sum,sublist,list);
        sublist.remove(sublist.size()-1);
        
        return list;
        
        
    }
}