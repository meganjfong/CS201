import java.util.*;
public class HuffmanDecoding {
    public String decode(String archive, String[] dictionary) {
        // create map with dictonary mapping to alphabet value
        HashMap<String,String> map = new HashMap <>();
        String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String[] alphabet = alpha.split("");
        int idx = 0;
        for (String s : dictionary) {
            map.putIfAbsent(s,alphabet[idx]);
            idx++;
        }
        // decoding return value
        String ret = "";
        // split archive into individual strings
        String[] archiveSplt = archive.split("");
        // current bit of interest
        String curr = "";
        // iterate through individual strings, forming bits
        for (String s : archiveSplt) {
            curr += s;
            if (map.containsKey(curr)) {
                ret += map.get(curr);
                curr = "";
            }
        }
        return ret;
    }
}