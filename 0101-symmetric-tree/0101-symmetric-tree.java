
class Solution {
    public boolean isSymmetric(TreeNode root) {
        return checkMirror(root.left, root.right);
    }

    public boolean checkMirror(TreeNode left, TreeNode right) {

        // Both nodes are null
        if (left == null && right == null) {
            return true;
        }

        // Only one node is null
        if (left == null || right == null) {
            return false;
        }

        // Values must be equal
        if (left.val != right.val) {
            return false;
        }

        // Compare opposite sides
        return checkMirror(left.left, right.right) &&
               checkMirror(left.right, right.left);
    }
}

