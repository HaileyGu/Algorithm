/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */
class Solution {
public:
    vector<double> averageOfLevels(TreeNode* root) {
        vector<double> ans;
        if(root == NULL) return ans;

        queue<TreeNode *> que;
        que.push(root);

        while(!que.empty()) {
            int n = que.size();

            double levelAvg = 0;
            for(int i = 0; i < n; i++) {
                TreeNode* node = que.front();
                que.pop();

                if(node->left != NULL) que.push(node->left);
                if(node->right != NULL) que.push(node->right);

                levelAvg += node->val;
            }

            ans.push_back(levelAvg/n);
        }

        return ans;
    }
};
