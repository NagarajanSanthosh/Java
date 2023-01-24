package Right_rotation;

import java.util.Scanner;

public class Right {
    static void display(int n, int[]a){
        for(int i=0;i<n;i++){
        System.out.print(a[i]+" ");
        }
    }
    static void right_rotate(int n, int[] a, int key) {
        if (key <= n) {
            while (key != 0) {
                int y = a[0];
                for (int i = 0; i < n - 1; i++) {
                    a[i] = a[i + 1];
                }
                a[n - 1] = y;
                key--;
            }
        }
        else
            System.out.println("rotation element should be less than or equal to size of an array");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]a= new int[n];
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int key = sc.nextInt();
        right_rotate(n,a,key);
        display(n,a);

    }
}
