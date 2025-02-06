/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public int maxDepth(Node root) {
        if(root == null)
            return 0;
        if(root.children==null)
            return 0;
        Queue<Node> q = new ArrayDeque<>();
        q.add(root);
        int d = 0;
        while(!q.isEmpty()){
            int size = q.size();
            for(int i = 0; i < size; i++){
                Node first = q.remove();
                if(first.children!=null)
                    q.addAll(first.children);
            }
            d++;
        }
        return d;
    }
}