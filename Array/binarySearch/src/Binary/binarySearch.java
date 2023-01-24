package Binary;
import java.util.Scanner;
public class binarySearch {
    static void display(int ans){
        if(ans==-1)
        System.out.println("Element not found");
        else
    System.out.println(ans);
    }
    static int bi(int n, int[] a, int key){
        int l=0, h=n-1 , index =-1;
        while(l<=h){
            int mid =(l+h)/2;
            if(a[mid]==key){
                 index=mid;
                 break;
            } else if (a[mid]>key) {
                h=mid-1;
            }
            else l=mid+1;
        }
        return index;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int n= sc.nextInt();
         int[] a = new int[n];
         for (int i=0;i<n;i++){
             a[i]=sc.nextInt();
         }
         int key = sc.nextInt();
         int ans=bi(n,a,key);
         display(ans);
    }
}
