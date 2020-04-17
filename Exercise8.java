/*
 * April 30 2019
 * Exercise8
 * by Lee Jui Chi
 */
import java.util.ArrayList;
public class Exercise8 {
    String whichColor;
    String[] colorData = {"red", "blue", "blue", "yellow", "blue",
            " orange ", "pink", "yellow", "orange", "yellow", "pink", "red", "blue", "red", "pink", "orange", "orange", "red", "blue", "orange", "red", "pink", "yellow"};
    String[] colorList = {"blue", "green", "orange", "pink", "red", "yellow"};
    ArrayList<String> colors = new ArrayList<String>();
    public static void main(String[] args) {
        Exercise8 ex8 = new Exercise8();
        ex8.showPositionAll();
        ex8.change2nd("orange", "green");
        ex8.showPositionAll();
    }
    public Exercise8() {
        for(int i = 0; i < colorData.length; i++) {
            colors.add(colorData[i]); }
    }
    public void change2nd(String from, String to){
        int times = 0;
        System.out.println(from + " is changed to " + to);
        for(int i = 0; i < colors.size(); i++) {
            if(colors.get(i).equals(from)){
                times += 1;
            }
            if (times == 2) {
                colors.set(i, to);
            }
        }
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

