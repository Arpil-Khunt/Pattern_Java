public class Diamond {
    public static void main(String args[]) {
        // add new line
        for (int i = 1; i <= 7; i++) {
            // Space print
            for (int k = 7; k > i; k--) {
                System.out.print(" ");
            }
            // star print
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // reverse the upperPart
        for (int i = 6; i >= 1; i--) {
            // Space print
            for (int k = 7; k > i; k--) {
                System.out.print(" ");
            }
            // star print
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}