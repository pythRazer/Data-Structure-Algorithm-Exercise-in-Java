/*
 * June 25 2019
 * Exercise29
 * by Lee Jui Chi
 */


import java.util.ArrayDeque;

public class Exercise29 {
    int[] list = {8, 2, 1, 6, 4, 3, 7};
    ArrayDeque<Integer> data = new ArrayDeque<Integer>();

    public static void main(String[] args) {
        new Exercise29();
    }

    public Exercise29() {
        for (int i = 0; i < list.length; i++) {
            data.add(list[i]);
        }
        System.out.println("original is " + data);
        quickSort(data);
        System.out.println("result is " + data);
    }

    public void quickSort(ArrayDeque<Integer> sequence) {
        /* Compete this part */
        int n = sequence.size();
        if(n >= 2){
            int p = sequence.getFirst();
            ArrayDeque<Integer> L = new ArrayDeque<>();
            ArrayDeque<Integer> E = new ArrayDeque<>();
            ArrayDeque<Integer> G = new ArrayDeque<>();
            while(!sequence.isEmpty()){
                if(sequence.getFirst() < p){
                    L.add(sequence.remove());
                }else if(p < sequence.getFirst()){
                    G.add(sequence.remove());
                }else{
                    E.add(sequence.remove());
                }
            }
            quickSort(L);
            quickSort(G);
            while(!L.isEmpty()){
                sequence.add(L.remove());
            }
            while(!E.isEmpty()){
                sequence.add(E.remove());
            }
            while(!G.isEmpty()){
                sequence.add(G.remove());
            }
            System.out.println(sequence);
        }


    }
}