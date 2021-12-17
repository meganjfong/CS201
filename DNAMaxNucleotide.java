public class DNAMaxNucleotide {
    public String max(String[] strands, String nuc) {
        String ret = "";
        int maxCt = 0;
        for (int i = 0; i < strands.length; ++i) {
            int nucCt = 0;
            String[] spltStrand = strands[i].split("");
            for (int idx = 0; idx < spltStrand.length; ++idx) {
                if (spltStrand[idx].equals(nuc)) {
                    nucCt += 1;
                }
            }
            if (nucCt > maxCt) {
                ret = strands[i];
                maxCt = nucCt;
            }
            if (nucCt == maxCt && maxCt != 0) {
                if (strands[i].length() > ret.length()) {
                    ret = strands[i];
                }

            }
        }
        return ret;
    }
}
