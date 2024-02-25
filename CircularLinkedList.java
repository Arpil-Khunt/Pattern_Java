public class CircularLinkedList {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    Node head;
    Node tail;

    void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.next = head;
        tail = newNode;
    }

    void delete(int value) {
        Node temp = head;
        if (head == null) {
            return;
        }
        if (head.data == value) {
            head = head.next;
            tail.next = head;
            return;
        }
        do {
            Node n = temp.next;
            if (n.data == value) {
                temp.next = n.next;
                return;
            }
            temp = temp.next;
        } while (temp != head);

        System.out.println("Value is not in LinkedList!!");
    }

    void display() {
        if (head == null) {
            System.out.println("CLL is empty!");
            return;
        }
        Node temp = head;
        do {
            System.out.print(temp.data + "->");
            temp = temp.next;
        } while (temp != head);
        System.out.println("START");
    }

    public static void main(String args[]) {
        CircularLinkedList list = new CircularLinkedList();
        list.insert(55);
        list.insert(56);
        list.insert(57);
        list.insert(58);
        list.insert(59);
        list.display();
        list.delete(56);
        list.display();
    }
}
