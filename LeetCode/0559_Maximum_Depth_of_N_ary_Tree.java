// Approach 1: Recursion
// Approach 2: Iteration
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
    public int maxDepth(Node root) {
        if(root == null) return 0;

        int ans = 0;
        Queue<Node> que = new LinkedList<>();
        que.add(root);

        while(!que.isEmpty()) {
            ans++;
            int n = que.size();

            for(int i = 0; i < n; i++) {
                Node node = que.remove();
                
                for(int j = 0; j < node.children.size(); j++) {
                    que.add(node.children.get(j));
                }
            }
        }

        return ans;
    }
}
