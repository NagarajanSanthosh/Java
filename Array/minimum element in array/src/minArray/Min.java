package minArray;

import java.util.Scanner;

public class Min {
    static void display(int min){
        System.out.print(min);
    }
    static int array(int n, int[] a){
        int min = a[0];
        for(int i=1;i<n;i++){
            int k=a[i];
            if(k<min){
                min =k;
            }
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] a = new int[n];
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int ans =array(n,a);
        display(ans);
    }
}
