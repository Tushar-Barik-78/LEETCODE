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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
         List<List<Integer>> ans = new ArrayList<>();
        if(root == null) return ans;

         Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean flag = true;

        while(!q.isEmpty()) {
            ArrayList<Integer> temp = new ArrayList<>();
            for(TreeNode i : q){
                temp.add(i.val);
            }

            if(!flag) {
                Collections.reverse(temp);
            }
            ans.add(temp);


            int size = q.size();
            for (int i = 1; i <= size; i++) {
                TreeNode peek = q.peek();
                if(peek.left != null) q.add(peek.left);
                if(peek.right != null) q.add(peek.right);
                q.poll();
            }
            flag = !flag;

        }

        return ans;

    }
}