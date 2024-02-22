public class Hollow_Triangle {

    public static void main(String args[]) {
        int x = 0;
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
    }
}
