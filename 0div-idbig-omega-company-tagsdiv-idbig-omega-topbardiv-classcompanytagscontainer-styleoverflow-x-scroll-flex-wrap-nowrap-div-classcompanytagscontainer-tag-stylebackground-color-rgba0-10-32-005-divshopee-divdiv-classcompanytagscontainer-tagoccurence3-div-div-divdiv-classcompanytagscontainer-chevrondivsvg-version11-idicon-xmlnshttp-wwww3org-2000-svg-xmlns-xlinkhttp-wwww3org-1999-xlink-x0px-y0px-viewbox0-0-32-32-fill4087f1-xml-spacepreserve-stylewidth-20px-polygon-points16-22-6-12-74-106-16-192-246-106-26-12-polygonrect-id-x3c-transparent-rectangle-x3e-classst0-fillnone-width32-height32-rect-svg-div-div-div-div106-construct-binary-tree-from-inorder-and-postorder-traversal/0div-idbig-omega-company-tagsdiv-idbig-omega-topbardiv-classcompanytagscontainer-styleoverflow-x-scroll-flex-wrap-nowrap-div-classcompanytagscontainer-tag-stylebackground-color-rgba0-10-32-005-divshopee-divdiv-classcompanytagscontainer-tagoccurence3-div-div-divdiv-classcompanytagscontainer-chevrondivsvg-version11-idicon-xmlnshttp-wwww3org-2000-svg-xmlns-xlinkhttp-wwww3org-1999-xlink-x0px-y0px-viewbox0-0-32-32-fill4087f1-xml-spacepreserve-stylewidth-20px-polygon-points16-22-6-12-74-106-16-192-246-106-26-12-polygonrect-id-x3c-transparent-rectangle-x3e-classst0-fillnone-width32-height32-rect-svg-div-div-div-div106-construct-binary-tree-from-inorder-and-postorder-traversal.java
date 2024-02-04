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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder == null || postorder == null || inorder.length != postorder.length)
            return null;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return buildTree(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1, map);
    }

    public TreeNode buildTree(int[] in, int is, int ie, int[] po, int ps, int pe, HashMap<Integer, Integer> map) {
        if (ps > pe || is > ie)
            return null;
        TreeNode root = new TreeNode(po[pe]);

        int inRoot = map.get(po[pe]);
        int numsLeft = inRoot - is;
        root.left = buildTree(in, is, inRoot - 1, po, ps, ps + numsLeft - 1, map);
        root.right = buildTree(in, inRoot + 1, ie, po, ps + numsLeft, pe - 1, map);
        return root;
    }
}
