import java.util.ArrayList;

public class Starter {
    public int begins(String[] words, String first) {
        int count = 0;
        ArrayList<String> pastWords = new ArrayList<String>();
        for (int k = 0; k < words.length; k += 1) {
            if (words[k].charAt(0) == first.charAt(0) && !pastWords.contains(words[k])) {
                count += 1;
                pastWords.add(words[k]);
            }
        }
        return count;
    }
}