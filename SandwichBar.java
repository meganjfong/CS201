import java.util.*;

public class SandwichBar {
    private boolean canMake(String order, String[] avail) {
        boolean ans = true;
        String[] eachIngred = order.split(" ");
        // make each ingred into an arrayList
        ArrayList<String> eachIngredArray = new ArrayList<String>(Arrays.asList(eachIngred));
        ArrayList<String> availArray = new ArrayList<String>(Arrays.asList(avail));
        for (int idx = 0; idx < eachIngred.length; ++idx) {
            if (availArray.contains(eachIngred[idx]) == true) {
                ans = true;
            }
            else {
                ans = false;
                break;
            }
        }
        return ans;
    }
    public int whichOrder(String[] available, String[] orders){
        for (int i = 0; i < orders.length; ++i) {
            if (canMake(orders[i],available)) {
                return i;
            }
        }
        return -1;
    }
}
