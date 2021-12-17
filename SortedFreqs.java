import java.util.*;

public class SortedFreqs {
    public int[] freqs(String[] data) {
        List<String> list = Arrays.asList(data);
        TreeSet<String> set = new TreeSet<>(list);
        String[] words = new String[set.size()];
        TreeMap<String,Integer> map = new TreeMap<>();
        for (String s : data) {
            map.putIfAbsent(s,0);
            map.put(s,map.get(s)+1);
        }
        // add all unique words to ret
        int idx = 0;
        for (String s : set) {
            words[idx] = s;
            idx+=1;
        }
        Arrays.sort(words, Comparator.comparing(String::valueOf));
        int[] ret = new int[words.length];
        int i = 0;
        for (String s: words) {
            ret[i] = map.get(s);
            i++;
        }
        return ret;
    }
}