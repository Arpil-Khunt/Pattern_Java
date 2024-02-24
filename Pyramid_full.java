public class Pyramid_full {

    /*
        * * * * *
         * * * *
          * * *
           * *
            *
            *
           * *
          * * *
         * * * *
        * * * * * 
          
     */

    public static void main(String args[]) {
        // print above pattern

        // above part

        for (int i = 0; i < 5; i++) {

            // give space
            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            }
            // star print
            for (int j = 5; j > i; j--) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }

        // below part

        for (int i = 5; i > 0; i--) {

            // give space
            for (int k = 1; k < i; k++) {
                System.out.print(" ");
            }
            // star print
            for (int j = 5; j >= i; j--) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
