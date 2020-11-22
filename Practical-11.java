public class Largest {

    public static void main(String[] args) {

        double a = -6.2, b = 9.5, c = 5;

        if( a >= b && a >= c)
            System.out.println(a + " is the largest number.");

        else if (b >= a && b >= c)
            System.out.println(b + " is the largest number.");

        else
            System.out.println(c + " is the largest number.");
    }
