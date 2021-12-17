import java.util.*;

public class Closet {
    public String anywhere(String[] list) {
        Set<String> set = new HashSet<>();
        for (String s: list) {
            String[] splitStr = s.split(" ");
            for (String elem: splitStr) {
                set.add(elem);
            }
        }
        List<String> sortedRet = new ArrayList<String>(set);
        Collections.sort(sortedRet);
        set = new LinkedHashSet<>(sortedRet);
        String ret = String.join(" ", set);
        return ret;
    }
}
