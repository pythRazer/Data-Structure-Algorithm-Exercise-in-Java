/*
 * June 25 2019
 * Exercise27
 * by Lee Jui Chi
 */

public class Exercise27 {
    int[] list1 = {1, 3, 5};
    int[] list2 = {2, 4, 8, 9};
    int[] list3 = {8, 2, 1, 6, 5, 3, 7}; // data for Exercise28, 29

    public static void main(String[] args) {
        new Exercise27();
    }

    public Exercise27() {
        int[] list = new int[list1.length + list2.length];
        printList("list1", list1);
        printList("list2", list2);
        merge(list1, list2, list);
        printList("list", list);
    }

    public void merge(int[] list1, int[] list2, int[] list) {
        int i = 0;
        int j = 0;
        while(i + j < list.length){
            if(j == list2.length || (i < list1.length && list1[i] < list2[j])){
                list[i + j] = list1[i];
                i += 1;
            }else{
                list[i + j] = list2[j];
                j += 1;
            }
        }



    }

    public void printList(String str, int[] list) {
        System.out.print(str + ": ");
        for(int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }
}
