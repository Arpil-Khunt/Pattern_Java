import java.util.Arrays;

public class CustomGenArrayList<T> {

    private Object[] data;
    private static final int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomGenArrayList() {
        this.data = new Object[DEFAULT_SIZE];
    }

    public boolean add(T item) {
        if (isFull()) {
            resize();
        }
        data[size++] = item;
        return true;
    }

    public boolean isFull() {
        return size == data.length;
    }

    public void resize() {
        // create an array double to the current
        Object[] temp = new Object[data.length * 2];
        // copy current item in temp
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    // get thing only that is store in ArrayList
    public T get(int index) {
        return (T) (data[index]);
    }

    public T remove() {
        return (T) (data[--size]);
    }

    // set means : item override at existing position
    public void set(int index, int item) {
        data[index] = item;
    }

    // display

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

}

class Main_Arraylist {

    public static void main(String args[]) {

        // let's i wanna to add String type data in CustomArrayList then it's give an
        // error because it's
        // CustomArraylist only for int type data,
        // but we know that java provide collection framework on that arraylist we can
        // store any type of data
        // how that possible , it's possible using generics
        // means : parameterised type, it's contain only class not primitive

        CustomGenArrayList<String> list1 = new CustomGenArrayList<>();
        list1.add("arpil");
        list1.add("deep");
        list1.add("sujal");
        System.out.println(list1);

        // ArrayList<Integer> list2 = new ArrayList<>();
        // list2.add(55);
        // System.out.println(list2.get(0));

    }
}
