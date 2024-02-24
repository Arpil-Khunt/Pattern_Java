public class LinkedList {
    int size;

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            size++;
        }

        public Node(int data, Node node) {
            this.data = data;
            this.next = node;
            size++;
        }
    }

    static Node head;
    static Node tail;

    void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;

            return;
        }
        newNode.next = head;
        head = newNode;

    }

    void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;

            return;
        }
        tail.next = newNode;
        tail = newNode;

    }

    void addIndex(int data, int index) {
        if (head == null) {
            addFirst(data);
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node newNode = new Node(data, temp.next);
        temp.next = newNode;

    }

    // deletion at first

    public void deletionFirst() {
        head = head.next;
        size--;
    }

    // deletion at any index
    public void deletionAtIndex(int index) {
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node temp1 = temp.next;

        temp.next = temp1.next;
        size--;
    }

    // deletion at end
    public void deletionLast() {
        Node temp = head;
        Node temp1 = temp;
        Node temp2 = temp1;
        while (temp != null) {
            temp2 = temp1;
            temp1 = temp;
            temp = temp.next;
        }

        // temp = temp2;
        // temp.next = null;
        temp2.next = null;
        size--;

    }

    void print() {
        if (head == null) {
            System.out.println("LL is emppty");
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");

    }

    public static void main(String args[]) {

        LinkedList ll = new LinkedList();
        ll.addFirst(45);
        ll.addFirst(46);
        ll.addFirst(47);
        ll.addFirst(48);
        ll.addFirst(49);
        ll.addLast(44);
        ll.addLast(43);
        ll.addIndex(50, 3);
        ll.print();
        System.out.println(ll.size);
        ll.deletionFirst();
        ll.print();
        System.out.println(ll.size);
        ll.deletionAtIndex(3);
        ll.print();
        System.out.println(ll.size);
        ll.deletionLast();
        ll.print();
        System.out.println(ll.size);

    }
}
