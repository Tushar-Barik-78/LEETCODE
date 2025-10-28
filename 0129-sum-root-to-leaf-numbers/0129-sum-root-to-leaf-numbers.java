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
    public static int sumOfTree(TreeNode root,int num,int sum){
        if(root == null) return 0;
        if(root.left == null && root.right== null){
            sum += num*10+root.val;
            return sum;
        }
        int ls = sumOfTree(root.left, num*10+root.val,sum);
        int rs = sumOfTree(root.right, num*10+root.val,sum);

        return ls+rs;
    }
    public int sumNumbers(TreeNode root) {
        return sumOfTree(root,0,0);
    }
}