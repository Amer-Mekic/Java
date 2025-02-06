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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        ArrayDeque<TreeNode> q = new ArrayDeque<>();
        if(root == null)
            return new ArrayList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            ArrayList<Integer> entry = new ArrayList<>();
            for(int i = 0; i < size; i++){
                TreeNode first = q.remove();
    	        entry.add(first.val);
                if(first.left!=null)
                    q.add(first.left);
                if(first.right!=null)
                    q.add(first.right);   
            }
            res.add(entry);
        }
        Collections.reverse(res);
        return res;
    }
}