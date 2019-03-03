// Approach #1 Using Depth First Search [Accepted]
// Approach #2 Breadth First Search [Accepted] [v]

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> ans = new ArrayList<>();
        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);

        while(!que.isEmpty()) {
            long sum = 0;
            int n = que.size();

            for(int i = 0; i < n; i++) {
                TreeNode node = que.remove();
                if(node.left != null) que.add(node.left);
                if(node.right != null) que.add(node.right);
                sum += node.val;
            }

            ans.add(sum*1.0/n);
        }
        return ans;
    }
}
