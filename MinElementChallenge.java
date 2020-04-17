import java.util.Scanner;

/*
-Write a method called readIntegers() with a parameter called count that represents how many integers the user needs to enter.

-The method needs to read from the console until all the numbers are entered, and then return an array containing the numbers entered.

-Write a method findMin() with the array as a parameter. The method needs to return the minimum value in the array.

-In the main() method read the count from the console and call the method readIntegers() with the count parameter.

-Then call the findMin() method passing the array returned from the call to the readIntegers() method.

-Finally, print the minimum element in the array.

Tips:
	-Assume that the user will only enter numbers, never letters
	-For simplicity, create a Scanner as a static field to help with data input
	-Create a new console project with the name ÅeMinElementChallengeÅf

 */
public class MinElementChallenge {

    private static Scanner scanner = new Scanner(System.in);


    public static void main(String args[]){

        System.out.println("Enter count: ");
        int inputCount = scanner.nextInt();
        System.out.println("The minimum valuie is " + findMin(readIntegers(inputCount)));


    }





    public static int[] readIntegers(int count){

        int[] array = new int[count];

        for(int i = 0; i < array.length; i++){

            System.out.println("Please enter the numbers: ");
            int numbers = scanner.nextInt();
            scanner.nextLine();
            array[i] = numbers;

        }

        return array;

    }

    public static int findMin(int[] array){

        int minValue = Integer.MAX_VALUE;

        for(int i = 0; i < array.length; i++){
            int value = array[i];
            if(value < minValue){
                minValue = value;
            }

        }


        return minValue;

    }

}
