import java.util.*;
public class BigWord {
    public String most(String[] sentences) {
        String ret = "";
        HashMap <String,Integer> dict = new HashMap<String, Integer>();
        for (int i = 0; i < sentences.length; i++) {
            String[] spltStr = sentences[i].split(" ");
            for (String s: spltStr) {
                s = s.toLowerCase();
               if (dict.containsKey(s) == false) {
                   dict.put(s,1);
               }
               else {
                   dict.put(s,dict.get(s)+1);
               }
            }
        }
        int maxFreq = Collections.max(dict.values());
        for (Map.Entry<String,Integer> entry : dict.entrySet()) {
            if (entry.getValue() == maxFreq) {
                ret = entry.getKey();
            }
        }
        return ret;
    }
}
