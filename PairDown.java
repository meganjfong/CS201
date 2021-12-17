public class PairDown {
    public int[] fold(int[] list) {
        int[] ret = new int[(list.length +1)/2];
        int idx = 0;
        for (int i = 0; i < list.length; i += 2) {
            if (i == list.length -1)
                ret[((list.length +1)/2) - 1] = list[i];
            else {
                int elem = list[i] + list[i + 1];
                ret[idx] = elem;
                idx += 1;
            }
        }
        return ret;
    }
}