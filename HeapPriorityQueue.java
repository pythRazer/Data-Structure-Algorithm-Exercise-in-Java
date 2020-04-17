/*
 * May 28 2019
 * HeapPriorityQueue
 * by Lee Jui Chi
 */

import java.util.ArrayList;
import java.util.Arrays;

public class HeapPriorityQueue {
    ArrayList<Tuple> data = null;
    Tuple tp;

    public HeapPriorityQueue(ArrayList<Tuple> data_) {
        data = data_;
    }

    public void showQueue() {
        for(int i = 0; i < data.size(); i ++){
            System.out.print("(" + data.get(i).getKey() + ", "+ data.get(i).getElement() + ")");

        }
        System.out.println("");



    }

    public int parent(int j) {
        return (j-1) / 2;

    }

    public int left(int j) {
        return 2*j + 1;

    }

   public int right(int j) {
        return 2*j+2;

   }

    public int len() {
        return data.size() ;

    }

    public void add(int key, String element) {
        Tuple newest = new Tuple(key, element);
        data.add(newest);
        upheap(data.size() - 1);


    }

    public void swap(int i, int j) {
        Tuple temp = data.get(i);
        data.set(i, data.get(j));
        data.set(j, temp);

    }

    public void upheap(int j) {
        System.out.print("upheap: ");
        showQueue();
        while(j > 0){

            int p = parent(j);
            if (data.get(j).getKey() < data.get(p).getKey()) {


                swap(j, p);
                j=p;
            }
            System.out.print("upheap: ");
            showQueue();
        }



        /* Complete this part */
    }
    public Tuple remove_min() {
        if(data.size() == 0) {
            return null;
        } else {
            swap(0, data.size() - 1);
            Tuple tp = data.remove(data.size() - 1);
            downheap(0);
            return tp;
        }
    }

    public void downheap(int j) {
        int left, right, small_child;
        System.out.print("downheap: ");
        showQueue();
        if(data.size() > left(j)) {
            left = left(j);
            small_child = left;
            if(data.size() > right(j)) {
                right = right(j);
                if(data.get(right).getKey() < data.get(left).getKey()) {
                    small_child = right;
                }
            }
            if(data.get(small_child).getKey() < data.get(j).getKey()) {
                swap(j, small_child);
                downheap(small_child);
            }
        }
    }





    }


