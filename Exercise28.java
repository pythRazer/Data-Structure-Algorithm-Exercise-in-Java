/*
 * June 25 2019
 * Exercise28
 * by Lee Jui Chi
 */



public class Exercise28 {
    int[] list3 = {8, 2, 1, 6, 4, 3, 7};

    public static void main(String[] args) {
        new Exercise28();
    }

    public Exercise28() {
        printList("list", list3);
        mergeSort(list3);
        printList("result", list3);
    }

    public void mergeSort(int[] list) {

        /* Compete this part */
        int n = list.length;
//        if(n<2){
//            printList("list", list);
//        }
        if(n >= 2){
            int mid = n / 2;

            int[] list1 = new int[mid];

            for(int i = 0; i < list1.length; i++){
                list1[i] = list[i];
            }
            int[] list2 = new int[n - mid];
            for(int j = 0; j < list2.length; j++){

                list2[j] = list[mid + j];
            }
            mergeSort(list1);
            mergeSort(list2);
            merge(list1, list2, list);

        }

        printList("list", list);


    }
    /* Copy the methods “merge” and “printList” */
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