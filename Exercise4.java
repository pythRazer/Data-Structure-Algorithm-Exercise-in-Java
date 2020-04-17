/*
 * April 23 2019
 * Exercise4
 * by Lee Jui Chi
 */
public class Exercise4 {

    public static void main(String[] args) {
        Exercise4 ex4 = new Exercise4();
        ex4.fibonacci(10);
    }

    public int[] fibonacci(int n) {
        int[] array = new int[2];
        if(n == 1) {
            array[0] = n;
            array[1] = 0;
        } else {

            int[] temp = new int[2];
            temp = fibonacci(n-1);
            array[0] = temp[0] + temp[1];
            array[1] = temp[0];

        }

        System.out.println("(" + array[0] + ", " + array[1] + ")");

        return array;
    }

}
