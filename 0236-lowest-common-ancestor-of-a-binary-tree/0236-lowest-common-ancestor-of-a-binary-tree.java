
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // Base case: if root is null, or root matches p or q
        if (root == null || root == p || root == q) {
            return root;
        }

        // Search in left and right subtrees
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        // If both subtrees returned non-null values, root is the LCA
        if (left != null && right != null) {
            return root;
        }

        // Otherwise, return whichever subtree found p or q (or null if neither)
        return left != null ? left : right;
    }
}