import java.util.*;

public class StringCuts {
    public String[] filter(String[] list, int minLength) {
        ArrayList<String> meetReq = new ArrayList<>();
        for (String elem: list) {
            if (elem.length() >= minLength && meetReq.contains(elem) == false) {
                meetReq.add(elem);
            }
        }
        String[] ret = meetReq.toArray(new String[0]);
        return ret;
    }
}
