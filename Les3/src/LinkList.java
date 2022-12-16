import java.util.Iterator;

public class LinkList<U> implements Iterator<Node> {
    private Node current;

    public LinkList(Node first) {
        current = first;
    }

    @Override
    public boolean hasNext() {
        return current != null;
    }

    @Override
    public Node next() {
        Node i = current;
        current = current.getNext();
        return i;
    }

}
