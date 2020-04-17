/*
 * April 16 2019
 * Exercise2
 * by Lee Jui Chi
 */
public class Exercise2 {
    int[] data = {1, 2, 4, 8, 16};
    int[] logPrint;
    int[] cubePrint;
    int[] powerPrint;

    public static void main(String[] args){
        Exercise2 pe2 = new Exercise2();
        pe2.print();
    }

    public void print(){
        logPrint = log(data);
        cubePrint = cube(data);
        powerPrint = power(data);

        for(int i = 0; i < data.length; i++){
            System.out.println("logarithm base-two of " + data[i] + " is " + logPrint[i]);
        }
        for(int i = 0; i < data.length; i++){
            System.out.println("Cube of " + data[i] + " is " + cubePrint[i]);
        }
        for(int i = 0; i < data.length; i++){
            System.out.println("2 to the " + data[i] + "-th power is " + powerPrint[i]);
        }


    }

    public int[] log(int[] data){

        int n = data.length;
        int[] L = new int[n];

        for(int i = 0; i < data.length; i++){
            L[i] = (int)(Math.log(data[i]) / Math.log(2));

        }

        return L;
    }

    public int[] cube(int[] data){
        int n = data.length;
        int[] C = new int[n];

        for(int i = 0; i < data.length; i++){
            C[i] = (int) Math.pow(data[i], 3);

        }

        return C;

    }

    public int[] power(int[] data){
        int n = data.length;
        int[] P = new int[n];

        for(int i = 0; i < data.length; i++){
            P[i] = (int) Math.pow(2, data[i]);

        }

        return P;

    }


}
