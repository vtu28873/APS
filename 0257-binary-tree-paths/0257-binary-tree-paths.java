class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> answer = new ArrayList<>();
        if (root != null) {
            dfs(root, "", answer);
        }
        return answer;
    }

    private void dfs(TreeNode node, String path, List<String> answer) {
        if (path.isEmpty()) {
            path += node.val;
        } else {
            path += "->" + node.val;
        }

        // If leaf node, add complete path to result
        if (node.left == null && node.right == null) {
            answer.add(path);
            return;
        }

        if (node.left != null) {
            dfs(node.left, path, answer);
        }
        if (node.right != null) {
            dfs(node.right, path, answer);
        }
    }
}