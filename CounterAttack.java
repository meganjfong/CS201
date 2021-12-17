import java.util.*;
public class CounterAttack {
    public int[] analyze(String str, String[] words) {
        String[] spltStr = str.split(" ");
        List spltStrList = Arrays.asList(spltStr);
        Set<String> spltStrSet = new HashSet<String>(spltStrList);
        int[] ret = new int[words.length];
        HashMap<String,Long> ans = new HashMap<String,Long>();
        for (String s: spltStrSet) {
            int freq = Collections.frequency(spltStrList,s);
            Long fr = Long.valueOf(freq);
            //System.out.print(s + " " + Long.toString(fr) + " ");
            ans.put(s,fr);
        }
        for (int i=0;i<words.length;i++) {
            String compare = words[i];
            Long frequency = ans.get(compare);
            if (frequency == null) {
                ret[i] += 0;
            }
            else {
                ret[i] += frequency.intValue();
            }
        }
        System.out.print(Arrays.toString(ret));
        return ret;
    }
    public static void main(String[] args) {
        String str = "a a a b b c";
        String[] words = {"d", "c", "b", "a"};
        int[] ans = new CounterAttack().analyze(str,words);
        //System.out.print(ans);
    }
}


