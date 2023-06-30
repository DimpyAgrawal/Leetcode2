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
//     public List<Integer> inorderTraversal(TreeNode root) {
//         ArrayList<Integer> list =  new ArrayList<>();
//         return inorder(root,list);     
//     }
//     public static ArrayList<Integer> inorder(TreeNode root, ArrayList<Integer> list){
//         if(root==null){
//             return list;          //recursive approach
//         }
        
//         inorder(root.left,list);
//         list.add(root.val);
//         inorder(root.right,list);
//        return list; 
        
// }       
// }       
        
//         ArrayList<Integer> list =new ArrayList<>();
//         Stack<TreeNode> st=new Stack<>();
//         TreeNode node= root;
        
//         while(true){
            
//             if(node!=null){
//                 st.push(node);
//                 node=node.left;
//             }
//             else{
//                 if(st.isEmpty()){
//                 break;
                
//             } 
//             }
//            node=st.pop();
//             list.add(node.val);
//             node=node.right;
            
//         }
//         return list;
//     }
    
// }

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;

        while (node != null || !stack.isEmpty()) {
            // Traverse to the leftmost node of the current subtree
            while (node != null) {
                stack.push(node);
                node = node.left;
            }

            // Process the current node
            node = stack.pop();
            list.add(node.val);

            // Move to the right subtree
            node = node.right;
        }

        return list;
    }
}
