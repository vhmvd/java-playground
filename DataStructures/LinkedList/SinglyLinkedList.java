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
        System.out.println();
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
        if (isEmpty()) {
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

    // Q2
    public void printThird() {
        if (count > 3) {
            System.out.println(first.link.link.info);
        } else {
            System.err.println("No 3rd element in the linked list");
        }
    }

    // Q3
    public void reverseList() {
        Node prev = null;
        Node current = first;
        Node next = null;
        while (current != null) {
            next = current.link;
            current.link = prev;
            prev = current;
            current = next;
        }
        last = first;
        first = prev;
    }

    // Q4
    public void swap(int n1, int n2) {
        Node temp1 = first;
        Node temp2 = first;
        Node prev1 = null;
        Node prev2 = null;

        if (first == null) {
            return;
        }

        if (n1 == n2) {
            return;
        }

        while (temp1.info != n1 && temp1 != null) {
            prev1 = temp1;
            temp1 = temp1.link;
        }

        while (temp2.info != n2 && temp2 != null) {
            prev2 = temp2;
            temp2 = temp2.link;
        }

        if (temp1 == null || temp2 == null) {
            System.err.println("Swapping cannot be performed");
            return;
        }

        if (prev1 != null)
            prev1.link = temp2;
        else
            first = temp2;

        if (prev2 != null)
            prev2.link = temp1;
        else
            first = temp1;

            Node temp = temp1.link;   
            temp1.link = temp2.link;   
            temp2.link = temp; 
    }
}
