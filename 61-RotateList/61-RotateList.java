// Last updated: 9/15/2026, 4:12:56 PM
1class Solution {
2    public ListNode rotateRight(ListNode head, int k) {
3        if (head == null || head.next == null || k == 0) {
4            return head;
5        }
6
7    
8        int n = 1;
9        ListNode tail = head;
10        while (tail.next != null) {
11            tail = tail.next;
12            n++;
13        }
14
15        k = k % n;
16        if (k == 0) {
17            return head;
18        }
19
20       
21        tail.next = head;
22
23       
24        int steps = n - k;
25        ListNode newTail = head;
26        for (int i = 1; i < steps; i++) {
27            newTail = newTail.next;
28        }
29
30      
31        ListNode newHead = newTail.next;
32        newTail.next = null;
33
34        return newHead;
35    }
36}