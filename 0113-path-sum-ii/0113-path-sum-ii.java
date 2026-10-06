class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> currentPath = new ArrayList<>();
        dfs(root, targetSum, currentPath, result);
        return result;
    }

    private void dfs(TreeNode node, int target, List<Integer> currentPath, List<List<Integer>> result) {
        if (node == null) return;

        // Choose: Add current node to the path
        currentPath.add(node.val);

        // Check if it's a leaf node with the target remaining sum
        if (node.left == null && node.right == null && target == node.val) {
            result.add(new ArrayList<>(currentPath)); // Store a copy of current path
        } else {
            // Recurse left and right
            dfs(node.left, target - node.val, currentPath, result);
            dfs(node.right, target - node.val, currentPath, result);
        }

        // Backtrack: Remove current node before returning
        currentPath.remove(currentPath.size() - 1);
    }
}
