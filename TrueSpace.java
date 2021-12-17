public class TrueSpace {
    public long calculateSpace(int[] sizes, int clusterSize) {
        long ret = 0;
        for (int elem: sizes) {
            int div = elem/clusterSize;
            int remainder = elem%clusterSize;
            if (remainder == 0) {
                ret += div * clusterSize;
            }
            if (remainder != 0) {
                ret += (div * clusterSize) + clusterSize;
            }

        }
        return ret;
    }
}
