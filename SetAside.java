import java.util.*;
public class SetAside {
    public String common(String[] list) {
        String initial = list[0];
        Set<String> set = new HashSet<>(Arrays.asList(initial.split(" ")));
        for (int k = 1; k < list.length; k++) {
            String current = list[k];
            Set<String> curr = new HashSet<>(Arrays.asList(current.split(" ")));
            set.retainAll(curr);
        }
        List<String> sortedRet = new ArrayList<String>(set);
        Collections.sort(sortedRet);
        set = new LinkedHashSet<>(sortedRet);
        String ret = String.join(" ", set);
        return ret;
    }
}
