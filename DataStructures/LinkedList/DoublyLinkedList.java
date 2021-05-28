package linkedlists.doubly;

public class DoublyLinkedList {
    
    // The data fields: first, last, count
    protected Node first;
    protected Node last;
    protected int count;

    // The default constructor
    public DoublyLinkedList() {
        first = last = null;
        count = 0;
    }

    // The method determines if the list is empty or not.
    public boolean isEmpty() {
        return count == 0;      // first == null
    }

    // The method returns the number of items (info) stored in the list.
    public int length() {           //size()
        return count;
    }

    // The method reinitializes the list to an empty state.
    public void initialize() {
        first = last = null;
        count = 0;
    }

    // The method returns the item stored in the first node.
    public int first() {
        return first.getInfo();
    }

    // The method returns the item stored in the last node.
    public int last() {
        return last.getInfo();
    }

    // The method prints the elements of the list.
    public void print() {
        if (isEmpty()) {
            System.out.println("The list is empty; nothing to print");
        } else {
            Node current = first;
            while (current != null) {
                System.out.print(current.info + " ");
                current = current.next;
            }
            System.out.println();
        }
    }

    // The method prints the elements of the list in reverse order.
    public void printReverse() {
        if (isEmpty()) {
            System.out.println("The list is empty; nothing to print");
        } else {
            Node current = last;
            while (current != null) {
                System.out.print(current.getInfo() + " ");
                current = current.back;
            }
        }
    }

    // The method returns true if the search item in the list; otherwise it returns false.
    public boolean search(int searchInfo) {
        Node current = first;
        boolean found = false;

        while (current != null && !found) {
            if (current.getInfo() >= searchInfo) {
                found = true;
            } else {
                current = current.next;
            }
        }
        if (found) {
            found = current.getInfo() == searchInfo;
        }
        return found;
    }

    // the method inserts a new item at the beginning of the list.
    // Case 1: insertion in an empty list
    // Case 2: insertion at the beginning of a nonempty list
    // Case 3: insertion at the end of a nonempty list
    // Case 4: insertion somewhere in a nonempty list
    public void insert(int newInfo) {
        Node newNode = new Node(newInfo);

        Node previous = null, current = first;
        boolean found = false;

        if (isEmpty()) {
            first = last = newNode;
        } else {
            while (current != null && !found) {
                if (current.getInfo() >= newInfo) {
                    found = true;
                } else {
                    previous = current;
                    current = current.next;
                }
            }
            if (current == first) {
                first.back = first;
                newNode.next = first;
                first = newNode;
            } else {
                if (current == null) {
                    previous.next = newNode;
                    newNode.back = previous;
                    last = newNode;
                } else {
                    previous.next = newNode;
                    newNode.back = previous;
                    newNode.next = current;
                    current.back = newNode;
                }
            }
        }
        count++;
    }

    // The method deletes a given item (if found) from the list.
    // Case 1: the list is empty
    // Case 2: the item to be deleted is in the first node
    // Case 3: the item to be deleted is somewhere in the list
    // Case 4: the item to be deleted is not in the list
    public void delete(int deleteInfo) {
        Node previous, current = first;
        boolean found = false;

        if (isEmpty()) {
            System.out.println("The list is empty; nothing to delete");
        } else {
            if (first.getInfo() == deleteInfo) {
                first = first.next;
                if (first != null) {
                    first.back = null;
                } else {
                    last = null;
                }
                count--;
            } else {
                while (current != null && !found) {
                    if (current.getInfo() >= deleteInfo) {
                        found = true;
                    } else {
                        current = current.next;
                    }
                }
                if (current == null) {
                    System.out.println("The item to be deleted is not in the list");
                } else {
                    if (current.getInfo() == deleteInfo) {
                        previous = current.back;
                        previous.next = current.next;
                        if (current.next != null) {
                            current.next.back = previous;
                        }
                        if (current == last) {
                            last = previous;
                        }
                        count--;
                    } else {
                        System.out.println("The item to be deleted is not in the list");
                    }
                }
            }
        }
    }
}
