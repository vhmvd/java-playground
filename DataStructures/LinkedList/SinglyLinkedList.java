package linkedlists.singly;

public class SinglyLinkedList {
    protected Node first;
    protected Node last;
    protected int count;

    public SinglyLinkedList() {
        first = null;
        last = null;
        count = 0;
    }

    public void initializer() {
        first = last = null;
        count = 0;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int length() {
        return count;
    }

    public void print() {
        Node current = first;
        while (current != null) {
            System.out.print(current.info + " ");
            current = current.link;
        }
    }

    public int first() {
        return first.info;
    }

    public int last() {
        return last.info;
    }

    public void insertFirst(int newInfo) {
        Node newNode = new Node(newInfo);
        if (isEmpty()) {
            first = last = newNode;
        } else {
            newNode.link = first;
            first = newNode;
        }
        count++;
    }

    public void removeFirst() {
        if (first == null) {
            System.err.println("The list is empty; nothing to remove");
        } else {
            first = first.link;
            count--;
            if (first == null) {
                last = null;
            }
        }
    }

    public void insertLast(int newInfo) {
        Node newNode = new Node(newInfo);
        if (isEmpty()){
            first = last = newNode;
        } else {
            last.link = newNode;
            last = newNode;
        }
        count++;
    }

    private void copy(SinglyLinkedList otherList) {
        Node newNode, current;
        this.initializer();
        if (!otherList.isEmpty()) {
            count = otherList.length();
            current = otherList.first;
            first = new Node(current.getInfo());
            last = first;
            current = current.link;
            while (current != null) {
                newNode = new Node(current.getInfo());
                last.link = newNode;
                last = newNode;
                current = current.link;
            }
        }
    }

    public SinglyLinkedList(SinglyLinkedList otherList) {
        copy(otherList);
    }

    public void copyList(SinglyLinkedList otherList) {
        if (this != otherList)
            copy(otherList);
    }
}
