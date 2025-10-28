public class Job05 {
    public static void main(String[] args) {

        for (int a = 1; a <= 1000; a++) {

                boolean isPrime = true;
                for (int i = 2; i < a; i++) {
                    if (a % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    System.out.println(a);
                }











        }
    }
}
