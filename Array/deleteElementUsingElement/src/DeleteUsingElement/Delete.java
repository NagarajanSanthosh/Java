package DeleteUsingElement;

import java.util.Scanner;

public class Delete {
    static void display(int n, int[]a){
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
    static int findIndex(int n, int[]a, int element){
        int index =-1;
        for(int i=0;i<n;i++){
            if(a[i]==element){
                index =i;
                break;
            }
        }
        return index;
    }
    static void delete(int n, int[]a, int index){
        for(int i=index+1;i<n;i++){
            a[i-1]=a[i];
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[]a= new int[n];
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        try {
            int element = sc.nextInt();
            int ans = findIndex(n, a, element);
            delete(n, a, ans);
            n--;
            display(n, a);
        }
        catch (ArrayIndexOutOfBoundsException e ){
            System.out.println("Element isn't present");
        }
    }
}
