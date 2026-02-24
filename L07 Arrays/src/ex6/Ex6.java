package ex6;

import java.util.Arrays;

public class Ex6 {
    void main() {
        int[] arr1 = {1, 4, 9, 16, 25};
        IO.println("arr1 = " + Arrays.toString(arr1));
        int[] arr2 = {2, 5, 8, 5};
        IO.println("arr2 = " + Arrays.toString(arr2));
        int[] arr3 = {2, 5, 8, 6};
        IO.println("arr3 = " + Arrays.toString(arr3));

        IO.println("Second highest in arr1: " + secondHighest(arr1));
        IO.println("Second highest in arr2: " + secondHighest(arr2));
        IO.println("Second highest in arr3: " + secondHighest(arr3));
        IO.println("arr1 is sorted ascending: " + isSortedAscending(arr1));
        IO.println("arr2 is sorted ascending: " + isSortedAscending(arr2));
        IO.println("arr3 is sorted ascending: " + isSortedAscending(arr3));
        shiftRight(arr1);
        IO.println("arr1 after shift right: " + Arrays.toString(arr1));
        IO.println("arr2 has doublets: " + hasDoublets(arr2));
        IO.println("arr3 has doublets: " + hasDoublets(arr3));

        swapFirstLast(arr1);
        IO.println("arr1 after swap of first and last: " + Arrays.toString(arr1));
        zeroEvensOut(arr1);
        IO.println("arr1 after even numbers replaced by 0: " + Arrays.toString(arr1));
    }

    public static void zeroEvensOut(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)
                arr[i] = 0;
        }
    }

    // pre: arr.length >= 1
    public static void swapFirstLast(int[] arr) {
        int temp = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;
    }

    public static boolean isSortedAscending(int[] arr) {
        int i = 1;
        while (i < arr.length) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
            i++;
        }
        return true;
    }

    // pre: arr.length >= 1
    public static void shiftRight(int[] arr) {
        int temp = arr[arr.length - 1];
        for (int i = arr.length - 1; i >= 1; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;
    }

    // pre: arr.length >= 2
    public static int secondHighest(int[] arr) {
        int highest = Math.max(arr[0], arr[1]);
        int secondHighest = Math.min(arr[0], arr[1]);
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] > highest) {
                secondHighest = highest;
                highest = arr[i];
            } else if (arr[i] > secondHighest) {
                secondHighest = arr[i];
            }
        }
        return secondHighest;
    }

    // pre: arr.length >= 2
    public static boolean hasDoublets(int[] arr) {
        int i = 0;
        while (i < arr.length - 1) {
            int j = i + 1;
            while (j < arr.length) {
                if (arr[i] == arr[j]) return true;
                j++;
            }
            i++;
        }
        return false;
    }
}
