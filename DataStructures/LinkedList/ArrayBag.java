package arrays;

import java.util.Arrays;

public class ArrayBag {
    private int[] bag;
    private int count = 0;

    public ArrayBag() {
        bag = new int[100];
    }

    public ArrayBag(int size) {
        bag = new int[size];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == bag.length;
    }

    public int size() {
        return count;
    }

    private int search(int item) {
        int index = -1;
        for (int i = 0; i < count; i++) {
            if (bag[i] == item)
                index = i;
        }
        return index;
    }

    public boolean contains(int item) {
        return search(item) != -1;
    }

    public void add(int item) {
        if (isFull())
            System.out.println(item + " cannot be added, the bag is full");
        else {
            bag[count] = item;
            count++;
        }
    }

    public void remove(int item) {
        if (isEmpty())
            System.out.println("The bag is empty");
        int index = search(item);
        if (index == -1)
            System.out.println("The bag does not contain the item " + item);
        else {
            for (int i = index; i < count; i++) {
                bag[i] = bag[i+1];
            }
            count--;
        }
    }

    @Override
    public String toString() {
        return  Arrays.toString(bag);
    }

//    public void print() {
//        if (isEmpty())
//            System.out.println("The bag is empty");
//        else {
//            for (int i = 0; i < count; i++) {
//                System.out.print(bag[i] + " ");
//            }
//            System.out.println();
//        }
//    }
}
