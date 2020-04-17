//// Python to Java

//// Python:

//from time import time
//data = [2, 3, 4, 5, 6, 3, 5, 3, 6, 5, 8, 9, 4]
//
//        def get_max(S):
//        n = len(S)
//        A = 0
//        for i in range(n):
//        if S[i] > A:
//        A = S[i]
//        return A
//
//
//        if __name__=="__main__":
//        start_time = time()
//        for i in range(100000):
//        result = get_max(data)
//        end_time = time()
//        elapsed = end_time - start_time
//        print("data is ", data)
//        print("The maximum value is ", result)
//        print("The execution time is ", elapsed, "seconds")
//



public class GetMax {
    int[] data = {2, 3, 4, 5, 6, 3, 5, 3, 6, 5, 8, 9, 4};
    int result;

    public static void main(String[] args){
        GetMax gm = new GetMax();
        gm.measure();
    }

    public void measure(){
        long start, end, elapsed;

        start = System.currentTimeMillis();
        for(int i = 0; i < 100000; i++){
            result = get_max(data);

        }
        end = System.currentTimeMillis();
        elapsed = end - start;

        System.out.print("data is [");
        for(int i = 0; i < data.length - 1; i++){
            System.out.print(data[i] + ",");
        }
        System.out.println(data[data.length - 1] + "]");

        System.out.println("The maximum value is " + result);
        System.out.println("The execution time is " + elapsed + " millisecond");

    }

    public int get_max(int[] data){
        int max = 0;

        for(int i = 0; i < data.length; i++){
            if(data[i] > max){
                max = data[i];

            }
        }
        return max;
    }
}
