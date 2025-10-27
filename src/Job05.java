public class Job05 {
    public static void main(String[] args) {

        for (int i = 1; i <= 1000; i++) {

            double sqrt = Math. sqrt(i);
            boolean a =(0 == (sqrt % sqrt));
            boolean b =(1 == (sqrt % 2));

            if (a && b) {
                System.out.println(i);
            }













        }
    }
}
