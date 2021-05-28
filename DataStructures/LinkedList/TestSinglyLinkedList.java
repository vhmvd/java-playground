public class TestSinglyLinkedList {
  public static void main(String[] args) {
    SinglyLinkedList list = new SinglyLinkedList();

    for (int i = 1; i <= 10; i++) {
      if (i % 2 == 0) {
        list.insertFirst(i);
      } else {
        list.insertLast(i);
      }
    }

    System.out.println("Printing all the elements of linked list");
    list.print();
    System.out.println("Printing 3rd element of linked list");
    list.printThird();
    
    System.out.println("Printing all the elements of linked list after reversing them");
    list.reverseList();
    list.print();

    System.out.println("Swapping 9 and 10");
    list.swap(9, 10);
    list.print();

    System.out.println("Swapping 3 and 2");
    list.swap(3, 2);
    list.print();
  }
}
