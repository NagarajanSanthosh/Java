package linearSearch;
import java.util.Scanner;
public class LinearSearch {
    static void display(int ans){
        if(ans==0)
            System.out.print("Element not found");
        else
            System.out.println(ans);
    }
    static int linear(int n, int[]a, int key){

        int index=0;
        for (int i=0;i<n;i++){
            if(a[i]==key){
                index = i;
                break;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int key = sc.nextInt();
        int ans = linear(n, a, key);
        display(ans);
    }
}
