public class DoublyLinkedList {
    class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    Node head;
    Node tail;

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

    void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        }

        newNode.prev = tail;
        tail.next = newNode;
        tail = newNode;
    }

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
        ll.addFirst(53);
        ll.addFirst(52);
        ll.addLast(57);
        ll.addLast(58);
        ll.ForwardPrintLL();
        ll.ReversePrintLL();
    }
}
