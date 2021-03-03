public class Test {

  public static void main(String[] args) {
    
    Television testObject = new Television("Samsung", 40);
    System.out.println(testObject);
    System.out.println("Resolution: " + testObject.calcResolution(100));
  }
  
}
