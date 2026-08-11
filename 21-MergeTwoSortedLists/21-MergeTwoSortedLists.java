// Last updated: 8/11/2026, 10:10:24 PM
class Solution {
    public ListNode mergeTwoLists(ListNode a, ListNode b) {
        ListNode d = new ListNode(), t = d;

        while (a != null && b != null) {
            if (a.val < b.val) {
                t.next = a;
                a = a.next;
            } else {
                t.next = b;
                b = b.next;
            }
            t = t.next;
        }

        t.next = (a != null) ? a : b;
        return d.next;
    }
}