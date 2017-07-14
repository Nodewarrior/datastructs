public class linkedList <T> {
    Node head;

    public linkedList() {
        head = null;
    }

    public void add(Object data) {
        Node newNode = new Node(data, null);
        if(head == null) {
            head = newNode;
        }
        else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void remove() {
        head = head.next;
    }
    
    public void display() {
        Node curn = head;

        while(curn != null) {
            System.out.println((T)curn.data);
            curn = curn.next;
        }
    }
}

class testlinkedList {
    public static void main(String args[]) {
        linkedList<Integer> list = new linkedList<Integer>();
        
        list.add(2);
        list.add(3);
        list.add(4);
        list.display();
    }
}