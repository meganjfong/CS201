import java.util.*;
public class OlympicCandles{
    public int numberOfNights(int[] candles) {
        int numNight = 1;
        List<Integer> lst = new ArrayList<>();
        for (int length : candles) {
            lst.add(length);
        }
        Collections.sort(lst,Collections.reverseOrder());
        while (true) {
            for (int i = 0; i < numNight; i++) {
                lst.set(i,lst.get(i)-1);
            }
            Collections.sort(lst,Collections.reverseOrder());
            if ((numNight == lst.size())||lst.get(numNight) == 0)
                return numNight;
            numNight++;
        }
    }
}
