public class LinkedList {
    static class Node {
        int data;
        Node next;
        static int size;

        public Node(int data) {
            this.data = data;

        }

        public Node(int data, Node node) {
            this.data = data;
            this.next = node;
        }
    }

    static Node head;
    static Node tail;

    void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            Node.size++;
            return;
        }
        newNode.next = head;
        head = newNode;
        Node.size++;
    }

    void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            Node.size++;
            return;
        }
        tail.next = newNode;
        tail = newNode;
        Node.size++;
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
        System.out.println(Node.size);

    }
}
