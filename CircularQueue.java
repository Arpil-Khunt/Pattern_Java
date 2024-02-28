public class CircularQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    protected int front = 0;
    protected int end = 0;
    int size = 0;

    public CircularQueue() {
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int size) {
        this.data = new int[size];
    }

    public boolean insert(int item) {
        if (isFull()) {
            System.out.println("Queue is Full, data is not added: " + item);
            return false;
        }
        data[end++] = item;
        end = end % data.length;
        size++;
        return true;
    }

    public int remove() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty!!");
        }
        int removed = data[front++];
        front = front % data.length;
        size--;
        return removed;
    }

    public int front() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is Empty!!");
        }
        return data[front];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("EMPTY!");
            return;
        }
        int i = front;
        do {
            System.out.print(data[i++] + "->");
            i %= data.length;
        } while (i != end);
        System.out.println("END");
    }

    public boolean isFull() {
        return size == data.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public static void main(String args[]) throws Exception {

        DynamicCircularQueue queue = new DynamicCircularQueue(5);
        // CircularQueue queue = new CircularQueue(5);
        queue.insert(5);
        queue.insert(6);
        queue.insert(7);
        queue.insert(8);
        queue.insert(9);
        queue.insert(10);
        queue.display();
        System.out.println("data is removed: " + queue.remove());
        queue.display();
    }
}

class DynamicCircularQueue extends CircularQueue {
    public DynamicCircularQueue() {
        super();
    }

    public DynamicCircularQueue(int size) {
        super(size);
    }

    @Override
    public boolean insert(int item) {
        if (this.isFull()) {
            // create a array double size of previous
            int[] temp = new int[data.length * 2];

            // copy item from previous array
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[(front + i) % data.length];
            }
            front = 0;
            end = data.length;
            data = temp;
        }
        return super.insert(item);
    }
}