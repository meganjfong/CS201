public class CounterAttackNotWorking {
    public int[] analyze(String str, String[] words) {
        String[] spltStr = str.split(" ");
        int[] ret = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            for (int k = 0; k < spltStr.length; k++) {
                if (spltStr[k] == words[i]) {
                    ret[i] += 1;
                }
            }
        }
        return ret;
    }
}