package programs.patterns;

public class PatternStar {
    public static void main(String[] args) {
        /*
         *****
         *****
         *****
         *****
         *****
         * */

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

        /*
         *
         **
         ***
         ****
         *****
         */
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        /*
         *****
         ****
         ***
         **
         *
         * */

        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();


        //Half pyramid pattern

        /*
        1
        12
        123
        1234
        * */

        for (int i = 1; i < 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();


        //Character pattern

        /*
        A
        BC
        DEF
        GHIJ - 65 - 74
        * */
        char ch = 'A';
        for (int j = 0; j < 4; j++) {
            for (int k = 0; k <= j; k++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

        /*
        4444444
        4333334
        4322234
        4321234
        */

        for (int i = 4; i > 0; i--) {
            for (int j = 4; j > 0; j--) {
                System.out.print(i);
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();


        // Hollow Rectangle pattern
        /*
         * * * * *
         *       *
         *       *
         * * * * *
         */
        int noRows = 4, noCols = 5;
        for (int i = 1; i <= noRows; i++) {
            for (int j = 1; j <= noCols; j++) {
                if (i == 1 || i == noRows || j == 1 || j == noCols)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

        // Inverted & rotated half pyramid
        /*

            *
           **
          ***
         ****

         * */
        int no = 4;
        for (int i=1;i<=no;i++){
            for (int j=1;j<=no;j++){
                if (j>no-i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

        // Inverted - half pyramid
        /*

         12345
         1234
         123
         12
         1

         * */
        no=5;
        for (int i = no; i >= 1; i--) {
            for (int j = 1; j <= no; j++) {
                if (j <= i)
                    System.out.print(j);
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();



        // FLOYD's Triangle pattern
        /*

         1
         2 3
         4 5 6
         7 8 9 10
         11 12 13 14 15

         * */

        noRows = 5; no = 1;
        for (int i = 1; i <= noRows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(no+" ");
                no++;
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

// 0-1 triangle pattern
        /*

         1
         01
         101
         0101
         10101

         * */
        int mNo=1;
        for (int i = 1; i <= noRows; i++) {

            for (int j = 1; j <= i; j++) {
                if (j == 1 && i % 2 == 0) {
                    mNo = 0;
                } else if (j == 1) {
                    mNo = 1;
                }
                System.out.print(mNo);
                if (mNo == 0)
                    mNo = 1;
                else
                    mNo = 0;
            }

            System.out.println();
        }
        System.out.println();
        System.out.println();

        // Butterfly pattern
        /*

         *      *
         **    **
         ***  ***
         ********
         */
        no = 8;
        for (int i = 1; i <= no/2; i++) {
            for (int j = 1; j <= no; j++) {
                if (j<=i || j>no-i){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        /*
        ********
        ***  ***
        **    **
        *      *
        */
        for (int i = no / 2; i >= 1; i--) {
            for (int j = 1; j <= no; j++) {
                if (j <= i || j > no - i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

        /*
         *      *
         **    **
         ***  ***
         ********
         ********
         ***  ***
         **    **
         *      *
        * */
        for (int i = 1; i <= no; i++) {
            for (int j = 1; j <= no; j++) {
                if (i <= no / 2) {
                    if (j <= i || j > no - i) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    if (j <= no - i + 1 || j > i-1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();


        // Solid rhombus pattern
        /*
             *****
            *****
           *****
          *****
         *****

         */
        no = 10;
        for (int i = no / 2; i >= 1; i--) {
            for (int j = 1; j <= no; j++) {
//                if (j > i && j <= no - ((no / 2) - i))
                if (j > i && j <= (no / 2) + i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        // Hollow rhombus pattern
        /*

             *****
            *   *
           *   *
          *   *
         *****

         */
        for (int i = no / 2; i >= 1; i--) {
            for (int j = 1; j <= no; j++) {
                if (j > i && j <= (no / 2) + i) {
                    if (i == 1 || i == no / 2 || (i + 1) == j || i + (no / 2) == j)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

//5,6   4,5   3,4 s
//5,7   4,6   3,5 ds
//5,10  4,9   3,8 s

        System.out.println();
        System.out.println();
        // Diamond pattern

        /*

           *
          ***
         *****
        *******
         *****
          ***
           *

         * */
        no=8;
        for (int i = 1; i <= no/2; i++) {
            for (int j = 1; j <= no; j++) {
                if (j > (no / 2) - i && j < (no / 2) + i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        for (int i = 1; i <=no/2; i++) {
            for (int j = 1; j <= no; j++) {
                if (j>=i && j<= no-i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        //Number pyramid pattern

        /*
            1
           2 2
          3 3 3
         4 4 4 4
        5 5 5 5 5

        * */
        no = 10;
        for (int i = 1; i <= no / 2; i++) {

            for (int k = 1; k <= no - (i + no / 2); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }

            System.out.println();
        }


        // Palindromic pattern

        /*

            1
           212
          32123
         4321234
        543212345

        */


    }
}
