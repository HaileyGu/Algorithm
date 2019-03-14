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
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null)
            return false;

        sum -= root.val;
        if((root.left == null && root.right == null))
            return (sum == 0);
        return hasPathSum(root.left, sum) || hasPathSum(root.right, sum);
    }
}
// Time Complexity : we visit each node exactly once, thus the time complexity is O(N), where N is the number of nodes.
// Space Complexity : in the worst case, the tree is completely unbalanced,e.g. each node has only one child node, the recursion call would occur N times(the height of the tree), therefore the storage to keep the call stack would be O(N). But in the best case(the tree is completely balanced), the height of the tree would be log(N). Therefore, the space complexity in this case would be O(log(N)).

// DFS would be better than BFS here since it works faster except the worst case. In the worst case the path root->leaf with the given sum is the last considered one and in  this case DFS results in the same productivity as BFS.

// class Solution {
//     public boolean hasPathSum(TreeNode root, int sum) {
//         if(root == null)
//             return false;

//         LinkedList<TreeNode> node_stack = new LinkedList();
//         LinkedList<Integer> sum_stack = new LinkedList();
//         node_stack.add(root);
//         sum_stack.add(sum - root.val);

//         TreeNode node;
//         int curr_sum;
//         while(!node_stack.isEmpty()) {
//             node = node_stack.pollLast();
//             curr_sum = sum_stack.pollLast();
//             if((node.left == null) && (node.right == null) && (curr_sum == 0))
//                 return true;

//             if(node.left != null) {
//                 node_stack.add(node.left);
//                 sum_stack.add(curr_sum - node.left.val);
//             }
//             if(node.right != null) {
//                 node_stack.add(node.right);
//                 sum_stack.add(curr_sum - node.right.val);
//             }
//         }

//         return false;
//     }
// }

// Time Complexity : the same as the recursion approach O(N)
// Space complexity : O(N) since in the worst case, when the tree is completely unbalanced, e.g each node has only one child node, we would keep all N nodes in the stack. But in the best case(the tree is balanced), the height of the tree would be log(N). Therefore, the space complexity in this case would be O(long(N)).
