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
    public static boolean findSum(TreeNode root,int target,int sum){
        if(root == null) return false;
        if(root.left == null && root.right == null) {
            sum += root.val;
            return (sum == target);
        }
        boolean lTrue = findSum(root.left,target,sum+ root.val);
        if(lTrue){
            return true;
        }

        return findSum(root.right,target,sum+ root.val);
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return findSum(root,targetSum,0);
    }
}