/*
 * May 7 2019
 * Exercise11
 * by Lee Jui Chi
 */

import java.util.ArrayList;
import java.util.Dictionary;

public class Exercise11 {
    ArrayList<Student> st = new ArrayList<Student>();

    public static void main(String[] args) {
        Exercise11 ex11 = new Exercise11();
        ex11.getMax();
    }

    public Exercise11() {
        st.add(new Student("Sara", 80, 77));
        st.add(new Student("Emily", 85, 66));
        st.add(new Student("Karen", 67, 80));
        st.add(new Student("Annie", 77, 90));
        st.add(new Student("Kate", 90, 73));
    }

    public void getMax() {

        int highestScore = 0;
        String name = "";

        for(int i = 0; i < st.size(); i++){


           if(st.get(i).getClass1() + st.get(i).getClass2() > highestScore){
               highestScore = st.get(i).getClass1() + st.get(i).getClass2();
               name = st.get(i).getName();
           }



        }

        System.out.println(name + " gets the highest score " + highestScore);
    }
}