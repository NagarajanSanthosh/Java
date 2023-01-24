package RevWnA;

import java.util.Scanner;

public class RwoNA {
    static void revWona(int n, int a[]){
        int j=n-1; //4
        for(int i=0;i<j;i++){
            int temp=a[i]; //5-->4-->3-->2-->1
            a[i]=a[j];//1-->2-->3-->4-->5
            a[j]=temp; ////5-->4-->3-->2-->1
            j--;//3-->2-->1-->0
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i]= sc.nextInt(); // 5 4 3 2 1
        }
        revWona(n, a);
    }
}
