public class ListsEqual {
    public int equal (ListNode a1, ListNode a2) {
        ListNode temp1 = a1;
        ListNode temp2 = a2;
        // same length?
        int length1 = 0;
        while (temp1 != null) {
            length1 += 1;
            temp1 = temp1.next;
        }
        int length2 = 0;
        while (temp2 != null) {
            length2 += 1;
            temp2 = temp2.next;
        }
        if (length1 != length2)
            return 0;
        // same contents?
        for (int i = 0;i < length1; i++) {
            int content1 = 0;
            int content2 = 0;
            if (a1 != null) {
                a1.info = content1;
            }
            if(a2 != null) {
                a2.info = content2;
            }
            if (content1 != content2)
                return 0;
            a1 = a1.next;
            a2 = a2.next;
        }
        return 1;
    }
}