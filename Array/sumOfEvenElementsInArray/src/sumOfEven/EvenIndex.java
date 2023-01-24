package sumOfEven;

import java.util.Scanner;

public class EvenIndex {
    static void display(int sum){
        System.out.println(sum);
    }
    static int EvenSum(int n, int[] a){
        int sum=0;
        for (int i=0;i<n;i++){
            if(i%2==0){
                sum+=a[i];
            }
        }

        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] a = new int[n];
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int ans = EvenSum(n,a);
        display(ans);
    }
}
