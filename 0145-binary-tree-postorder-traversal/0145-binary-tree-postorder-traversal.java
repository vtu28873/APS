class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        postorder(root, result);
        return result;
    }

    private void postorder(TreeNode node, List<Integer> result) {
        if (node == null) return;

        postorder(node.left, result);  // Traverse Left
        postorder(node.right, result); // Traverse Right
        result.add(node.val);          // Visit Root
    }
}