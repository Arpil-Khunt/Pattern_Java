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

        // for (int[] a : arr) {
        // System.out.println(Arrays.toString(a));

        // }
        // System.out.println();

        // before swaping
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();

        reverse(arr1);

        // print an array using toString method
        // for (int i = 0; i < arr.length; i++) {
        // System.out.println(Arrays.toString(arr[i]));
        // }

        // after the swaping

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
    }

    static void reverse(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        while (end > start) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    static void swap(int arr[], int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
