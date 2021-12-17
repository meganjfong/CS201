public class PathSum {
    public int hasPath(int target, TreeNode tree) {
        // 1 if path exists, 0 if not
        //if (tree == null)
            //return 0;
        //else {
            //int pathSum = target - tree.info;
            //if (pathSum == 0 && tree.left == null && tree.right == null)
                //return 1;
            //if (tree.left != null)
                //return hasPath(pathSum, tree.left);
            //if (tree.right != null)
                //return hasPath(pathSum, tree.right);
            //return 0;
        if (tree == null)
            return 0;
        target -= tree.info;
        if (target == 0 && isLeaf(tree))
            return 1;
        int left = hasPath(target,tree.left);
        int right = hasPath(target,tree.right);
        if (left > right)
            return left;
        if (right < left)
            return right;
        else {
            return right;
        }
        }
    public boolean isLeaf(TreeNode tree) {
        return (tree.left == null) && (tree.right == null);
    }
    }