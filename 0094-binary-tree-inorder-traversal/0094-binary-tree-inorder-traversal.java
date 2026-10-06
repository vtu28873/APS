class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorder(root, result);
        return result;
    }

    private void inorder(TreeNode root, List<Integer> result) {
        if (root == null) return;

        inorder(root.left, result);  // Traverse Left
        result.add(root.val);        // Visit Node
        inorder(root.right, result); // Traverse Right
    }
}
