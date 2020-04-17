/*
 * May 7 2019
 * Exercise10
 * by Lee Jui Chi
 */

import java.util.ArrayList;

public class Exercise10 {
    ArrayList<Student> st = new ArrayList<Student>();

    public static void main(String[] args) {
        Exercise10 ex10 = new Exercise10();
        ex10.getAverage();
    }

    public Exercise10() {
        st.add(new Student("Sara", 80, 77));
        st.add(new Student("Emily", 85, 66));
        st.add(new Student("Karen", 67, 80));
        st.add(new Student("Annie", 77, 90));
        st.add(new Student("Kate", 90, 73));
    }

    public void getAverage() {

        double class1Total = 0.0;
        double class2Total = 0.0;

        for(int i = 0; i < st.size(); i++){
            class1Total += st.get(i).getClass1();
            class2Total += st.get(i).getClass2();
        }

        System.out.println("The average of class1 is " + class1Total / st.size());
        System.out.println("The average of class2 is " + class2Total / st.size());
    }
}
