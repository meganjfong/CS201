public class ListCount {
    public int count (ListNode list) {
        int num = 0;
        while (list != null) {
            num += 1;
            list = list.next;
        }
        return num;
    }

}


