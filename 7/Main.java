public class Main {
  public static void main(String[] args) {
    Bill bill1 = new Bill(12);
    Bill bill2 = new Bill(66);

    Person person1 = new Person("Ronaldo", 35, 'M');
    Person person2 = new Person("Eden", 22, 'M');

    CustomerVisit customer1 = new CustomerVisit("Hashim", 19, 'M', 21);
    CustomerVisit customer2 = new CustomerVisit("Ibrahim", 12, 'M', 6);
    CustomerVisit customer3 = new CustomerVisit(person1, bill1);
    CustomerVisit customer4 = new CustomerVisit(person2, bill2);

    System.out.println(customer1.toString());
    System.out.println(customer2.toString());
    System.out.println(customer3.toString());
    System.out.println(customer4.toString());
  }
}
