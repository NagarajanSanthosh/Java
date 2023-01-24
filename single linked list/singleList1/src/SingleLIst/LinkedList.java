package SingleLIst;
public class LinkedList {
    Node head;
    static class Node {
        int data;
        Node next;
        Node(int val) {
            data = val;
            next = null;
        }
    }
    LinkedList() {
        head = null;
    }
    public void insertAtBeginning(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
        } else {
            //list is not empty
            newNode.next = head;
            head = newNode;
        }
    }
    public void insertAtPos(int pos, int val) {
        if (pos == 0) {
            insertAtBeginning(val);
            return;
        }
        Node newNode = new Node(val);
        Node temp = head;
        for (int i = 1; i < pos; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;//jump
        }
    }
    public void deleteAtPos(int pos) {
        if(pos==0){
            deleteAtBeginning();
            return;
        }
        Node temp = head;
        Node prev = null;
        for (int i = 1; i <=pos; i++) {
            prev = temp;//keep track of prev node
            temp = temp.next;//jump to next node
        }
         prev.next =temp.next;
    }
    public  void deleteAtBeginning(){
        if(head == null)
            throw new IndexOutOfBoundsException("Deletion attempted on empty list");
        head = head.next;
    }
    public void search(int val){
        Node temp = head;
        int i =1;
        boolean flag = false;
        if(head==null){
            System.out.println("List is empty");
        }
        else{
            while(temp!=null){
                if(temp.data==val){
                    flag=true;
                    break;
                }
                i++;
                temp= temp.next;
            }
        }
        if(flag)
            System.out.println("search element is in the position "+i);
        else
            System.out.println("Element isn't present");
    }
}