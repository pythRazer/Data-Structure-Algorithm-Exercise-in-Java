/*
 * May 7 2019
 * Exercise9
 * by Lee Jui Chi
 */

import java.util.ArrayList;

public class Exercise9 {
    ArrayList<Student> st = new ArrayList<Student>();

    public static void main(String[] args) {
        Exercise9 ex9 = new Exercise9();
        ex9.showAll();
    }

    public Exercise9() {
        st.add(new Student("Sara", 80, 77));
        st.add(new Student("Emily", 85, 66));
        st.add(new Student("Karen", 67, 80));
        st.add(new Student("Annie", 77, 90));
        st.add(new Student("Kate", 90, 73));
    }

    public void showAll() {
        for(int i = 0; i < st.size(); i++){
            System.out.println("name: " + st.get(i).getName() + ", class 1: " + st.get(i).getClass1() + ", " + "class 2: " + st.get(i).getClass2());
        }
    }
}