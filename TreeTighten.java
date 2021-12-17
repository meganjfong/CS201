public class TreeTighten {
    public TreeNode tighten(TreeNode t) {
        if (t == null)
            return null;
        if (t.right == null && t.left == null) {
            return t;
        }
        if (t.right != null && t.left != null) {
            t.left = tighten(t.left);
            t.right = tighten(t.right);
            return t;
        }
        if (t.left != null)
            return tighten(t.left);
        return tighten(t.right);
    }
}