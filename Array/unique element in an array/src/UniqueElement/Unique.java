package UniqueElement;
import java.util.Scanner;
public class Unique {
    static void unique(int n, int[] a){
        int[] b = new int[n];
       for(int i=0;i<n;i++){
           int count =1;
           while (b[i] != -1) {
               for (int j =i+1;j<n;j++){
                   if(a[i]==a[j]){
                       count++;
                       b[j]=-1;
                   }
               }
               b[i]=count;
               break;
           }
       }
        for (int i=0;i<n;i++)
            System.out.print(b[i]+" ");
        System.out.println();
        System.out.print("Unique ");
        for(int i =0;i<n;i++){
            if(b[i]==1)
                System.out.print(a[i]);
        }
        System.out.println();
        System.out.print("Duplicate ");
        for(int i=0;i<n;i++){
            if(b[i]>1)
                System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println("Frequency =");
        for(int i=0;i<n;i++){
            if (b[i]!=-1)
                System.out.println(a[i]+"="+b[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]a=new int[n];
        for (int i=0;i<n;i++)
            a[i]=sc.nextInt();
        unique(n,a);
    }
}