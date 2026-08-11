// Last updated: 8/11/2026, 9:56:54 PM
class MyLinkedList {

    class Node {
        int val;
        Node next;
        Node(int v) { val = v; }
    }

    Node head;

    public MyLinkedList() {}

    public int get(int index) {
        Node t = head;
        for (int i = 0; t != null; i++, t = t.next)
            if (i == index) return t.val;
        return -1;
    }

    public void addAtHead(int val) {
        Node n = new Node(val);
        n.next = head;
        head = n;
    }

    public void addAtTail(int val) {
        Node n = new Node(val);
        if (head == null) {
            head = n;
            return;
        }
        Node t = head;
        while (t.next != null) t = t.next;
        t.next = n;
    }

    public void addAtIndex(int index, int val) {
        if (index == 0) {
            addAtHead(val);
            return;
        }
        Node t = head;
        for (int i = 0; t != null; i++, t = t.next) {
            if (i == index - 1) {
                Node n = new Node(val);
                n.next = t.next;
                t.next = n;
                return;
            }
        }
    }

    public void deleteAtIndex(int index) {
        if (head == null) return;
        if (index == 0) {
            head = head.next;
            return;
        }
        Node t = head;
        for (int i = 0; t.next != null; i++, t = t.next) {
            if (i == index - 1) {
                t.next = t.next.next;
                return;
            }
        }
    }
}