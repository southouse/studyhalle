package linear.linkedlist;

/**
 * Created by southouse
 * Created on 2/5/2021.
 **/
public class Node {
    Object data;
    Node next;

    public Node(Object data) {
        this.data = data;
        this.next = null;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}
