// Approach 1: Recursion
// Approach 2: Iteration
/*
// Definition for a Node.
class Node {
public:
    int val;
    vector<Node*> children;

    Node() {}

    Node(int _val, vector<Node*> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
public:
    int maxDepth(Node* root) {
        if(root == NULL) return 0;

        int ans = 0;
        queue<Node *> que;
        que.push(root);

        while(!que.empty()) {
            ans++;
            int n = que.size();

            for(int i = 0; i < n; i++) {
                Node* node = que.front();
                que.pop();

                for(int j = 0; j < node->children.size(); j++) {
                    que.push(node->children[j]);
                }
            }
        }

        return ans;

    }
};
