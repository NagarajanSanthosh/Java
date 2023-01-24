package Reversing;

import java.util.Scanner;
class First{
    void reverse(int n, int a[]){
        int b[]=new int[n];
        int j=0;
        for(int i=n-1;i>=0;i--){
            b[j]=a[i];
            j++;
        }
        for(int i=0;i<n;i++){
            a[i]=b[i];
            System.out.print(a[i]+" ");
        }
    }
}
public class Rev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[]= new int[n];
        for(int i=0;i<n;i++){
            a[i]= sc.nextInt();
        }
        First fi= new First();
        fi.reverse(n,a);
    }
}
