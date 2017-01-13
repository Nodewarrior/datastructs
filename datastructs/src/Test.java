/**
 * Created by akshay on 1/13/17.
 */
public class Test {
    public static void main(String[] args) {

        LinkQueue queue = new LinkQueue();

        queue.enqueue("m");
        queue.enqueue("s");
        queue.enqueue("l");
        queue.enqueue("j");
        queue.displayqueue();
        queue.dequeue();
        queue.displayqueue();
    }
}
