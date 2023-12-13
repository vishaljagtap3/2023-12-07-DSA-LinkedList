public class Main {
    public static void main(String[] args) {

        LinkedList l1 = new LinkedList();

        l1.displayRev();

        System.out.println("size: " + l1.size());

        l1.insert(10);
        l1.insert(20);
        l1.insert(30);
        l1.insert(40);

        l1.display();

        l1.insert(50, 1);
        l1.display();
        l1.insert(60, 4);
        l1.display();
        l1.insert(70, 7);
        l1.display();
        System.out.println( l1.insert(80, 9) );
        l1.display();

        l1.deleteByValue(50);
        l1.display();
        l1.deleteByValue(60);
        l1.display();
        l1.deleteByValue(70);
        l1.display();
        l1.deleteByValue(70);
        l1.display();

        /*l1.deleteByPosition(1);
        l1.display();
        l1.deleteByPosition(4);
        l1.display();
        l1.deleteByPosition(5);
        l1.display();
        l1.deleteByPosition(5);
        l1.display();*/


        /*System.out.println("size: " + l1.size());

        l1.display();
        l1.displayRev();

        l1.displayRev(l1.getHead());
        System.out.println();

        System.out.println("After reversing");

        l1.reverse();
        l1.display();
        l1.displayRev();
        */

    }
}
