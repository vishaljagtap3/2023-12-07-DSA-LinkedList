import java.util.Stack;

public class LinkedList {
    private Node head;
    private int count;

    public LinkedList() {
        head = null;
        count = 0;
    }

    public Node getHead() {
        return head;
    }

    public boolean insert(int data) {
        Node newNode = new Node(data);
        if(newNode == null) {
            return false;
        }

        if(head == null) {
            head = newNode;
            count++;
            return true;
        }

        Node last = head;
        while(last.getNext() != null) {
            last = last.getNext();
        }

        last.setNext(newNode);

        count++;
        return true;
    }

    public void display() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.getData() + " ");
            temp = temp.getNext();
        }
        System.out.println();
    }

    public int size() {
        Node temp = head;
        int count = 0;

        while(temp != null) {
            count++;
            temp = temp.getNext();
        }

        return count;
    }

    public int sizeNew() {
        return count;
    }

    public void displayRev() {
        Stack<Node> stack = new Stack<>();
        Node temp = head;

        while(temp != null) {
            stack.push(temp);
            temp = temp.getNext();
        }

        while(!stack.isEmpty()) {
            System.out.print(stack.pop().getData() + " ");
        }
        System.out.println();
    }

    public void displayRev(Node head) {
        if(head == null) {
            return;
        }

        displayRev(head.getNext());
        System.out.print(head.getData() + " ");
    }

    public void reverse() {
        if(head == null) {
            return;
        }

        Node n1 = head, n2 = head.getNext();
        Node n3;

        while(n2 != null) {
            n3 = n2.getNext();
            n2.setNext(n1);
            n1 = n2;
            n2 = n3;
        }

        head.setNext(null);
        head = n1;
    }
}






