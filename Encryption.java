import java.util.*;
public class Encryption {
    public String encrypt(String message){
        String[] ret = new String[message.length()];
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        String[] alphabet = alpha.split("");
        Map<String, String> cipher = new HashMap<String,String>();
        String[] eachLetter = message.split("");
        int alphaCt = 0;
        for (int i = 0 ; i < eachLetter.length ; i++) {
            if (cipher.containsKey(eachLetter[i]) == false) {
                cipher.put(eachLetter[i],alphabet[alphaCt]);
                alphaCt += 1;
            }
        }
        for (int k = 0 ; k < eachLetter.length ; k++) {
            ret[k] = cipher.get(eachLetter[k]);
        }
        return String.join("", ret);
    }
}
