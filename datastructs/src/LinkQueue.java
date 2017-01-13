/**
 * Created by akshay on 1/13/17.
 */
public class LinkQueue {
    linkList newlinkList = new linkList();

    public <T> void enqueue(T data) {
        newlinkList.addLast(data);
    }

    public  void dequeue() {
        if (!newlinkList.isEmpty())
            newlinkList.removeFirst();
    }

    public void displayqueue() {
        newlinkList.display();
        System.out.println();
    }

    public boolean isEmpty() {
        return newlinkList.isEmpty();
    }
}
