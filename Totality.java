public class Totality {
    public int sum(int[] a, String stype) {
        int tot = 0;
        if (stype.equals("even")) {
            for (int k = 0; k < a.length; k += 2) {
                tot += a[k];
            }
            return tot;
        }
        if (stype.equals("odd")) {
            for (int k = 1; k < a.length; k += 2) {
                tot += a[k];
            }
            return tot;
        }
        if (stype.equals("all")) {
            for (int k = 0; k < a.length; k += 1) {
                tot += a[k];
            }
            return tot;
        }
        return 0;
    }

    public static void main(String[] args) {
        Totality tot = new Totality();
        System.out.println(tot.sum(new int[] {5,6, 7}, "all"));
    }
}
