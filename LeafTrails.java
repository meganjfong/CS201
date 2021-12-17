import java.util.*;
public class LeafTrails {
    private TreeMap<Integer,String> myMap;
    public void doWork(TreeNode tree,String path) {
        if (tree == null)
            return;
        if (tree.left == null && tree.right == null) {
            myMap.put(tree.info,path);
        }
        else {
            doWork(tree.left,path + "0");
            doWork(tree.right,path + "1");
        }
    }
    public String[] trails(TreeNode tree) {
        myMap = new TreeMap<Integer,String>();
        doWork(tree,"");
        String[] ret = new String[myMap.size()];
        int idx = 0;
        for (Map.Entry<Integer,String> entry : myMap.entrySet()) {
            ret[idx] = entry.getValue();
            idx++;
        }
        return ret;
    }
}
