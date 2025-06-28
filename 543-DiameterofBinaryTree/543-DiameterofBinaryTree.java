// Last updated: 28. 06. 2025. 20:43:50
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
    public int diameterOfBinaryTree(TreeNode root) {
        int[] d = {0};
        dfs(root, d);
        return d[0];
    }
    public int dfs(TreeNode t, int[] count){
        if(t==null)
            return 0;
        int l = dfs(t.left, count);
        int r = dfs(t.right, count);
        count[0] = Math.max(count[0], l+r);
        return Math.max(l,r)+1;
    }
}