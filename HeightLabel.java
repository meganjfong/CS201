public class HeightLabel {
    private int nodeHeight(TreeNode t) {
        if (t == null)
            return 0;
        return Math.max(nodeHeight(t.left) +1,nodeHeight(t.right) +1);
    }
    public TreeNode rewire(TreeNode t) {
        if (t == null)
            return null;
        return new TreeNode(nodeHeight(t),rewire(t.left),rewire(t.right));
    }
}