package DoublyLinkedList;
public class Doubly {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtBeginnig(2);
        list.display();
        System.out.println();
        list.insertAtBeginnig(9);
        list.display();
        System.out.println();
        list.insertAtBeginnig(5);
        list.display();
        list.displayRev();
        System.out.println();
        list.insertAtPosition(3,7);
        list.display();
        list.displayRev();
        System.out.println();
        list.search(7);
        list.deleteAtBeginning();
        list.display();
        list.displayRev();
        System.out.println();
        list.deleteAtPos(2);
        list.display();
        list.displayRev();
    }
}