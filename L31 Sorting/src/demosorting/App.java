package demosorting;

import java.util.Arrays;

public class App {
    void main() {
        int[] numbers1 = {11, 3, 2, 5, 17, 9, 30, 15, 2, 4, 11, 10};
        IO.println("Unsorted:");
        IO.println(Arrays.toString(numbers1));

        bubbleSort(numbers1);

        IO.println("Sorted with bubble sort:");
        IO.println(Arrays.toString(numbers1));
        IO.println();

        //-------------------------------------------------

        int[] numbers2 = {11, 3, 2, 5, 17, 9, 30, 15, 2, 4, 11, 10};
        IO.println("Unsorted:");
        IO.println(Arrays.toString(numbers2));

        selectionSort(numbers2);

        IO.println("Sorted with selection sort:");
        IO.println(Arrays.toString(numbers2));
        IO.println();

        //-------------------------------------------------

        int[] numbers3 = {11, 3, 2, 5, 17, 9, 30, 15, 2, 4, 11, 10};
        IO.println("Unsorted:");
        IO.println(Arrays.toString(numbers3));

        insertionSort(numbers3);

        IO.println("Sorted with insertion sort:");
        IO.println(Arrays.toString(numbers3));
        IO.println();
    }

    public static void bubbleSort(int[] arr) {
        // arr has an unsorted part followed by a sorted part,
        // the unsorted part is at index 0..i
        boolean swapped = true;
        for (int i = arr.length - 1; i > 0 && swapped; i--) {
            swapped = false;
            // bubble the largest value in the unsorted part up to index i
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
        }
    }

    public static void selectionSort(int[] arr) {
        // arr has a sorted part followed by an unsorted part,
        // the unsorted part is at index i..arr.length-1
        for (int i = 0; i < arr.length - 1; i++) {
            // find the index of the smallest number in unsorted part
            int indexOfMin = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[indexOfMin]) {
                    indexOfMin = j;
                }
            }
            // swap arr[indexOfMin] and arr[i]
            if (indexOfMin != i) {
                int temp = arr[i];
                arr[i] = arr[indexOfMin];
                arr[indexOfMin] = temp;
            }
        }
    }

    public static void insertionSort(int[] arr) {
        // arr has a sorted part followed by an unsorted part,
        // the unsorted part is at index i..arr.length-1
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            // move values larger than temp in the sorted part up one position,
            // which will create a free position for temp
            int j = i;
            while (j > 0 && temp < arr[j - 1]) {
                arr[j] = arr[j - 1];
                j--;
            }
            // insert temp at the free position
            arr[j] = temp;
        }
    }
}
