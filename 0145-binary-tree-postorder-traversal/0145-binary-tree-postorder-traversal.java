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
    public List<Integer> postorderTraversal(TreeNode root) {
        
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        TreeNode current = root;
        TreeNode lastvisited = null;
        
        while(current!=null || !st.isEmpty()){
            if(current!=null){
                st.push(current);
                current = current.left;
            }
            else{
                TreeNode peekNode = st.peek();
                if(peekNode.right!=null  && lastvisited != peekNode.right){
                    current = peekNode.right;
                }
                else{
                    list.add(peekNode.val);
                    lastvisited = st.pop();
                }
            }
        }
        
        
        return list;
    }
}