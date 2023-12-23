package programs;

import java.util.Scanner;

public class ProgramList {
    public static void main(String[] args) {

        Programs programs = new Programs();

        System.out.print("Choose program from the list" +
                "\n 1. Sum of two numbers" +
                "\n 2. Factorial of a number" +
                "\n 3. prime number" +
                "\n 4. palindrome" +
                "\n 5. fibonacci series" +
                "\n :");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                programs.sum(10, 20);
                break;
            case 2:
                programs.factorial();
                break;
            case 3:
                if (programs.isPrime()) {
                    System.out.println("Number is prime.");
                } else {
                    System.out.println("Number is not prime.");
                }
                break;
            case 4:
                programs.isPalindrome();
                break;
            case 5:
                programs.printFibo(10);
                break;
            default:
                System.out.println("Enter correct choice.");
        }
    }
}
