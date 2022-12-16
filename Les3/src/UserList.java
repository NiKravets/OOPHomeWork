
import java.util.Iterator;

public class UserList<U> implements Iterable<Node> {
    private Node first;
    private Node last;

    public UserList() {
        first = last = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void add(U item) {
        Node i = new Node();
        i.setItem(item);
        i.setNext(null);

        if (first == null) {
            i.setPrev(null);
            first = last = i;
        } else {
            i.setPrev(last);
            last.setNext(i);
            last = i;
        }
    }

    @Override
    public Iterator<Node> iterator() {
        return new LinkList(first);
    }

}
