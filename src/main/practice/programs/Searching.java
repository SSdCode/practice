package programs;
// linear search, binary search


import java.util.Scanner;

public class Searching {
    public static void main(String[] args) {

        int array[] = {10, 20, 50, 30, 24, 81, 65, 78, 15, 35};
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no to find : ");
        n = sc.nextInt();

        Searching searching = new Searching();

// ------------------ Linear Search ------------------------
// best - O(1),     worst -  O(n);
//        int index = searching.linearSearch(array, n);
//        if (index == -1) {
//            System.out.println("Cannot find element");
//        } else {
//            System.out.println("Element found at index " + index);
//        }


// ------------------ Binary Search ------------------------
// best - O(1),     worst -  O(log n);
        int index = searching.binarySearch(array, n);
        if (index == -1) {
            System.out.println("\n Cannot find element");
        } else {
            System.out.println("\n Element found at index " + index);
        }
    }

    private int binarySearch(int[] array, int n) {
        // First of all Sort the Array
        int temp, i, j;
        // bubble sort
        for (i = 0; i < array.length; i++) {
            for (j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        // print sorted array
        for (int element : array) {
            System.out.print(element + ", ");
        }


//        binarySearch
        int start = 0, mid, end = array.length - 1;
        while (start <= end) {
            mid = start + (end - start) / 2;
            System.out.print("\n start - " + start + ", mid - " + mid + ", end - " + end);
            if (n == array[mid]) {
                return mid;
            } else if (n > array[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }

    int linearSearch(int[] array, int n) {
        for (int i = 0; i < array.length; i++) {
            if (n == array[i]) {
                return i;
            }
        }
        return -1;
    }
}