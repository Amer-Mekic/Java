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
    public int sumOfLeftLeaves(TreeNode root) {
        if(root==null)
            return 0;
        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(root);
        int sum = 0;
        while(!q.isEmpty()){
            int size = q.size();
            for(int i = 0 ; i < size ; i++){
                TreeNode first = q.remove();
                if(first.left!=null){
                    if(first.left.left==null && first.left.right==null){
                        sum+=first.left.val;
                    }
                    else{
                        q.add(first.left);
                    }
                }
                if(first.right!=null){
                    q.add(first.right);
                }
            }
        }
        return sum;
    }
}