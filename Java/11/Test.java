import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Test {
  public static void main(String[] args) {
    Queue<Integer> q = new LinkedList<Integer>();
    q.offer(1);
    q.offer(2);
    q.offer(3);
    q.offer(4);
    q.offer(5);
    removeEven(q);
  }

  public static void removeEven(Queue<Integer> q) {
    Iterator<Integer> it = q.iterator();
    while (it.hasNext()) {
      Integer temp = it.next();
      if (temp % 2 == 0) {
        q.remove(temp);
        it = q.iterator();
      }
    }
  }
}
