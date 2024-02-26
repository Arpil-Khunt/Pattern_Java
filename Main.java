public class Main {

    public static void main(String args[]) {
        CustomStack stack = new CustomStack(5);
        stack.push(55);
        stack.push(56);
        stack.push(57);
        stack.push(58);
        stack.push(59);
        stack.push(60);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        // stack.pop();
    }

}

class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int ptr = -1;

    public CustomStack() {
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size) {
        this.data = new int[size];
    }

    public boolean push(int value) {
        if (isFull()) {
            System.out.println("Stack is Full!!");
            return false;
        }
        data[++ptr] = value;
        return true;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Can't pop from an empty stack!!");
            return -1;
        }
        return data[ptr--];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty!!");
            return -1;
        }
        return data[ptr];
    }

    public boolean isFull() {
        return ptr == data.length - 1;
    }

    public boolean isEmpty() {
        return ptr == -1;
    }
}