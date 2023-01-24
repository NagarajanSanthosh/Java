package rTraversal;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a= new int[n];
        for(int i=0;i<n;i++){
            a[i]= sc.nextInt();
        }
        First fi =new First();
        fi.pri(n, a);
    }
}
