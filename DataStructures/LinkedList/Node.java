package linkedlists.singly;

public class Node {
    protected int info;
    protected Node link;

    public Node(int newInfo) {
        info = newInfo;
        link = null;
    }

    public Node(int newInfo, Node node) {
        info = newInfo;
        link = node;
    }

    public int getInfo() {
        return info;
    }

    public Node getLink() {
        return link;
    }
}
