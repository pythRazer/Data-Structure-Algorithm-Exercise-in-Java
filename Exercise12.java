/*
 * May 14 2019
 * Exercise12
 * by Lee Jui Chi
 */

import java.util.ArrayDeque;

public class Exercise12 {

    ArrayDeque<String> queue = new ArrayDeque<String>();

    public static void main(String[] args) {
        Exercise12 ex12 = new Exercise12();
        ex12.queueTest();
    }

    public void queueTest() {
        queue.addLast("AA");
        queue.addLast("BB");
        queue.addLast("CC");
        System.out.println(queue);

        System.out.println(queue.removeFirst());
        queue.addLast("DD");
        System.out.println(queue);
    }
}