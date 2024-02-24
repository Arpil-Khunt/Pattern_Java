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
        ll.ForwardPrintLL();
        ll.ReversePrintLL();

    }
}
