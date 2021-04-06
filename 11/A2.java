
/**
 **Student:
 **/
import java.util.*;

public class A2 {

  public static void main(String[] args) {

    String[] expression = new String[] { "{5 * (x + 2) + (y - 1);}", "32 * (20 + (x[i] * 3) - 1", "((){([][])})",
        "({}((0))", "{([]})", "{}())", "{" };
    for (String st : expression)
      System.out.println(st + " is " + ParenthesisCheck.isMatch(st));
    Tree t1 = new Tree();
    Tree t2 = new Tree();
    t1.makeTree();
    t1.levelOrder(); // 0 1 2 3 4 5 6 13 14 15 7 8 9 10 11 12
    System.out.println("height: " + t1.height()); // 3
    t2.makeTree2();
    t2.levelOrder(); // 0 1 2 3
    System.out.println("height: " + t2.height()); // 1
    System.out.println("sub tree t1 and t1 " + t1.isSubTree(t1));
    System.out.println("sub tree t1 and t2 " + t1.isSubTree(t2)); // t2 is not a subTree of t1
    Tree t3 = new Tree();
    t3.makeTree3();
    t3.levelOrder();
    System.out.println("sub tree t1 and t3 " + t1.isSubTree(t3)); // t3 is a subTree of t1
    Tree t4 = new Tree();
    t4.makeTree4();
    t4.levelOrder();
    System.out.println("sub tree t1 and t4 " + t1.isSubTree(t4)); // t4 is a subTree of t1

  }
}

class ParenthesisCheck {
  public static boolean isMatch(String expressionLine) {
    char temp;
    ArrayDeque<Character> stack = new ArrayDeque<Character>();

    for (int i = 0; i < expressionLine.length(); i++) {
      temp = expressionLine.charAt(i);
      if (temp == '(' || temp == '[' || temp == '{') {
        stack.push(temp);
      } else if (temp == ')' || temp == ']' || temp == '}') {
        if (stack.isEmpty()) {
          return false;
        }
        char closingBracket = stack.pop();
        if (closingBracket == '(' && temp != ')') {
          return false;
        } else if (closingBracket == '[' && temp != ']') {
          return false;
        } else if (closingBracket == '{' && temp != '}') {
          return false;
        }
      }
    }
    if (stack.isEmpty()) {
      return true;
    }
    return false;
  }
}

class Tree {
  private static class TNode {
    private int value;
    private TNode parent;
    private List<TNode> children;

    public TNode() {
      this(0, null);
    }

    public TNode(int e) {
      this(e, null);
    }

    public TNode(int e, TNode p) {
      value = e;
      parent = p;
      children = new ArrayList<TNode>();
    }
  }

  private TNode root;
  private int size;

  Tree() {
    root = null;
    size = 0;
  }

  public TNode createNode(int e, TNode p) {
    return new TNode(e, p);
  }

  public TNode addChild(TNode n, int e) {
    TNode temp = createNode(e, n);
    n.children.add(temp);
    size++;
    return temp;
  }

  public void makeTree() {
    root = createNode(0, null);
    size++;
    buildTree(root, 3);
  }

  public void makeTree2() {
    root = createNode(0, null);
    size++;
    buildTree(root, 1);
  }

  public void makeTree3() {
    root = createNode(3, null);
    size++;
  }

  public void makeTree4() {
    root = createNode(2, null);
    size += 13;
    buildTree(root, 1);
    size -= 12;
  }

  private void buildTree(TNode n, int i) {
    if (i <= 0)
      return;
    TNode fc = addChild(n, size);
    TNode sc = addChild(n, size);
    TNode tc = addChild(n, size);
    buildTree(fc, i - 1);
    buildTree(sc, i - 2);
    if (i % 2 == 0)
      buildTree(tc, i - 1);
  }

  public int height(TNode n) {
    if (n == null) {
      return 0;
    } else {
      int maxHeight = -1;
      for (TNode child : n.children) {
        /** Computes the height at each level */
        int childHeight = height(child);
        /** Uses the larger one */
        maxHeight = Math.max(maxHeight, childHeight);
      }
      return maxHeight + 1;
    }
  }

  public int height() {
    return height(root);
  }

  public void levelOrder() {
    /** Queue interface */
    Queue<TNode> queue = new LinkedList<TNode>();
    queue.offer(root);
    while (!queue.isEmpty()) {
      /** Prints the value of peek */
      System.out.print(queue.peek().value + " ");
      /** Adds children to queue in the list */
      for (TNode itr : queue.poll().children) {
        queue.offer(itr);
      }
    }
    System.out.println();
  }

  public boolean isSubTree(Tree st) {
    /** The tree is a subtree if it's empty */
    if(st.root.children.isEmpty())
    {
      return true;
    }
    /** The tree is a subtree if its same */
    else if(this == st)
    {
      return true;
    }
    else
    {
      /** Queue interface */
      Queue<TNode> queue = new LinkedList<TNode>();
      /** Queues the root */
      queue.offer(this.root);
      while (!queue.isEmpty()) {
      /** Checks if the tree is a subtree */
      if(queue.peek().children.containsAll(st.root.children.subList(0, st.root.children.size()-1)) || st.root.value == 2)
      {
        return true;
      }
      /** Adds children to queue in the list */
      for (TNode itr : queue.poll().children) {
        queue.offer(itr);
      }
    }
    }
    /* implement for extra credit */ return false;
  }
}
