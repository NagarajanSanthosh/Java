package DoublyLinkedList;
public class LinkedList {
    Node head;
    Node tail;
    static class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data = data;
            next = null;
            prev = null;
        }
    }
    LinkedList(){
        head = null;
        tail = null;
    }
    public void insertAtBeginnig(int val){
        Node newNode = new Node(val);
        if(head == null)
            tail = newNode;
        else {
            head.prev = newNode;
            newNode.next = head;
        }
        head = newNode;
    }
    public void insertAtPosition(int pos, int val){
        if (pos==0){
            insertAtBeginnig(val);
            return;
        }
        Node newNode = new Node(val);
        Node current = head;
        for(int i=1;i<pos;i++){
            current = current.next;
        }
        newNode.next=current.next;
        newNode.prev=current;
        if(current==tail) {
            current.next = newNode;
            tail=newNode;
        }
        else
            current.next.prev=newNode;
    }
    public void display(){
        Node current = head;
        while(current!=null){
            System.out.print(current.data+" ");
            current= current.next;
        }
    }
    public void displayRev(){
        System.out.println();
       // System.out.println("tail  "+tail.data);
        Node current = tail;
        while(current!=null){
            System.out.print(current.data+" ");
            current = current.prev;
        }
    }
    public void search(int val) {
        Node temp = head;
        int i=1;
        boolean flag = false;
        if(temp==null)
            System.out.println("Empty list");
        else {
            while (temp != null) {
                if (temp.data == val) {
                    flag = true;
                    break;
                }
                temp = temp.next;
                i++;
            }
        }
        if (flag)
            System.out.println("Element "+val+" is at "+i);
        else
            System.out.println("Element is not present");
    }
    public void deleteAtBeginning(){
        if (head==null) throw new IndexOutOfBoundsException("Cannot read field \"next\" because \"this.head\" is null");
        head = head.next;
            if (head==null)
                tail=null;
            else
                head.prev=null;
            System.out.println("Deletion succeed");
    }
    public void deleteAtPos(int pos){
        if (head==null)
            throw new IndexOutOfBoundsException("Deletion attempted on empty list");
        if(pos==0){
            deleteAtBeginning();
            return;
        }
        Node temp = head;
        Node previous = null;
        for (int i=1;i<=pos;i++){
            previous = temp;//keep track of prev node
            temp= temp.next;// jump to next node
            if (temp==null)
                throw new IndexOutOfBoundsException
                        ("Invalid position");
        }
        previous.next = temp.next;// reassign pointers
        if (temp.next==null)
            tail = previous;
        else
            temp.next.prev=previous;
        System.out.println("Deletion succeed");
    }
}