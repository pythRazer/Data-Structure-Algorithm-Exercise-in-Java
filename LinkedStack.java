/*
 * May 21 2019
 * LinkedStack
 * by Lee Jui Chi
 */

public class LinkedStack {
    Node head = null;

    // to display a singly linked list
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


    public void push(String e) {
        head = new Node(e, head);


        if(head == null){
            System.out.println(e);

        }

    }

    public String pop() {

        if(head == null){
            return null;


        }else{
            String answer = head.getElement();
            head = head.getNext();

            return answer;
        }


    }
}