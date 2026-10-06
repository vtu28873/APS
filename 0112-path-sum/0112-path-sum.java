
class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;

        // Leaf node check: verify if remaining sum equals node's value
        if (root.left == null && root.right == null) {
            return root.val == targetSum;
        }

        // Subtract current node value and recurse on children
        int remainingSum = targetSum - root.val;
        return hasPathSum(root.left, remainingSum) || hasPathSum(root.right, remainingSum);
    }
}
        
    
