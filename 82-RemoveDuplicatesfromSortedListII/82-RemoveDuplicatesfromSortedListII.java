// Last updated: 9/15/2026, 4:14:21 PM
1class Solution {
2    public ListNode deleteDuplicates(ListNode head) {
3        if (head == null || head.next == null) return head;
4
5        ListNode dummy = new ListNode(-1); 
6        dummy.next = head;
7        ListNode prev = dummy;
8        ListNode cur = head;
9
10        while (cur != null && cur.next != null) {
11            if (cur.val == cur.next.val) {
12                while (cur.next != null && cur.val == cur.next.val) {
13                    cur = cur.next;
14                }
15                prev.next = cur.next; 
16            } else {
17                prev = prev.next; 
18            }
19            cur = cur.next;
20        }
21
22        return dummy.next;
23    }
24}