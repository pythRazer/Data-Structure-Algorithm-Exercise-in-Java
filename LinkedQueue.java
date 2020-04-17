/*
 * May 21 2019
 * LinkedQueue
 * by Lee Jui Chi
 */

public class LinkedQueue {
    Node head = null;
    Node tail = null;
    int size = 0;


    public void showList() {
        showList(head);
    }

    public void showList(Node node) {
        if(node == null){
            System.out.println("");
        }else{
            System.out.print(node.getElement() + " ");
            showList(node.getNext());
        }

    }



    public String dequeue() {

        if(head == null){

            return null;

        }else{
            String a = head.getElement();
            head = head.getNext();

            size--;
            return a;
        }



    }

    public void enqueue(String e) {
        Node newest = new Node(e, null);
        if(tail == null){
            head = newest;
        }else{
            tail.setNext(newest);
        }
        tail = newest;
        size++;


    }

}