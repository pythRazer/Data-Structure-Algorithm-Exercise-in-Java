/*
 * April 23 2019
 * Exercise5
 * by Lee Jui Chi
 */
public class Exercise5 {
    int[] data = {2, 4, 5, 7, 8, 9, 12, 14, 17, 19, 22, 25, 27, 28, 33, 37};

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Exercise5 ex5 = new Exercise5();
        ex5.binary_search(28, 0, 15);
    }

    public boolean binary_search(int target, int low, int high) {
        if(low > high) {
            return false;
        }else {
            int mid = (low + high)/2;
            if(target == data[mid]) {
                System.out.println("target " + target + " is located at " + mid);
                return true;
            }else if(target < data[mid]) {
                return binary_search(target, low, mid - 1);
            }else {
                return binary_search(target, mid + 1, high);
            }
        }
    }

}
