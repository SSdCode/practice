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
        int noRows = 4, noCols=5;
        for (int i = 1; i <= noRows; i++) {
            for (int j = 1; j <= noCols; j++) {
                if (i == 1 || i == noRows || j == 1 || j == noCols)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
