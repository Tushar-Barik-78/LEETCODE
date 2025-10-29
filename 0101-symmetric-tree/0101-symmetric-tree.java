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
    public static TreeNode invert(TreeNode root){
        if(root == null) return null;
        if(root.left == null && root.right == null) return root;

        TreeNode temp = root.left ;
        root.left = root.right;
        root.right = temp;

        invert(root.left);
        invert(root.right);

        return root;
    }


    public static boolean checkEqual(TreeNode root1,TreeNode root2){
        if(root1 == null && root2 == null) return true;
        if(root1 == null || root2 == null) return false;

        if(root1.val != root2.val) return false;

        boolean ltree = checkEqual(root1.left,root2.left);
        if(!ltree) return false;

        return checkEqual(root1.right,root2.right);
    }
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return false;
        invert(root.left);
        return checkEqual(root.left,root.right);
    }
}