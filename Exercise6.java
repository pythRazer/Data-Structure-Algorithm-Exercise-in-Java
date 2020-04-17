/*
 * April 30 2019
 * Exercise6
 * by Lee Jui Chi
 */


import java.util.ArrayList;

public class Exercise6 {

    String[] colorData = {"red", "blue", "blue", "yellow", "blue",
            " orange ", "pink", "yellow", "orange", "yellow", "pink",
            "red", "blue", "red", "pink", "orange", "orange", "red",
            "blue", "orange", "red", "pink", "yellow"};
    ArrayList<String> colors = new ArrayList<String>();
    public static void main(String[] args) {
        Exercise6 ex6 = new Exercise6();
        ex6.showPosition("pink");
    }
    public Exercise6() {
        for(int i = 0; i < colorData.length; i++) {
            colors.add(colorData[i]); }
    }
    public void showPosition(String color) {

        String theOutput = "pink is at ";


        for(int i = 0; i < colors.size(); i++){


            if(colors.get(i).equals("pink")){

                theOutput += i + " ";


            }

        }
        System.out.println(theOutput);

    }

}
