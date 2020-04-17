/*
 * April 30 2019
 * Exercise7
 * by Lee Jui Chi
 */

import java.util.ArrayList;
public class Exercise7 {
    String whichColor;

    String[] colorData = {"red", "blue", "blue", "yellow", "blue",
            " orange ", "pink", "yellow", "orange", "yellow", "pink",
            "red", "blue", "red", "pink", "orange", "orange", "red",
            "blue", "orange", "red", "pink", "yellow"};

    String[] colorList = {"blue", "green", "orange", "pink", "red", "yellow"};
    ArrayList<String> colors = new ArrayList<String>();
    public static void main(String[] args) {
        Exercise7 ex7 = new Exercise7();
        ex7. showPositionAll();
    }
    public Exercise7() { // constructor
        for(int i = 0; i < colorData.length; i++) {
            colors.add(colorData[i]); }
    }
    public void showPositionAll() {

        for(int i = 0; i < colorList.length; i++){
            System.out.print(colorList[i] + " is at ");
            whichColor = colorList[i];
            showPosition(whichColor);
        }
    }
    public void showPosition(String color) {
        String theOutput = "";



        for(int i = 0; i < colors.size(); i++){


            if(colors.get(i).equals(whichColor)){

                theOutput += i + " ";


            }

        }
        System.out.println(theOutput);

    }

}

