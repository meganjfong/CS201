public class SoccerLeagues {
    public int[] points(String[] matches) {
        int[] ret = new int[matches.length];
        for (int i = 0; i < matches.length; i++) {
            String[] eachMatch = matches[i].split("");
            for (int j = 0; j < eachMatch.length; j++) {
                if (eachMatch[j].equals("W")) {
                    ret[i] += 3;
                }
                if (eachMatch[j].equals("L")) {
                    ret[j] += 3;
                }
                if (eachMatch[j].equals("D")) {
                    ret[i] += 1;
                    ret[j] += 1;
                }
            }
        }
        return ret;
    }
}