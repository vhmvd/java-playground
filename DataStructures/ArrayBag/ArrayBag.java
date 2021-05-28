

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
        if (isEmpty()) {
            System.out.println("The bag is empty");
            return;
        }
        int index = search(item);
        if (index == -1) {
            System.out.println("The bag does not contain the item " + item);
        } else {
            for (int i = index; i < count - 1; i++) {
                bag[i] = bag[i + 1];
            }
            count--;
        }
    }

    // Q1
    public int countEven() {
        if (isEmpty()) {
            System.out.println("The bag is empty");
            return 0;
        }
        int evenCount = 0;
        for (int i = 0; i < count; i++) {
            if (bag[i] % 2 == 0) {
                evenCount++;
            }
        }
        return evenCount;
    }

    @Override
    public String toString() {
        String bagString = "[";
        for(int i=0; i<count-1; i++){
            bagString += bag[i] + ", ";
        }
        bagString += bag[count - 1] + "]";
        return bagString;
    }
}
