import java.util.*;
public class UniqueTreeValues {
    private Set<Integer> mySet;
    public void inOrder(TreeNode root) {
        if (root != null) {
            inOrder(root.left);
            mySet.add(root.info);
            inOrder(root.right);
        }
    }
    public int[] unique(TreeNode root) {
        mySet = new HashSet<>();
        inOrder(root);
        int ret[] = new int[mySet.size()];
        int idx = 0;
        for (int i : mySet) {
            ret[idx++] = i;
        }
        Arrays.sort(ret);
        return ret;
    }
}
