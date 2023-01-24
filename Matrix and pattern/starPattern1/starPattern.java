import java.util.*;
public class starPattern{
     static void pattern(int n){
        for(int i=1;i<=n;i++){
           System.out.print("* ");
           if(i==n){
              System.out.println("");
              i=0;
              n--;
           }
           }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        pattern(n);
        }
    }
