

// bubble, selection, insertion, merge, quick

public class Sorting {
    public static void main(String[] args) {

        int array[] = {10, 20, 50, 30, 24, 81, 65, 78, 15, 35};
        int n;

        Sorting sorting = new Sorting();

        sorting.bubbleSort(array);      // best - O(n),     worst -  O(n^2);
        sorting.selectionSort(array);   // best - O(n^2),   worst -  O(n^2);
        sorting.insertionSort(array);   // best - O(n),     worst -  O(n^2);
        sorting.mergeSort(array);       // best - O(n log n), worst - O(n log n);
        sorting.quickSort(array);       // best - O(n log n), worst - O(n^2);
    }

    private void quickSort(int[] array) {

    }

    private void mergeSort(int[] array) {

    }

    private void insertionSort(int[] array) {

    }

    private void selectionSort(int[] array) {
    }

    private void bubbleSort(int[] array) {
        int temp, i, j;
        for (i = 0; i < array.length; i++) {
            for (j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        printArray(array);
    }

    private void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + ", ");
        }
    }
}