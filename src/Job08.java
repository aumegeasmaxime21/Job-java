public class Job08 {
    public static void main(String[] args) {

        int h = 5;

        for (int j = 0; j <= h; j++) {

            for (int a = 0; a < h - j; a++) {
                System.out.print(" ");
            }
            for (int i = 0; i <= j; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int z = h - 1 ; z >= 0 ; z--) {

            for (int b = 0 ; b < h -  z; b++) {
                System.out.print(" ");
            }
            for (int i = 0; i <= z; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
