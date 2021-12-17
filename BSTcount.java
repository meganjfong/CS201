import java.util.*;
public class BSTcount {
    Map<Integer,Long> mySavedValues = new HashMap<>();
    public long howMany(int[] values) {
        int size = values.length;
        return helpcount(size);
    }
    public long helpcount(int size) {
        if (size == 0)
            return 1;
        else if (size == 1)
            return 1;
        else if (size == 2)
            return 2;
        else if (mySavedValues.containsKey(size))
            return mySavedValues.get(size);
        long currCount = 0;
        for (int i = 0; i < size; i++) {
            long num = helpcount(i) * helpcount(size-1-i);
            currCount += num;
        }
        mySavedValues.put(size,currCount);
        return mySavedValues.get(size);
    }
}
