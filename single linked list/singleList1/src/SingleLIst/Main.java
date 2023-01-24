package SingleLIst;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Node no = new Node();
        LinkedList list = new LinkedList();

        list.insertAtBeginning(7);
        list.insertAtBeginning(10);

        list.insertAtPos(1,16);
        list.insertAtPos(3,2);
        list.display();
        list.deleteAtPos(0);
        System.out.println();
        list.display();
        System.out.println();

        int n = sc .nextInt();
        list.search(n);
    }
}
