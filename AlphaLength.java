import java.util.*;
public class AlphaLength {
    public ListNode create (String[] words) {
        TreeSet<String> wordList = new TreeSet<>();
        for (String s : words) {
            wordList.add(s);
        }
        TreeSet<String> rev = (TreeSet<String>)wordList.descendingSet();
        ListNode list = new ListNode(0,null);
        for (String s : rev) {
            list.next = new ListNode(s.length(),list.next);
        }
        ListNode ret = list.next;
        return ret;
    }
}