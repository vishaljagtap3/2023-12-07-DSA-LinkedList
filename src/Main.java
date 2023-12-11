public class Main {
    public static void main(String[] args) {

        LinkedList l1 = new LinkedList();

        System.out.println("size: " + l1.size());

        l1.insert(10);
        l1.insert(20);
        l1.insert(30);
        l1.insert(40);

        System.out.println("size: " + l1.size());

        l1.display();


    }
}
