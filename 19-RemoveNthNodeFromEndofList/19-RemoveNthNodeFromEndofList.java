// Last updated: 9/15/2026, 4:04:03 PM
1class Solution {
2    public ListNode removeNthFromEnd(ListNode head, int n) {
3        if (head.next == null) return null;
4        
5        ListNode ptr = head;
6        ListNode temp = head;
7
8        int i = 1;
9        while (i <= n) {
10            ptr = ptr.next; 
11            i++;
12        }
13
14        if (ptr == null) return head.next;
15
16        while (ptr.next != null) {
17            ptr = ptr.next;
18            temp = temp.next;
19        } 
20
21        if (temp.next != null) {
22            temp.next = temp.next.next;
23        }
24        
25        return head;
26    }
27}