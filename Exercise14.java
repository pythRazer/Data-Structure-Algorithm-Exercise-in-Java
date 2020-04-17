/*
 * May 14 2019
 * Exercise14
 * by Lee Jui Chi
 */

import java.util.ArrayDeque;
import java.util.ArrayList;

public class Exercise14 {
    ArrayDeque<Character> deque = new ArrayDeque<Character>();
    ArrayList<Character> left = new ArrayList<Character>();
    ArrayList<Character> right = new ArrayList<Character>();


    public static void main(String[] args) {
        Exercise14 ex14 = new Exercise14();
        ex14.check("(){([()])}");
        ex14.check("([()])}");
    }

    public Exercise14() {
        left.add('(');
        left.add('{');
        left.add('[');
        right.add(')');
        right.add('}');
        right.add(']');
    }

    public void check(String str) {
        char[] expr = str.toCharArray();
        if (is_matched(expr)) {
            System.out.println("Correct: " + str);
        } else {
            System.out.println("Incorrect: " + str);
        }
    }



    public boolean is_matched(char[] expr) {


        for (int i = 0; i < expr.length; i++) {

            if (left.contains(expr[i])) {

                deque.push(expr[i]);
            } else if (right.contains(expr[i])) {

                if (deque.isEmpty()) {


                    return false;
                }
                if (right.indexOf(expr[i]) != left.indexOf(deque.pop())) {

                    return false;
                }
            }

        }
        return deque.isEmpty();
    }
}
