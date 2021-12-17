public class AccessLevel {
    public String canAccess(int[] rights, int minPermission) {
        String ret = "";
        for (int k = 0; k < rights.length; k += 1) {
            if (rights[k] >= minPermission) {
                ret+="A";
            } else {
                ret+="D";
            }
        }
        return ret;
    }
}