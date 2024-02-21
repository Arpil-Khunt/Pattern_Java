import java.util.ArrayList;

public class array_List {
    public static void main(String args[]) {

        // array list is same as an array but it's use in case where we don't know the
        // size of an array
        // it's not required to initialised the size of an array
        // but in internally the size of an arraylist is fix , whenever the arraylist
        // store more than 50% element at that time create new arraylist size of double
        // to old one , and old one store in new one and old arraylist get delete
        ArrayList<Integer> list = new ArrayList<>();
        list.add(56);
        list.add(25);
        list.add(29);
        list.add(68);
        list.add(100);
        list.add(-85);
        System.out.println(list);
    }
}
