public class Job04 {
    public static void main(String[] args) {



        for (int i = 0; i <= 100; i++) {
            boolean a =(0 == (i % 3));
            boolean b =(0 == (i % 5));
        if (a && b) {
              System.out.println(" FizzBuzz " + i);
        }
        else if (a) {
            System.out.println(" Fizz " + i);
        }
        else if (b) {
            System.out.println(" Buzz " + i);
        }
        else {
            System.out.println(i);
        }





        }

    }
}
