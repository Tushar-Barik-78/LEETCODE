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
    public int maxLevelSum(TreeNode root) {
        if(root == null) return 0;
        Queue<TreeNode> q = new LinkedList<>();

        q.add(root);
        int maxSumLevel = 1;
        int maxSum = Integer.MIN_VALUE;
        int level = 1;
         while(!q.isEmpty()){
             int sum = 0;
             

             int size = q.size();
             for(int i =0;i<size;i++){
                 TreeNode frontEle = q.poll();
                 sum += frontEle.val;
                 if(frontEle.left != null) {
                     q.add(frontEle.left);
                 }
                 if(frontEle.right != null){
                     q.add(frontEle.right);
                 }
             }

             if(sum > maxSum){
                 maxSum = sum;
                 maxSumLevel = level;
             }

             level++;

         }

         return maxSumLevel;
    }
}