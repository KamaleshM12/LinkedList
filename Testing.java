public class Testing {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();

        ll.InsertAtBeg(9);
        ll.InsertAtBeg(8);
        ll.InsertAtBeg(7);
        ll.InsertAtBeg(6);
        ll.InsertAtBeg(5);
        ll.InsertAtBeg(4);
        ll.InsertAtBeg(4);
        ll.InsertAtBeg(3);
        ll.InsertAtBeg(2);
        ll.InsertAtBeg(1);

        ll.deleteAtAnyPos(3);
        
        System.out.println("Searching the element 7::" + " " +(ll.search(7)));

        ll.update(8, 10);

        ll.get(5);

        System.out.println("Displaying the list");

        ll.display();
    }
}
