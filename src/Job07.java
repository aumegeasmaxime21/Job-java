public class Job07 {
    public static void main(String[] args) {

// methode 1
/*
        int b = 5;

        for (int j = 0; j <= b; j++) {

            for (int a = 0; a < b - j; a++) {
                System.out.print(" ");
            }
            for (int i = 0; i <= j; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
*/
    int a = 0;
    int hauteur = 5;

    for (int i = 0; i <= hauteur ; i++) {

        for (int vide = 0; vide < hauteur - i; vide++) {
            System.out.print(" ");
        }
        for (int etoile = 0; etoile <= i; etoile++) {


            System.out.print("* ");
        }





        System.out.println();
    }








    }
}








