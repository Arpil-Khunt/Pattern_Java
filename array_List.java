import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class array_List {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

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

        // multiDimensional arraylist
        ArrayList<ArrayList<Integer>> list1 = new ArrayList<>();

        // initialisation
        for (int i = 0; i < 3; i++) {
            list1.add(new ArrayList<>());
        }

        System.out.println("Add an element");
        // add element in arraylist
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list1.get(i).add(sc.nextInt());
            }
            System.out.println();
        }
        // print element from arraylist
        System.out.println(list1);
    }
}
