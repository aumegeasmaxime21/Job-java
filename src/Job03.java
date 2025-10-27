public class Job03 {
    public static void main(String[] args) {

        for (int i = 0; i <= 100; i++) {

            if (0 < i && i <= 20) {
                System.out.println("_" + i + "_");
            }
            else if (i == 42) {
                System.out.println("Laplateforme_");
            }

            else if (25 <= i && i <= 50) {
                System.out.println("__" + i + "__");
            }
            else {
                System.out.println(i);
            }

        }

    }
}
