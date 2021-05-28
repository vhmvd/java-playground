package arrays;

import java.util.Arrays;

public class IntegerBag {
    private int[] items;
    private int count = 0;

    // The default constructor that creates a bag with a fixed size.
    public IntegerBag() {
        items = new int[32];
    }

    // The constructor creates a bag with a given size.
    public IntegerBag(int size) {
        items = new int[size];
    }

    // The boolean method checks if the bag is empty.
    public boolean isEmpty() {
        return count == 0;
        //if (count == 0) return true; else return false;
    }

    // The boolean method checks if the bag is full.
    public boolean isFull() {
        return count == items.length;
    }

    // The method returns the number of items in the bag.
    public int size() {
        return count;
    }

    private int search(int item) {
        for (int i = 0; i < count; i++) {
            if (item == items[i])
                return i;
        }
        return -1;
    }

    // The method checks if an item exists in the bag.
    public boolean contains(int item) {
        if (search(item) != - 1)
            return true;
        else
            return false;
        // return search(item) != -1;
    }

    // The method adds a new item into the bag.
    public void add(int item) {
        if (isFull())
            resize(2 * items.length);
        items[count++] = item;
    }

    // The methods removes an existing item from the bug.
    public int remove(int item) {
        if (isEmpty())
            System.out.println("The bag is empty");
        int index = search(item);
        if (index == -1)
            System.out.println("The bag does not contain the item " + item);
        else {
            for (int i = index; i < count; i++) {
                items[i] = items[i+1];
            }
            count--;
        }
        if (count > 0 && count == items.length/4)
            resize(items.length/2);
        return item;
    }

    //The method prints all elements of the bag as a list.
    public void print() {
        if (isEmpty())
            System.out.println("The bag is empty");
        else {
            for (int i = 0; i < count; i++) {
                System.out.print(items[i] + " ");
            }
            System.out.println();
        }
    }

//    @Override
//    public String toString() {
//        return  Arrays.toString(items);
//    }

    private void resize(int newSize) {
        int[] temp = new int[newSize];
        for (int i = 0; i < count; i++) {
            temp[i] = items[i];
        }
        items = temp;
    }
}
