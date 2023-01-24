package AdditionPalindrome;

import java.util.Scanner;

public class AdditionTillPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        First fi = new First();
        fi.till(n);
    }
}
