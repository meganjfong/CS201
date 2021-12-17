import java.util.*;
public class SortByFreqs {
    public String[] sort(String[] data) {
        List<String> list = Arrays.asList(data);
        TreeSet<String> set = new TreeSet<>(list);
        String[] ret = new String[set.size()];
        TreeMap<String,Integer> map = new TreeMap<>();
        for (String s : data) {
            map.putIfAbsent(s,0);
            map.put(s,map.get(s)+1);
        }
       // add all unique words to ret
        int idx = 0;
        for (String s : set) {
            ret[idx] = s;
            idx+=1;
        }
        Arrays.sort(ret, Comparator.comparing(map::get).reversed());
        return ret;
    }
}