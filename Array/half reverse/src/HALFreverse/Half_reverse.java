package HALFreverse;
import java.util.Scanner;
public class Half_reverse {
    static void display(int n, int[] a){
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
    static void half_Rev(int n , int[]a){

        int h=n/2,j=n-1;
        for(int i=h;i<j;i++){
            int temp= a[i];
            a[i]=a[j];
            a[j]=temp;
            j--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[]a= new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        half_Rev(n,a);
        display(n,a);
    }
}
