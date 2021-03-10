package linear.doublylinkedlist;

/**
 * Created by southouse
 * Created on 2/5/2021.
 **/
public class Node {
    Object data;
    Node prev;
    Node next;

    public Node(Object data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", prev=" + prev +
                ", next=" + next +
                '}';
    }
}
