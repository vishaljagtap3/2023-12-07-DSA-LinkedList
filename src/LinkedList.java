public class LinkedList {
    private Node head;
    private int count;

    public LinkedList() {
        head = null;
        count = 0;
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
}






