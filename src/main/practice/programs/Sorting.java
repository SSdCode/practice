package programs;

// bubble, selection, insertion, merge, quick

import java.util.Scanner;

public class Sorting {
    public static void main(String[] args) {

        int[] array = {55, 20, 50, 30, 24, 81, 65, 78, 15, 35};
        int n;

        Sorting sorting = new Sorting();

//        sorting.bubbleSort(array);      // best - O(n),     worst -  O(n^2);
//        sorting.selectionSort(array);   // best - O(n^2),   worst -  O(n^2);
        sorting.insertionSort(array);   // best - O(n),     worst -  O(n^2);
//        sorting.mergeSort(array);       // best - O(n log n), worst - O(n log n);
//        sorting.quickSort(array);       // best - O(n log n), worst - O(n^2);
    }

    private int binarySearch(int[] array) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No to find: ");
        n = sc.nextInt();
        int left = 0, right = array.length - 1, mid = (array.length - 1) / 2;
        while (left <= right) {
            System.out.println("left -" + left + ", mid -" + mid + ", right -" + right);
            if (n == array[mid]) {
                return mid;
            }
            if (n > array[mid]) {
                left = mid + 1;
                mid = (left + right) / 2;
            }
            if (n < array[mid]) {
                right = mid - 1;
                mid = (left + right) / 2;
            }
        }
        return -1;
    }

    private void bubbleSort(int[] array) {
        int temp, i, j;
        /*
         * It will set the greatest no to end of array and then ignore it in the next loop, like this the array will be sorted in last.
         * */
        for (i = 0; i < array.length - 1; i++) {
            for (j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        printArray(array);
    }

    private void selectionSort(int[] array) {
        /*
         * In the first stem it will compare index 0 number with all the numbers and If no is less then the present no at index 0, it will perform swap
         * in second step it will compare from index 1, after that from index 2  and so on...
         * like this all the smallest numbers will be in their positions one by one and the array will be sorted
         * */
        int temp, i, j, minPos;
        for (i = 0; i < array.length; i++) {
            minPos = i;
            for (j = i + 1; j < array.length; j++) {
                if (array[minPos] > array[j]) {
                    minPos = j;
                }
            }
            temp = array[minPos];
            array[minPos] = array[i];
            array[i] = temp;
        }
        printArray(array);

        int index = binarySearch(array);
        if (index == -1) {
            System.out.println("Cannot find element.");
        } else {
            System.out.println("Num found at index " + index);
        }
    }

    private void insertionSort(int[] array) {
        int j;
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            for (j = i - 1; j >= 0 && current < array[j]; j--) {
                array[j + 1] = array[j];
            }
            array[j + 1] = current;
        }
        printArray(array);
    }

    private void quickSort(int[] array) {

    }

    private void mergeSort(int[] array) {

    }


    private void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + ". ");
        }
        System.out.println();
    }
}