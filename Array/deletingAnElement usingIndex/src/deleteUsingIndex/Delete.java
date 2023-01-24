package deleteUsingIndex;

import java.util.Scanner;

public class Delete {
    static void display(int n, int[] a){
        for (int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
    static void delete(int n, int[]a, int index){
        for (int i=index+1;i<n;i++){
            a[i-1]=a[i];
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] a = new int[n];
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int index=sc.nextInt();
        if(index<=n) {
            delete(n, a, index);
            n--;
            display(n, a);
        }
        else
            System.out.println("exceeded limit");
    }
}
