package sumOfElements;

import java.util.Scanner;

public class sumArray {
    static void display(int sum){
        System.out.print(sum);
    }
    static int sumOf(int n, int[]a){
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=a[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int ans=sumOf(n,a);
        display(ans);
    }
}
