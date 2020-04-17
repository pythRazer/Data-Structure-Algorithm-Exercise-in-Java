/*
 * May 14 2019
 * Exercise13
 * by Lee Jui Chi
 */

import java.util.ArrayDeque;

public class Exercise13 {
    ArrayDeque<String> stack = new ArrayDeque<String>();

    public static void main(String[] args) {
        Exercise13 ex13 = new Exercise13();
        ex13.stackTest();
    }

    public void stackTest() {
        stack.push("AA");
        stack.push("BB");
        stack.push("CC");
        System.out.println(stack);
        System.out.println(stack.pop());
        stack.push("DD");
        System.out.println(stack);
    }
}
