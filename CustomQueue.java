public class CustomQueue {
    // create Queue using only end, using Circular Queue concept
    protected int[] data;
    private final static int DEFAULT_SIZE = 10;

    // concept of queue is, insert data at the end of the queue and delete data from
    // the front of the queue
    protected int end = 0;

    public CustomQueue() {
        this(DEFAULT_SIZE);
    }

    public CustomQueue(int size) {
        this.data = new int[size];
    }

    public boolean isFull() {
        return end == data.length;
    }

    public boolean isEmpty() {
        return end == 0;
    }

    public boolean insert(int item) {
        if (isFull()) {
            System.out.println("FULL!!");
            return false;
        }
        data[end++] = item;
        return true;
    }

    public int remove() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is Empty!!");
        }
        int removed = data[0];
        // swap data
        for (int i = 1; i < end; i++) {
            data[i - 1] = data[i];
        }

        return removed;
    }

    public int front() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is Empty!!");
        }
        return data[0];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("EMPTY!!");
            return;
        }
        for (int i = 0; i < end; i++) {
            System.out.print(data[i] + "->");
        }
        System.out.println("END");
    }

    public static void main(String args[]) throws Exception {
        CustomQueue queue = new CustomQueue(5);
        queue.insert(62);
        queue.insert(60);
        queue.insert(58);
        queue.insert(56);
        queue.insert(52);
        queue.insert(50);
        queue.display();
        System.out.println("Front : " + queue.front());
        System.out.println("Removed : " + queue.remove());
        System.out.println("Front : " + queue.front());
    }
}
