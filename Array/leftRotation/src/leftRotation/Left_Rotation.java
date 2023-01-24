package leftRotation;
import java.util.Scanner;
public class Left_Rotation {
    static void display(int n, int[]a){
        for (int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
    static void left(int n, int[] a , int key){
        while(key!=0){
            int y=a[n-1];
            for (int i=n-1;i>0;i--){
                a[i]=a[i-1];
            }
            a[0]=y;
            key--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int key = sc.nextInt();
        left(n,a,key);
        display(n,a);
    }
}
