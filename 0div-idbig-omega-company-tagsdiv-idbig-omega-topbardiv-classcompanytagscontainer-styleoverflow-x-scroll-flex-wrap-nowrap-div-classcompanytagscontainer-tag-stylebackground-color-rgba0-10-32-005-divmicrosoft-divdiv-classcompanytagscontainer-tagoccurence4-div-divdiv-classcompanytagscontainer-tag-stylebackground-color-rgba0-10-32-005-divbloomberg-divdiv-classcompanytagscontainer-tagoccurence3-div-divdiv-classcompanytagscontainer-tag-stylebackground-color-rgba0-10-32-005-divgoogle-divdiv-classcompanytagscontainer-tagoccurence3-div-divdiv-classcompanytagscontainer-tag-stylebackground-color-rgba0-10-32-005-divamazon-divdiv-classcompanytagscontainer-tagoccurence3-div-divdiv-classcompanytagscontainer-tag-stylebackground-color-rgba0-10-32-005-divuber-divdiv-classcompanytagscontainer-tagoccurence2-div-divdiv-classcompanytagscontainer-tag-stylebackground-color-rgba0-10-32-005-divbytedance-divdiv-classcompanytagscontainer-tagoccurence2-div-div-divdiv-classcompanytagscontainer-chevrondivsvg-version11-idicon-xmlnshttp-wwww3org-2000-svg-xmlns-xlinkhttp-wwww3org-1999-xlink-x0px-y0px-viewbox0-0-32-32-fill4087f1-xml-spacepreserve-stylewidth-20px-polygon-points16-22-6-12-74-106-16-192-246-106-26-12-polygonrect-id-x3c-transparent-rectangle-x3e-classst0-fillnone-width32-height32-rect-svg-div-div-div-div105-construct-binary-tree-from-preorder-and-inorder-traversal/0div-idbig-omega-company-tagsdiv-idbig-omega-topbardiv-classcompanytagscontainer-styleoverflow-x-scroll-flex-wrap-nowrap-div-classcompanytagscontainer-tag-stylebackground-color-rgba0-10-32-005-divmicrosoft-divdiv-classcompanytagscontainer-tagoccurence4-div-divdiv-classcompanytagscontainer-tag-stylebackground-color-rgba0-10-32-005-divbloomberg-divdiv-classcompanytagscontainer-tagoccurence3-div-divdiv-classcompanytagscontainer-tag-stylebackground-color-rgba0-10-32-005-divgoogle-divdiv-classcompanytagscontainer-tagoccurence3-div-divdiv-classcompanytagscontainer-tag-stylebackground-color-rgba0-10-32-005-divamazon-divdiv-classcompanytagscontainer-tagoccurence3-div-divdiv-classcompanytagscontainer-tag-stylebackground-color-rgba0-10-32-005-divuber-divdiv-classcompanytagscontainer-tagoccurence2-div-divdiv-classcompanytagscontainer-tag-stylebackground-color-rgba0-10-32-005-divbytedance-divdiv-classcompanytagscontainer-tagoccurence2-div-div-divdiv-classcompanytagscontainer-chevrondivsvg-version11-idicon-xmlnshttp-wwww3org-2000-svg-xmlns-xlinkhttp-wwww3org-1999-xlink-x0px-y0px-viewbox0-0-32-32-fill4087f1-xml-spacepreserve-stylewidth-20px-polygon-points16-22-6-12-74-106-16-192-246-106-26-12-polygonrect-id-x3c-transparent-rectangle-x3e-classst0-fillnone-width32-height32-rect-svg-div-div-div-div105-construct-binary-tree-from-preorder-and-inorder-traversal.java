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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || inorder == null || preorder.length != inorder.length)
            return null;

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return buildBinaryTree(inorder, 0, inorder.length - 1, preorder, 0, preorder.length - 1, map);
    }

    public TreeNode buildBinaryTree(int[] in, int is, int ie, int[] pre, int ps, int pe, HashMap<Integer, Integer> map) {
        if (is > ie || ps > pe)
            return null;

        TreeNode root = new TreeNode(pre[ps]);
        int inRoot = map.get(pre[ps]);
        int numsLeft = inRoot - is;
        root.left = buildBinaryTree(in, is, inRoot - 1, pre, ps + 1, ps + numsLeft, map);
        root.right = buildBinaryTree(in, inRoot + 1, ie, pre, ps + numsLeft + 1, pe, map);
        return root;
    }
}