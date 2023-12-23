package programs;

import java.util.Scanner;

public class Programs {
    Scanner sc = new Scanner(System.in);

    public int sum(int a, int b) {
        return a + b;
    }

    int factNext(int no) {
        if (no == 1) return 1;

        return no * factNext(no - 1);
    }

    public void factorial() {
        int no, fact = 1;
        System.out.println("Enter No to find Factorial: ");
        no = sc.nextInt();
//        for (int i = 1; i <= no; i++) {
//            fact = fact * i;
//        }
        System.out.println("The factorial of " + no + " is " + factNext(no));
    }

    public boolean isPrime() {
        int no, i = 2;
        System.out.println("Enter No to check prime or not: ");
        no = sc.nextInt();
        while (i > 1 && i < no / 2) {
            if (no % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }

    public void isPalindrome() {
        System.out.print("Enter a string: ");
        String str1 = sc.nextLine();

        if (str1.contentEquals(new StringBuilder(str1).reverse())) {
            System.out.println("String is palindrome.");
        } else {
            System.out.println("String is not palindrome.");
        }
    }

    public void printFibo(int no) {
        // 1, 1, 2, 3, 5, 8, 13
        System.out.print("0, 1");
        int i = 1, no1 = 1, no2 = 1, no3;
        while (i < no - 1) {
            no3 = no1 + no2;
            System.out.print(", " + no3);
            no1 = no2;
            no2 = no3;
            i++;
        }
    }
}
