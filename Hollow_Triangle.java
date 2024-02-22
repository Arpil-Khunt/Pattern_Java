public class Hollow_Triangle {

    public static void main(String args[]) {

        for (int i = 0; i < 5; i++) {
            for (int k = 4; k > i; k--) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 0; j < (2 * i) - 1; j++) {
                if (i != 4) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            if (i == 0) {
                System.out.println();
            } else {
                System.out.println("*");
            }

        }
        // inverted hollow triangle
        for (int i = 5; i > 0; i--) {
            // space add begin
            for (int k = 4; k >= i; k--) {
                System.out.print(" ");
            }
            System.out.print("*");
            // space add in between star
            for (int j = 0; j < (2 * i) - 3; j++) {
                if (i != 5) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            if (i == 1) {
                System.out.println();
            } else {
                System.out.println("*");
            }

        }
    }
}
