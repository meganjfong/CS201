import java.util.*;

public class LevelCount {
    private ArrayList<Integer> onLevel = new ArrayList<>();

    public int count(TreeNode t, int level) {
        if(t == null)
            return 0;
        levels(t, 0, level);
        return onLevel.size();
    }

    private void levels (TreeNode t, int currLevel, int level) {
        if(currLevel == level)
            onLevel.add(currLevel);
        currLevel++;
        if(t.left != null)
            levels(t.left, currLevel, level);
        if(t.right != null)
            levels(t.right, currLevel, level);
    }
}
