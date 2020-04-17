/*
 * April 16 2019
 * Exercise1
 * by Lee Jui Chi
 */
public class Exercise1 {
    int[] data = {2, 5, 4, 5, 6, 9, 5, 3, 6, 5, 8, 3, 4};
    double[] result;
    public static void main(String[] args){
        Exercise1 pe1 = new Exercise1();
        pe1.measure();
    }

    public void measure(){
        long start, end, elapsed;

        start = System.currentTimeMillis();
        for(int i = 0; i < 100000; i++){
            result = get_average(data);
        }

        end = System.currentTimeMillis();
        elapsed = end - start;
        System.out.println("The execution time is " + elapsed  + " milliseconds");

        for(int i = 0; i < data.length; i++){
            System.out.println("result[" + i + "] is " + result[i]);
        }

   }

    public double[] get_average(int[] data){
        double sum = 0.0;
        int n = data.length;
        double[] A = new double[n];

        for(int i = 0; i < data.length; i++){
             sum += data[i];
             A[i] = sum / (i + 1);

        }

        return A;
    }


}
