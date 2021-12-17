import java.util.*;
public class LengthSort {
    public String[] rearrange(String[] values){
        String[] copy = Arrays.copyOf(values, values.length);
        Arrays.sort(copy, Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder()));
        return copy;
    }
}
