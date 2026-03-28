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

    public static void findSums(TreeNode root, int target, int sum, List<List<Integer>> ans,List<Integer> list){
        if(root == null) return;
        if(root.left == null && root.right== null){
            sum += root.val;
            list.add(root.val);
            if(sum == target){
                ans.add(new ArrayList<>(list));
            }
            list.removeLast();
            return;
        }


        list.add(root.val);

        findSums(root.left,target,sum+root.val,ans,list );
        findSums(root.right,target,sum+root.val,ans,list );

        list.removeLast();
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        findSums(root, targetSum , 0,ans, list);

        return ans;
    }
}