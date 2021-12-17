import java.util.*;

public class SimpleWordGame {
    public int points(String[] player,
                      String[] dictionary) {
        HashSet<String> p = new HashSet<>(Arrays.asList(player));
        HashSet<String> d = new HashSet<>(Arrays.asList(dictionary));
        d.retainAll(p);
        int score = 0;
        for (String s : d) {
            score += s.length() * s.length();
        }
        return score;
        }
}
