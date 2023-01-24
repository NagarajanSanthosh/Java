package Add1stLast;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();
        First fi = new First();
        fi.fLarm(a, b);
    }
}
