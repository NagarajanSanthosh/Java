package SortedArray;

import java.util.Scanner;

public class Sort {
    static void display(int ans){
        if(ans==0)
            System.out.println("sorted array");
        else
            System.out.println("unsorted array");
    }
    static int sortArray(int n, int[] b){
        int sort =0;
        for (int i=1;i<n;i++){
            if(b[i]<b[i-1]){
                sort++;
                break;
            }
        }
        return sort;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] a = new int[n];
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int ans =sortArray(n, a);
        display(ans);
    }
}
