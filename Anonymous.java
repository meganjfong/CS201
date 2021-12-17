import java.util.*;
public class Anonymous {
    private int[] getCounts (String[] strings) {
        int[] counts = new int[300];
        for (String s : strings) {
            for (char ch : s.toLowerCase().toCharArray()) {
                counts[ch] += 1;
            }
        }
        return counts;
    }
    public int howMany(String[] headlines, String[] messages) {
        ArrayList<String> headlineLet = new ArrayList<>();
        for (String H : headlines) {
            String[] eachHeadline = H.split(" ");
            for (String word : eachHeadline) {
                String[] let = word.split("");
                for (String letter : let) {
                    headlineLet.add(letter);
                }
            }
        }
        String[] letterBank = new String[headlineLet.size()];
        letterBank = headlineLet.toArray(letterBank);
        int[] headlineBank = getCounts(letterBank);
        int ret = 0;
        for (String M : messages) {
            ArrayList<String> allLetters = new ArrayList<>();
            String[] eachWord = M.split(" ");
            for (String word : eachWord) {
                String[] eachLetter = word.split("");
                for (String letter : eachLetter) {
                    allLetters.add(letter);
                }
            }
            String[] letters = new String[allLetters.size()];
            letters = allLetters.toArray(letters);
            int[] msgCount = getCounts(letters);
            int result = 0;
            for (int i=0;i <msgCount.length;i++) {
                if (msgCount[i] > headlineBank[i]) {
                     result += 1;
                }
            }
            if (result == 0) {
                ret += 1;
            }

        }
        return ret;
    }
}