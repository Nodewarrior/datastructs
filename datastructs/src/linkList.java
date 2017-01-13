/**
 * Created by akshay on 1/13/17.
 */
public class linkList {
    private static class Node <T>{
        private final T data;
        private Node next;

        public Node(T data){
            this.data=data;
        }

        public void displayNode(){
            System.out.print(data + " ");
        }
    }

    private Node front = null;
    private Node rear = null;

    public boolean isEmpty() {
        return (front == null);
    }

    public <T> void addLast(T data) {
        Node n = new Node(data);
        if (isEmpty()){
            front = n;
        } else {
            rear.next = n;
        }
        rear = n;
        rear.next = null;
     }

     public void removeFirst() {
        Node temp = front;
        if (front.next == null)
            rear = null;
        front= front.next;
     }

     public void display() {
        Node current = front;
       while(current != null){
           current.displayNode();
           current = current.next;
       }
     }
}

