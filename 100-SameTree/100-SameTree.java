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
import java.util.ArrayDeque;
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        ArrayDeque<TreeNode> q1 = new ArrayDeque<>();
        ArrayDeque<TreeNode> q2 = new ArrayDeque<>();
        if((q == null && p!= null) || (p == null && q != null))
            return false;
        if(p==null && q==null)
            return true;
        q1.add(p); // 1st insert root, to check children;
        q2.add(q);
        while(!q1.isEmpty() && !q2.isEmpty()){
            int s1 = q1.size();
            int s2 = q2.size();
            if(s1!=s2)
                return false;
            for(int i = 0; i<s1;i++){
                TreeNode first = q1.remove();
                TreeNode first2 = q2.remove();
                if(first.val != first2.val)
                    return false;
                if(first.left!=null && first2.left!=null){
                    q1.add(first.left);
                    q2.add(first2.left);
                }
                else if((first.left!=null && first2.left==null)||(first.left==null && first2.left!=null))
                    return false;
                if(first.right!=null && first2.right!=null){
                    q2.add(first2.right);
                    q1.add(first.right);
                }
                else if((first.right!=null && first2.right==null)||(first.right==null && first2.right!=null))
                    return false;
            }
        }
        return true;
    }
}