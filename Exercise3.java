/*
 * April 23 2019
 * Exercise3
 * by Lee Jui Chi
 */
public class Exercise3 {

    int a;


    public static void main(String[] args) {
        Exercise3 ex3 = new Exercise3();

        ex3.factorial(10);
    }

    public int factorial(int n) {
        if (n == 0) {
            System.out.println(1);

            return 1;
        } else {

            a = n * factorial(n-1);

            System.out.println(a);

            return a;



            }

        }
    }


