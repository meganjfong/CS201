import java.util.*;
public class MemberCheck {
    public Set<String> intersection(Set<String> set1, Set<String> set2) {
       Set<String> inBoth = new HashSet<>();
        for (String elem : set1) {
           if (set2.contains(elem)) {
               inBoth.add(elem);
           }
       }
        return inBoth;
    }
    public String[] whosDishonest(String[] club1,
                                  String[] club2,
                                  String[] club3) {
        Set<String> result = new HashSet<>();
        Set<String> s1 = new HashSet<>(Arrays.asList(club1));
        Set<String> s2 = new HashSet<>(Arrays.asList(club2));
        Set<String> s3 = new HashSet<>(Arrays.asList(club3));
        result.addAll(intersection(s1,s2));
        result.addAll(intersection(s1,s3));
        result.addAll(intersection(s2,s3));
        String[] ret = result.toArray(new String[0]);
        Arrays.sort(ret);
        return ret;
    }
}
