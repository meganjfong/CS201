import java.util.*;
public class Aaagmnrs {
    public String[] anagrams(String[] phrases) {
        ArrayList<String> ret = new ArrayList<>();
        for (int i = 0; i < phrases.length; i++) {
            // first element always goes in
            if (i == 0)
                ret.add(phrases[i]);
            // for element of interest, note if any element before is an anagram
            else {
                // initialize current phrase which is at index i
                ArrayList<String> curr = new ArrayList<>();
                String[] splitCurr = phrases[i].split("");
                for (String s : splitCurr) {
                    // rid of spaces and capitalization
                    if (!s.equals(" "))
                        curr.add(s.toLowerCase());
                }
                // if there are anagrams, count will not be 0
                int count = 0;
                // compare curr to the strings before it in phrases- index 0 to index i-1
                for (int k = 0; k < i; k++) {
                    // initialize comparison phrase
                    ArrayList<String> compare = new ArrayList<>();
                    String[] splitCompare = phrases[k].split("");
                    for (String elem : splitCompare) {
                        // rid of spaces and capitalization
                        if (!elem.equals(" "))
                            compare.add(elem.toLowerCase());
                    }
                    //checks to see if the current phrase is an anagram of the compared phrase
                    Collections.sort(compare);
                    Collections.sort(curr);
                    // count represents the number of anagrams curr has
                    if (compare.equals(curr))
                        count += 1;
                }
                if (count == 0 && ret.contains(phrases[i]) == false)
                    ret.add(phrases[i]);
            }

        }
        String[] ans = new String[ret.size()];
        ans = ret.toArray(ans);
        return ans;
    }
}


