class Solution {
    Node reverse(Node head) {
        if (head == null || head.next == head) {
            return head; 
        }

        Node prev = null;
        Node current = head;
        Node next = null;
        Node tail = head;


        do {
            next = current.next;
            current.next = prev; 
            prev = current;
            current = next;
        } while (current != head); 
        head.next = prev; 
        head = prev; 

        return head;
    }

    Node deleteNode(Node head, int key) {
        if (head == null) {
            return null;
        }

        if (head.data == key) {
            if (head.next == head) {
                return null; 
            }

            Node last = head;
            while (last.next != head) {
                last = last.next;
            }

            head = head.next;
            last.next = head;
            return head;
        }

        Node current = head;
        Node prev = null;

        do {
            prev = current;
            current = current.next;

            if (current.data == key) {
                prev.next = current.next; 
                return head;
            }

        } while (current != head);


        return head;
    }
}
