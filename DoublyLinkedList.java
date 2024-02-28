public class DoublyLinkedList {
    int size;

    class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
            size++;
        }

        Node(int data, Node prev) {
            this.data = data;
            this.prev = prev;
        }

        Node(Node next, int data) {
            this.data = data;
            this.next = next;
        }

        Node(int data, Node prev, Node next) {
            this.data = data;
            this.prev = prev;
            this.next = next;
        }
    }

    Node head;
    Node tail;

    // Insert at First
    void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // Insert at Last
    void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        }

        newNode.prev = tail;
        tail.next = newNode;
        tail = newNode;
    }

    // Insert at any Index
    public void addAtIndex(int data, int Index) {

        if (head.next == null || Index == 0) {
            addFirst(data);
            return;
        }
        Node temp = head;
        for (int i = 1; i < Index; i++) {
            temp = temp.next;
        }
        Node temp1 = temp.next;
        Node newNode = new Node(data, temp, temp1);
        temp1.prev = newNode;
        temp.next = newNode;

    }

    // Print Forward LinkedList
    void ForwardPrintLL() {
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");

    }

    // deletion at First
    public void deletionFirst() {
        if (head == null) {
            return;
        }
        if (head.next == null) {
            head = tail = null;
            return;
        }

        head = head.next;
        head.prev = null;
    }

    // deletion from Last
    public void deletionLast() {
        if (head == null) {
            return;
        }
        if (head.next == null) {
            head = tail = null;
            return;
        }
        Node temp = head;
        Node temp1 = temp;
        while (temp.next != null) {
            temp1 = temp;
            temp = temp.next;
        }
        temp1.next = null;
    }

    // deletion at any Index

    public void deletionAtIndex(int Index) {
        if (Index == 0) {
            deletionFirst();
            return;
        }
        Node temp = head;
        for (int i = 1; i < Index; i++) {
            temp = temp.next;
        }

        Node temp1 = temp.next;
        if (temp1.next == null) {
            deletionLast();
            return;
        }
        Node temp2 = temp1.next;
        temp2.prev = temp;
        temp.next = temp2;
    }

    // Print Backward LinkedList
    void ReversePrintLL() {
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.prev;
        }
        System.out.println("null");
    }

    public static void main(String args[]) {
        DoublyLinkedList ll = new DoublyLinkedList();
        ll.addFirst(56);
        ll.addFirst(55);
        ll.addLast(58);
        ll.addAtIndex(54, 0);
        ll.addAtIndex(57, 3);
        ll.deletionFirst();
        ll.ForwardPrintLL();
        // ll.ReversePrintLL();
        System.out.println("deletion from last");
        ll.deletionLast();
        ll.ForwardPrintLL();
        System.out.println("deletion from at any index");
        ll.deletionAtIndex(2);
        ll.deletionAtIndex(1);
        ll.deletionAtIndex(0);
        ll.deletionFirst();
        ll.ForwardPrintLL();
    }
}
