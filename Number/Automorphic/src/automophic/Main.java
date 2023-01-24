package automophic;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        First fi = new First();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fi.Automorphic(n);
    }
}