
public class Node<U> {
    private Node next;
    private Node prev;
    private U item;

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public U getItem() {
        return item;
    }

    public void setItem(U item) {
        this.item = item;
    }
}
