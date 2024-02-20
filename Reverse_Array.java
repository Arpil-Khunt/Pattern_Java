import java.util.Arrays;

public class Reverse_Array {
    public static void main(String args[]) {
        int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int arr1[] = { 1, 2, 3, 4, 5 };

        // print an array using for loop
        // for (int i = 0; i < arr.length; i++) {
        // for (int j = 0; j < arr[i].length; j++) {

        // System.out.print(arr[i][j] + " ");
        // }
        // System.out.println();
        // }

        // print an array using for-each loop

        for (int a : arr1) {
            System.out.print(a + " ");

        }
        System.out.println();

        // print an array using toString method
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}