import java.util.ArrayList;

public class TxMsg {
    public String getMessage(String original) {
        String vowels = "aeiou";
        String ret = "";
        ArrayList<String> splt = new ArrayList<>();
        for(String i : original.split(" ")){
            splt.add(i);
        }
        for(String word: splt){
            String temp = "";
            for (int i = 0; i < word.length(); i++){
                char cha = word.charAt(i);
                if(i>0 && vowels.indexOf(cha) <0 && vowels.indexOf(word.charAt(i-1)) <0){
                    continue;
                }else if (vowels.indexOf(cha) <0){
                    temp+= cha;
                }
            }
            if(temp.equals("")) {
                ret += word + " ";
            }else{
                ret+= temp + " ";
            }
        }
        return ret.trim();
    }
}
